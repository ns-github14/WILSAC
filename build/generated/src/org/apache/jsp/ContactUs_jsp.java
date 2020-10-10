package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write(".navigation-bar {\n");
      out.write("    width: 100%;  /* i'm assuming full width */\n");
      out.write("    height: 80px; /* change it to desired width */\n");
      out.write("    background-color: red; /* change to desired color */\n");
      out.write("}\n");
      out.write("    ul  {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0px;\n");
      out.write("  padding: 0px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("li  {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change the link color to #111 (black) on hover */\n");
      out.write("li a:hover {\n");
      out.write("  background-color:grey;\n");
      out.write("}\n");
      out.write("    .footer {\n");
      out.write("  background-color: #333;\n");
      out.write("  margin-top:15px;\n");
      out.write("  padding:10px 30px;\n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("} \n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("    /* Create two equal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("  padding: 10px;\n");
      out.write("  height: auto; /* Should be removed. Only for demonstration */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul>\n");
      out.write("        <li><a><img src=\"C:\\Users\\This PC\\Desktop\\salon\\images\\174857.png\" style=\"height:30px; width:30px; padding-rigth:500px;\"></a></li>\n");
      out.write("        <li style=\"padding-left:800px;\"><a class=\"active\" href=\"Home.jsp\">Home</a></li>\n");
      out.write("        <li><a class=\"active\" href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("        <li><a class=\"active\" href=\"Login.jsp\">Login</a></li>\n");
      out.write("        <li><a class=\"active\" href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("   </ul>\n");
      out.write("    <br><br><br>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<left><font face=\"arial\"size=7><b>ABOUT US</b></font></left><br><br> \n");
      out.write("    <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Wappers</h2>\n");
      out.write("    <img src=\"C:\\Users\\neelanshi sharma\\Desktop\\corona.jpg\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("      <p>Some text..</p><br><p><b>Contact:</b>123456789</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Innovocation</h2>\n");
      out.write("    <img src=\"wilimg/images%20(1).png\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Logos</h2>\n");
      out.write("    <img src=\"wilimg/images%20(1).png\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Samarthaya</h2>\n");
      out.write("    <img src=\"wilimg/images%20(1).png\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Aayam</h2>\n");
      out.write("    <img src=\"wilimg/images%20(1).png\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     <div class=\"row\">\n");
      out.write("  <div class=\"column\" style=\"background-color:#aaa;\">\n");
      out.write("    <h2>Corona</h2>\n");
      out.write("    <img src=\"wilimg/images%20(1).png\" height=\"300px\" width=\"300px\" margin-left=\"20px\"><br>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\" style=\"background-color:#bbb;\">\n");
      out.write("    <h2>Description</h2>\n");
      out.write("    <p>Some text..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"footer\">\n");
      out.write("       <ul>\n");
      out.write("        <li><font size=\"5\" face=\"arial\">Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font></li>\n");
      out.write("       </ul>\n");
      out.write("       \n");
      out.write("        <p>&copy WILSAC-The Online Registration Platform By  MNM Group</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
