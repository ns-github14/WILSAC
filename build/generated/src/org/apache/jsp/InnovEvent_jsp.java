package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class InnovEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Team Innovacation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"Team Innovacation\" method=\"post\">\n");
      out.write("        <style>\n");
      out.write("            table, th, td {\n");
      out.write("                padding: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h1>Event | INNOVACATION </h1>\n");
      out.write("        (tagline)\n");
      out.write("        (club description)\n");
      out.write("        <table style=\"width:100%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th>Event Name</th>\n");
      out.write("                    </tr>\n");
      out.write("        ");

            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery("select Edate, EName from Event");
                while(rs.next())
                {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
out.println(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td><a href=\"Registration.jsp\">\n");
      out.write("                        ");
out.println(rs.getString(2));
      out.write("\n");
      out.write("                        </a></td>\n");
      out.write("                </tr>       \n");
      out.write("               ");
}
            }
            catch(Exception e)
            {
                    
            }
        
      out.write("\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
