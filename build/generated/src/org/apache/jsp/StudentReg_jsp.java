package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.*;
import java.sql.*;

public final class StudentReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");

    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    String uname=request.getParameter("username"); 
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")){
        response.sendRedirect("Login.jsp");
    }

      out.write("\n");
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
      out.write("table{\n");
      out.write("    text-align: left;\n");
      out.write("    color: white;\n");
      out.write("    font-size: medium;\n");
      out.write("}\n");
      out.write("tr, td{\n");
      out.write("    padding: 10px;\n");
      out.write("    text-align: left;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form method=\"post\">\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\"onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("    <a href=\"Logout.jsp?username=");
      out.print(uname);
      out.write("\" onclick=\"return confirm('Are you sure you want to LogOut?')\"><b>Logout</b></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"Dashboard.jsp?username=");
      out.print( uname);
      out.write("\">Profile</a>\n");
      out.write("    <a href=\"Logout.jsp?username=");
      out.print( uname);
      out.write("\" onclick=\"return confirm('Are you sure you want to LogOut?')\">Home</a>\n");
      out.write("    <a href=\"AboutUs.jsp?username=");
      out.print( uname);
      out.write("\">About Us</a>\n");
      out.write("    <a href=\"ContactUs.jsp?username=");
      out.print( uname);
      out.write("\">Contact Us</a>\n");
      out.write("</div><br>\n");
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
      out.write("<div id=\"main\">\n");
      out.write("    <center>\n");
      out.write("        <font size=7 face=\"arial\" color=\"white\"><b>Event Registeration</b></font>\n");
      out.write("    </center><br><br>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=5>Name:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"name\" size=\"50px\" placeholder=\"ABC\" required></td>\n");
      out.write("            </tr>\n");
      out.write("       \t    <tr>\n");
      out.write("                <td><font size=5>College Id:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"clgid\" size=\"50px\" placeholder=\"BTBT...\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=5>Course:</font></td> \n");
      out.write("                <td><select name=\"course\" style=\"width:80px\">\n");
      out.write("                    <option value=\"B.Tech CS\">B.Tech CS</option>\n");
      out.write("                    <option value=\"B.Tech IT\">B.Tech IT</option>\n");
      out.write("                    <option value=\"B.Tech EC\">B.Tech EC</option>\n");
      out.write("                    <option value=\"B.Tech EI\">B.Tech EI</option>\n");
      out.write("                    <option value=\"B.Tech EE\">B.Tech EE</option>\n");
      out.write("                    <option value=\"B.Tech CE\">B.Tech CE</option>\n");
      out.write("                    <option value=\"B.Tech BT\">B.Tech BT</option>\n");
      out.write("                    <option value=\"B.Tech MT\">B.Tech MT</option>\n");
      out.write("                    <option value=\"M.Tech CS\">M.Tech CS</option>\n");
      out.write("                    <option value=\"M.Tech IT\">M.Tech IT</option>\n");
      out.write("                    <option value=\"M.Tech VLSI\">M.Tech VLSI</option>\n");
      out.write("                    <option value=\"M.Tech Remote Sensing\">M.Tech Remote Sensing</option>\n");
      out.write("                    <option value=\"BCA\">BCA</option>\n");
      out.write("                    <option value=\"MCA\">MCA</option>\n");
      out.write("                    <option value=\"BSc.\">BSc.</option>\n");
      out.write("                    <option value=\"Msc.\">MSc.</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\t\t\n");
      out.write("                <td><font size=5>Semester:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"semester\" size=\"50px\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=5>Contact No.</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"contact\" required=\"required\" pattern=\"[7-9][0-9]{9}\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><br>\n");
      out.write("        <input type=\"submit\" name=\"Done\" value=\"Done\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\"><br>    \n");
      out.write("    </center>\n");
      out.write("    <br><br><br>\n");
      out.write("</div>\n");
try{
    int eid=Integer.parseInt(request.getParameter("eid"));
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    ResultSet r=st.executeQuery("select * from Student where uname='"+uname+"'");
    if(r.next()){
        Statement s=conn.createStatement();
        int i=s.executeUpdate("insert into Temp values('"+r.getString(8)+"',"+eid+",'No')");
        ResultSet rs=s.executeQuery("select amount from Event where eid="+eid+"");
        while(rs.next()){
            if(rs.getInt(1)>0)
                response.sendRedirect("Payment.jsp?username="+uname+"&eid="+eid);
            else{
                i=st.executeUpdate("update Temp set payment='Yes' where eid="+eid+" and clgid='"+r.getString(8)+"'");
                response.sendRedirect("ClubList.jsp?username="+uname);
            } 
        }
    }
    if(request.getParameter("Done")!=null){
        String name=request.getParameter("name");
        String id=request.getParameter("clgid");
        String course=request.getParameter("course");
        int sem=Integer.parseInt(request.getParameter("semester")); 
        String contact=request.getParameter("contact");
        r=st.executeQuery("select email from Login where username='"+uname+"'");
        while(r.next()){
            int i=st.executeUpdate("insert into Student values('"+name+"',"+sem+",'"+r.getString(1)+"','"+contact+"','"+course+"','"+uname+"','No','"+id+"')");
            if(i>0){
                Statement s=conn.createStatement();
                ResultSet rs=s.executeQuery("select amount from Event where eid="+eid+"");
                while(rs.next()){
                    if(rs.getInt(1)>0)
                        response.sendRedirect("Payment.jsp?username="+uname+"&eid="+eid);
                    else{
                        i=st.executeUpdate("update Temp set payment='Yes' where eid="+eid+" and clgid='"+id+"'");
                        response.sendRedirect("ClubList.jsp?username="+uname);
                    } 
                }
            }
            else
                out.println("try again");
        }
    }    
}
catch(Exception e){
}
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <font size=\"5\" face=\"arial\" color=\"white\"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>\n");
      out.write("        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group\n");
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
      out.write("</footer>\n");
      out.write("</form>\n");
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
