package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.*;

public final class EventDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Event Detail</title>\n");

    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    String uname = request.getParameter("username"); 
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
      out.write("}\n");
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
      out.write(".row {\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write(".column {\n");
      out.write("  flex: 50%;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("table, th{\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: large;\n");
      out.write("    alignment-adjust: central;\n");
      out.write("}\n");
      out.write("tr, td{\n");
      out.write("    padding: 15px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    alignment-adjust: central;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form name=\"Event Detail\" method=\"Post\">\n");

    String ename=request.getParameter("event");
    String user=request.getParameter("user");

      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\" onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("    <a href=\"Logout.jsp?username=");
      out.print( uname);
      out.write("\" onclick=\"return confirm('Are you sure?')\"><b>Logout</b></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"Logout.jsp?username=");
      out.print( uname);
      out.write("\" onclick=\"return confirm('Are you sure you want to LogOut?')\">Home</a>\n");
      out.write("    ");
if(user.equals("admin")){
      out.write("\n");
      out.write("    <a href=\"Admin.jsp\">\n");
      out.write("        Club List\n");
      out.write("    </a>\n");
      out.write("    ");
}
    else{
      out.write("\n");
      out.write("    <a href=\"Dashboard.jsp?username=");
      out.print( uname);
      out.write("\">\n");
      out.write("        Profile\n");
      out.write("    </a>\n");
      out.write("        ");
if(user.equals("Member")){
      out.write("\n");
      out.write("    <a href=\"ClubList.jsp?username=");
      out.print( uname);
      out.write("\">Event Registration</a>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
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

    int eid=0;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement(); 
    ResultSet rs=st.executeQuery("select * from Event where EName='"+ename+"'");
    while(rs.next()){
        eid=rs.getInt(1);
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <center><img src=\"");
      out.print( rs.getString(10));
      out.write("\" height=\"500\"></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <font color=\"white\" size=\"4\">\n");
      out.write("                <br><br>\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Name: </b>");
      out.print( rs.getString(2));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Description: </b>");
      out.print( rs.getString(3));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Category: </b>");
      out.print( rs.getString(7));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Date: </b>");
      out.print( rs.getString(4));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Time: </b>");
      out.print( rs.getString(5));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Venue: </b>");
      out.print( rs.getString(6));
      out.write("\n");
      out.write("                <br><br>&nbsp;&nbsp;&nbsp;<b>Amount: </b>");
      out.print( rs.getString(8));
      out.write("\n");
      out.write("            </font>\n");
      out.write("        ");
if(user.equals("student"))
        {
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" name=\"reg\" value=\"Get Registered\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:250px\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            ");

            if(request.getParameter("reg")!=null){
                Statement t=conn.createStatement();
                ResultSet r=t.executeQuery("select clgid from Student where Uname='"+uname+"'");
                if(r.next()){
                    Statement t1=conn.createStatement();
                    ResultSet r2=t1.executeQuery("select * from Temp where clgid='"+r.getString(1)+"' and Eid="+eid+"");
                    if(r2.next()){
      out.write("\n");
      out.write("    <center><font color=\"white\">You are already registered for this event</font></center>\n");
      out.write("                    ");
}
                    else
                        response.sendRedirect("StudentReg.jsp?username="+uname+"&eid="+eid); 
                }
                else
                    response.sendRedirect("StudentReg.jsp?username="+uname+"&eid="+eid);      
            }
        }
        if(user.equals("member") || user.equals("admin") || user.equals("mentor")){
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" name=\"viewreg\" value=\"View Registerations\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:250px\">&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"submit\" name=\"update\" value=\"Update\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\">&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"submit\" name=\"delete\" value=\"Delete\" onclick=\"return confirm('Are you sure?')\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\">&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            ");
if(request.getParameter("viewreg")!=null){
      out.write("\n");
      out.write("    <br><br><center>\n");
      out.write("    <table style=\"width:100%\">\n");
      out.write("        <tr>\n");
      out.write("            <th><b>Name</b></th>\n");
      out.write("            <th><b>Year</b></th>\n");
      out.write("            <th><b>Email</b></th>\n");
      out.write("            <th><b>College-ID</b></th>\n");
      out.write("            <th><b>Phone</b></th>\n");
      out.write("            <th><b>Course</b></th>\n");
      out.write("        </tr>\n");
      out.write("                ");
Statement t=conn.createStatement();
                ResultSet s=t.executeQuery("select clgid from Temp where eid="+eid+"");
                while(s.next()){
                    Statement t1=conn.createStatement();
                    ResultSet s1=t1.executeQuery("select * from Student where clgid='"+s.getString(1)+"' order by sname");
                    while(s1.next()){
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( s1.getString(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( s1.getInt(2));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( s1.getString(3));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( s1.getString(8));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( s1.getString(4));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( s1.getString(5));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("                    ");
}
                }
      out.write("\n");
      out.write("    </table>\n");
      out.write("    </center>\n");
      out.write("            ");
}
            if(request.getParameter("update")!=null){
                response.sendRedirect("MemberAction.jsp?action=update&user="+user+"&username="+uname+"&event="+eid);
            }
            if(request.getParameter("delete")!=null){
                Statement t=conn.createStatement();
                int i=t.executeUpdate("delete from Temp where eid="+eid+"");
                File f=new File("C:/Users/neelanshi sharma/Documents/NetBeansProjects/WILSAC/web/"+rs.getString(10));
                f.delete();
                i=t.executeUpdate("delete from Event where ename='"+ename+"'");
                if(i>0)
                    response.sendRedirect("Event.jsp?target="+uname+"&username="+uname+"&user="+user);
            }
        }
    }

      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <font size=\"5\" face=\"arial\" color=\"white\"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>\n");
      out.write("        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group\n");
      out.write("    </div>\n");
      out.write("<button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\">Top</button>\n");
      out.write("<script>\n");
      out.write("function change() // no ';' here\n");
      out.write("{\n");
      out.write("    var elem = document.getElementById(\"pay\");\n");
      out.write("    if (elem.value===\"Pay\") elem.innerHTML = \"Paid\";\n");
      out.write("    else elem.innerHTML = \"Paid\";\n");
      out.write("}\n");
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
