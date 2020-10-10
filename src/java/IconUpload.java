/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import static java.lang.System.out;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author neelanshi sharma
 */
@WebServlet("/IconUpload")
@MultipartConfig(fileSizeThreshold=1024*1024*2, maxFileSize=1024*1024*10, maxRequestSize=1024*1024*50)
public class IconUpload extends HttpServlet {
    private static final String SAVE_DIR="images";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        response.setContentType("text/html;charSet=UTF-8");
        String name=request.getParameter("name");
        String target=request.getParameter("target");
        String user=request.getParameter("user");
        String cname=request.getParameter("cname");
        String uname=request.getParameter("username");
        PrintWriter outt=response.getWriter();
        Part filePart=request.getPart("img");
        String savePath="";
        String path="C:\\Users\\neelanshi sharma\\Documents\\NetBeansProjects\\WILSAC\\web"+File.separator+SAVE_DIR;
        File file=new File(path);
        String fileName=extractFileName(filePart);
        OutputStream out=null;
        InputStream fileContent=null;
        PrintWriter writer=response.getWriter();
        try{
            out=new FileOutputStream(new File(path+File.separator+fileName));
            fileContent=filePart.getInputStream();
            int read=0;
            final byte[] bytes=new byte[1024];
            while((read=fileContent.read(bytes))!=-1)
                out.write(bytes,0,read);
            savePath=path+"/"+fileName;
            String DirPlusFileName=null;
            DirPlusFileName=SAVE_DIR+File.separator+fileName;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
            Statement st=conn.createStatement();
            if(target.equals("club"))
            {
                int x=st.executeUpdate("update Club set Icon='"+DirPlusFileName+"' where cname='"+name+"'");
                if(x>0)
                    response.sendRedirect("Admin.jsp");
                else
                    outt.println("error");
            }
            if(target.equals("event"))
            {
                int x=st.executeUpdate("update Event set Poster='"+DirPlusFileName+"' where ename='"+name+"'");
                if(x>0)
                    response.sendRedirect("Event.jsp?username="+uname+"&target="+cname+"&user="+user);
                else
                    outt.println("error");
            }
        }
        catch(Exception e)
        {
            
        }
    }
    private String extractFileName(Part part)
    {
        final String partHeader=part.getHeader("content-disposition");
        for(String content : partHeader.split(";"))
        {
            if(content.trim().startsWith("filename"))
            {
                return content.substring(content.indexOf('=')+1).trim().replace("\"", "");
            }
        }
        return null;
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
