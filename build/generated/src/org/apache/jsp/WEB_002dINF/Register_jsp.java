package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>REGISTER</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>User Register Form</h1>\n");
      out.write("        <form action=\"Register\" method=\"post\">     \n");
      out.write("\t\t\t<table style=\"with: 50%\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>UserName</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"username\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"password\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Confirm Password</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"confirm_password\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Role<select name=\"role\">\n");
      out.write("                                            <option value=\"student\">Student</option>\n");
      out.write("                                            <option value=\"mentor\">Mentor</option>\n");
      out.write("                                            <option value=\"member\">Member</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        </td>\n");
      out.write("\t\t\t\t</tr></table>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Submit\" /></form>\n");
      out.write("</body>\n");
      out.write("</html>\n");

    try
    {
      if(request.getParameter("submit")!=null)
      { String uname=request.getParameter("username");
        String pass=request.getParameter("password");
        String cpass=request.getParameter("cpassword");
        String role=request.getParameter("role");
        if(uname.isEmpty() || pass.isEmpty() || cpass.isEmpty() || role.isEmpty() || pass.equals(cpass))
        {
            response.sendRedirect("Register.jsp");
        }
	else
	{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
            Statement st=conn.createStatement();
            int i=st.executeUpdate("insert into Login values('"+uname+"','"+pass+"','"+role+"')");
            out.println("Data is successfully inserted!");
            response.sendRedirect("Home.jsp");
        }
      }
    }
    catch(Exception e)
    {
        
    }

      out.write("    ");
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
