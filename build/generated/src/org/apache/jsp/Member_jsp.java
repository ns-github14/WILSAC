package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.*;

public final class Member_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Club Member Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"Club Member\" method=\"post\">\n");
      out.write("            <table style=\"with: 50%\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Event Name:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"ename\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Description:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"desc\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Date:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"date\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Time:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"time\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Venue:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"venue\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Category:<select name=\"category\">\n");
      out.write("                                            <option value=\"student\">Pen and Paper</option>\n");
      out.write("                                            <option value=\"mentor\">Submission</option>\n");
      out.write("                                            <option value=\"member\">Workshop</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Amount:</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"amount\" /></td>\n");
      out.write("\t\t\t\t</tr>\t\t\t\n");
      out.write("        </table>\n");
      out.write("            <input type=\"submit\" name=\"done\" value=\"Done\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    try{
        if(request.getParameter("done")!=null)
        {
            String name=request.getParameter("ename");
            String date=request.getParameter("date");
            String venue=request.getParameter("venue");
            String time=request.getParameter("time");
            String desc=request.getParameter("desc");
            String category=request.getParameter("category");
            int amount=Integer.parseInt(request.getParameter("amount")); 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
            Statement st=conn.createStatement();
            if( name.isEmpty() || date.isEmpty() || venue.isEmpty() || time.isEmpty() || desc.isEmpty() || category.isEmpty() || amount==0)
            {
                out.println("try again..");
            }
            else
            { 
              //select 
                int i=st.executeUpdate("insert into Event(ENAME,DESCRIPTION, DATE, TIME, VENUE, CATEGORY, AMOUNT) values('"+name+"','"+desc+"','"+date+"','"+time+"','"+venue+"','"+category+"',"+amount+")");
                if(i>0)
                    response.sendRedirect("ClubList.jsp");
                else
                    out.println("try again");
            }
        }
    }
    catch(Exception e)
    {
        
    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
