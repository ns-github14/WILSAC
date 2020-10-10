package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Objects;
import java.sql.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Login</title>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    font-family: \"Lato\", sans-serif;\n");
      out.write("    background-image: url('images/n.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-attachment: fixed; \n");
      out.write("    background-size: 100% 100%;\n");
      out.write("}\n");
      out.write(".sidenav {\n");
      out.write("    height: 100%;\n");
      out.write("    width: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    background-color: midnightblue;\n");
      out.write("    overflow-x: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    padding-top: 60px;\n");
      out.write("}\n");
      out.write(".sidenav a {\n");
      out.write("    padding: 8px 8px 8px 32px;\n");
      out.write("    text-decoration:  none;\n");
      out.write("    font-size: 25px;\n");
      out.write("    color: gainsboro;\n");
      out.write("    display: block;\n");
      out.write("    transition: 0.3s;\n");
      out.write("}\n");
      out.write(".sidenav a:hover {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write(".sidenav .closebtn {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 25px;\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-left: 50px;\n");
      out.write("}\n");
      out.write("#main {\n");
      out.write("    transition: margin-left .5s;\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("    .sidenav {padding-top: 15px;}\n");
      out.write("    .sidenav a {font-size: 18px;}\n");
      out.write("}\n");
      out.write(".topnav {\n");
      out.write("    list-style-type: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("    padding: 12px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: midnightblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("/* Style the links inside the navigation bar */\n");
      out.write(".topnav a {\n");
      out.write("    float: right;\n");
      out.write("    display: block;\n");
      out.write("    color: #f1f1f1;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("/* Change the color of links on hover */\n");
      out.write(".topnav a:hover {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("    font-size: 22px;\n");
      out.write("}\n");
      out.write("/* Add a color to the active/current link */\n");
      out.write(".topnav a.active {\n");
      out.write("    background-color: midnightblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("footer {\n");
      out.write("    background: midnightblue;\n");
      out.write("    margin-top:15px;\n");
      out.write("    padding:10px 30px;\n");
      out.write("    color:white;\n");
      out.write("} \n");
      out.write("footer #myBtn {\n");
      out.write("    display: none;\n");
      out.write("    position: fixed;\n");
      out.write("    bottom: 20px;\n");
      out.write("    right: 30px;\n");
      out.write("    z-index: 99;\n");
      out.write("    font-size: 18px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding: 15px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("footer #myBtn:hover {\n");
      out.write("    background-color: midnightblue;\n");
      out.write("}\n");
      out.write("table, th{\n");
      out.write("    text-align: left;\n");
      out.write("    color: white;\n");
      out.write("    font-size: medium;\n");
      out.write("}\n");
      out.write("tr, td{\n");
      out.write("    padding: 15px;\n");
      out.write("    text-align: left;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"post\">\n");
      out.write("    <div class=\"topnav\">\n");
      out.write("        <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\"onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("    </div>\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"Home.jsp\">Home</a>\n");
      out.write("    <a href=\"AboutUs.jsp\">About Us</a>\n");
      out.write("    <a href=\"ContactUs.jsp\">Contact Us</a>\n");
      out.write("</div><br><br>\n");
      out.write("<div id=\"main\">\n");
      out.write("    <center><font size=7 face=\"arial\" color=\"white\"><b>Login Here</b></font><br>\n");
      out.write("    <a href=\"Register.jsp\"><font size=3 color=\"white\">Not a Member Yet? Register Now..</font></a></center><br><br>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td><font size=5>Username:</font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\" size=50px placeholder=\"username\" required=\"required\"><br><br></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("        <td><font size=5>Password:</font></td>\n");
      out.write("        <td><input type=\"password\" name=\"password\" size=50px placeholder=\"password\" required=\"required\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("        </table><br><br>\n");
      out.write("        <input type=\"submit\" name=\"login\" value=\"Login\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px\"></form><br>\n");
      out.write("    <a href=\"Recovery.jsp\"><font size=3 color=\"white\">   Forgot Password?</font></a>\n");
      out.write("    </center>\n");
      out.write("    <br><br><br>\n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<script>\n");
      out.write("function openNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("    document.body.style.backgroundColor = \"rgba(0,0,0,0.2)\";\n");
      out.write("}\n");
      out.write("function closeNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft = \"0\";\n");
      out.write("    document.body.style.backgroundColor = \"white\";\n");
      out.write("}\n");
      out.write("</script> \n");

    try{
        String uname=request.getParameter("username");
        String pass=request.getParameter("password");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
        Statement st=conn.createStatement();
        if(request.getParameter("login")!=null)
        {
            ResultSet rs=st.executeQuery(" Select * from Login where username='"+uname+"' and password='"+pass+"' ");
            Boolean status=rs.next();
            if(status)
            {
                String s=rs.getString(3);
                if(Objects.equals(s, "Student"))
                    response.sendRedirect("ClubList.jsp");
                else if(Objects.equals(s, "Mentor"))
                {
                    ResultSet r=st.executeQuery("select clubname from Mentor where memail='"+rs.getString(4)+"'");
                    String cname=null;
                    while(r.next())
                    {
                        cname=r.getString(1);
                    }
                    response.sendRedirect("Event.jsp?target="+cname+"&user=mentor");
                }
                else if(Objects.equals(s, "Member"))
                {
                    ResultSet r=st.executeQuery("select cname from ClubMember where cmemail='"+rs.getString(4)+"'");
                    String cname=null;
                    while(r.next())
                    {
                        cname=r.getString(1);
                    }
                    response.sendRedirect("Event.jsp?target="+cname+"&user=member");
                }
                else
                    response.sendRedirect("Admin.jsp");
            }
            else
      out.write("\n");
      out.write("            <font size=3 color=\"white\">username or password is wrong</font>\n");
      out.write("        ");
;}
        if(request.getParameter("forget password")!=null)
        {
            response.sendRedirect("Recovery.jsp");
        }
    }
    catch(Exception e)
    {
        
    }

      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <ul>\n");
      out.write("        <li><font size=\"5\" face=\"arial\">Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font></li>\n");
      out.write("        </ul>\n");
      out.write("        <p>&copy WILSAC-The Online Registration Platform By  MNM Group</p>\n");
      out.write("    </div>\n");
      out.write("<button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\">Top</button>\n");
      out.write("<script>\n");
      out.write("//Get the button\n");
      out.write("var mybutton = document.getElementById(\"myBtn\");\n");
      out.write("// When the user scrolls down 20px from the top of the document, show the button\n");
      out.write("window.onscroll = function() {scrollFunction()};\n");
      out.write("function scrollFunction() {\n");
      out.write("    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\n");
      out.write("        mybutton.style.display = \"block\";\n");
      out.write("    } \n");
      out.write("    else {\n");
      out.write("        mybutton.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("// When the user clicks on the button, scroll to the top of the document\n");
      out.write("function topFunction() {\n");
      out.write("    document.body.scrollTop = 0;\n");
      out.write("    document.documentElement.scrollTop = 0;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</footer>  \n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
