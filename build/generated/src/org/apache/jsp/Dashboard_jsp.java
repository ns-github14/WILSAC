package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Dashboard</title>\n");

    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    String uname=request.getParameter("username"); 
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "") || uname == null || uname == ""){
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
      out.write("table, th{\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: large;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: large;\n");
      out.write("}\n");
      out.write("/* Avatar image */\n");
      out.write("img.avatar {\n");
      out.write("  width: 30%;  \n");
      out.write("  border-radius: 50%;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write(".row {\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write(".column {\n");
      out.write("  flex: 50%;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write(".dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write(".row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("[class*=\"col-\"] {\n");
      out.write("  float: left;\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: large;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: large;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-1 {width: 8.33%;}\n");
      out.write(".col-2 {width: 16.66%;}\n");
      out.write(".col-3 {width: 25%;}\n");
      out.write(".col-4 {width: 33.33%;}\n");
      out.write(".col-5 {width: 41.66%;}\n");
      out.write(".col-6 {width: 50%;}\n");
      out.write(".col-7 {width: 58.33%;}\n");
      out.write(".col-8 {width: 66.66%;}\n");
      out.write(".col-9 {width: 75%;}\n");
      out.write(".col-10 {width: 83.33%;}\n");
      out.write(".col-11 {width: 91.66%;}\n");
      out.write(".col-12 {width: 100%;}\n");
      out.write("\n");
      out.write("/* Content */\n");
      out.write(".content {\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    font-size: small;\n");
      out.write("    font-family: \"Arial\";\n");
      out.write("    min-width: 200px;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 10px 15px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".dropdown-content a:hover {background-color: white;}\n");
      out.write(".dropdown:hover .dropdown-content {display: block;}\n");
      out.write(".dropdown:hover .dropbtn {background-color: grey;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"post\">\n");
      out.write("    ");

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement(),s1=conn.createStatement(),s2=conn.createStatement(),s3=conn.createStatement();
    ResultSet r=st.executeQuery("select type, email from Login where username='"+uname+"'"),r1,r2,r3;
    while(r.next()){
      out.write("\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\" onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("            <a href=\"Logout.jsp?username=");
      out.print( uname);
      out.write("\" onclick=\"return confirm('Are you sure?')\"><b>Logout</b></a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("            <a href=\"Logout.jsp?username=");
      out.print( uname);
      out.write("\" onclick=\"return confirm('Are you sure you want to LogOut?')\">Home</a>\n");
      out.write("            ");
if(r.getString(1).equals("Student")){
      out.write("\n");
      out.write("                <a href=\"ClubList.jsp?username=");
      out.print( uname);
      out.write("\">Club List</a>\n");
      out.write("            ");
}
            if(r.getString(1).equals("Member")){
      out.write("\n");
      out.write("                <a href=\"ClubList.jsp?username=");
      out.print( uname);
      out.write("\">Club List</a>\n");
      out.write("            ");
}
            if(r.getString(1).equals("Mentor")){
      out.write("\n");
      out.write("            <a href=\"MemberAction.jsp?username=");
      out.print( uname);
      out.write("&action=club&user=Mentor&event=0\">Club Details</a>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <a href=\"AboutUs.jsp?username=");
      out.print( uname);
      out.write("\">About Us</a>\n");
      out.write("            <a href=\"ContactUs.jsp?username=");
      out.print( uname);
      out.write("\">Contact Us</a>\n");
      out.write("        </div><br>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <img src=\"images/user.jpg\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <font color=\"white\" size=\"4\">\n");
      out.write("                        <b>Username: </b>\n");
      out.write("                        <input type=\"text\" name=\"uname\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( uname);
      out.write("\"><br>\n");
      out.write("            ");
if(r.getString(1).equals("Student")){
                r1=s1.executeQuery("select * from Student where uname='"+uname+"'");
                if(r1.next()){
      out.write("\n");
      out.write("                        <b>Year: </b>\n");
      out.write("                        <input type=\"text\" name=\"sem\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getInt(2));
      out.write("\"><br>\n");
      out.write("                        <b>Course: </b>\n");
      out.write("                        <input type=\"text\" name=\"course\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(5));
      out.write("\"><br>\n");
      out.write("                        <b>Email-ID: </b>\n");
      out.write("                        <input type=\"text\" name=\"email\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(3));
      out.write("\"><br>\n");
      out.write("                        <b>Contact: </b>\n");
      out.write("                        <input type=\"text\" name=\"contact\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(4));
      out.write("\"><br><br>\n");
      out.write("                        <input type=\"submit\" name=\"save\" value=\"Save Changes\" style=\"font-size:15px;color:white;background-color:midnightblue;width:150px\">\n");
      out.write("                        <br>\n");
      out.write("                    </font>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    ");

                    if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', "
                                + "username='"+request.getParameter("uname")+"' where username='"+uname+"'");
                        i=s.executeUpdate("update Student set sphone='"+request.getParameter("contact")+"', "
                                + "semail='"+request.getParameter("email")+"', course='"+request.getParameter("course")+"', "
                                + "uname='"+request.getParameter("uname")+"', semester="+Integer.parseInt(request.getParameter("sem"))+" "
                                + "where clgid='"+r1.getString(7)+"'");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    }
                    r2=s2.executeQuery("select * from Temp where clgid='"+r1.getString(7)+"'");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <font color=\"white\" size=\"5\">You have registered for the following events:</font><br><br>\n");
      out.write("            <center>\n");
      out.write("                <table style=\"width:100%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th><b>Name</b></th>\n");
      out.write("                        <th><b>Description</b></th>\n");
      out.write("                        <th><b>Date</b></th>\n");
      out.write("                        <th><b>Time</b></th>\n");
      out.write("                        <th><b>Venue</b></th>\n");
      out.write("                        <th><b>Category</b></th>\n");
      out.write("                        <th><b>Club</b></th>\n");
      out.write("                    </tr>        \n");
      out.write("                    ");
while(r2.next()){
                        r3=s3.executeQuery("select * from Event where eid="+r2.getInt(2)+" order by date");
                        while(r3.next()){
                            Statement s4=conn.createStatement();
                            ResultSet r4=s4.executeQuery("select cname from Club where cid="+r3.getInt(9)+"");
                            while(r4.next()){
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( r3.getString(2));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r3.getString(3));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r3.getString(4));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r3.getString(5));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r3.getString(6));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r3.getString(7));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(1));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                            ");
}
                        }
                    }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("            ");
}
            }
            if(r.getString(1).equals("Mentor")){
                r1=s1.executeQuery("select * from Mentor where MEmail='"+r.getString(2)+"'");
                while(r1.next()){
      out.write("\n");
      out.write("                        <b>Club: </b>\n");
      out.write("                        ");
      out.print( r1.getString(4));
      out.write("<br>\n");
      out.write("                        <b>Email-ID: </b> \n");
      out.write("                        <input type=\"text\" name=\"email\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(3));
      out.write("\"><br>\n");
      out.write("                        <b>Contact: </b> \n");
      out.write("                        <input type=\"text\" name=\"contact\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(5));
      out.write("\"><br><br>\n");
      out.write("                        <input type=\"submit\" name=\"save\" value=\"Save Changes\" style=\"width:150px;font-size:15px;color:white;background-color:midnightblue;\"><br>\n");
      out.write("                    </font>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    ");
if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', username='"+request.getParameter("uname")+"' where email='"+r1.getString(3)+"'");
                        i=s.executeUpdate("update Mentor set mphone='"+request.getParameter("contact")+"', memail='"+request.getParameter("email")+"' where mid="+r1.getString(1)+"");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    } 
                    r2=s2.executeQuery("select cmname, cmemail, cmyear from ClubMember where cname='"+r1.getString(4)+"' order by cmyear");
                    r3=s3.executeQuery("select count(*) from ClubMember where cname='"+r1.getString(4)+"'");
                    while(r3.next()){
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <font color=\"white\" size=\"5\">Following are the ");
      out.print( r3.getInt(1));
      out.write(" active Club Members:</font><br>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("            <center>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <center><b>Name</b></center></div>\n");
      out.write("                    <div class=\"col-4\"><center><b>Email-Id</b></center></div>\n");
      out.write("                    <div class=\"col-4\"><center><b>Year</b></center></div>\n");
      out.write("                </div>\n");
      out.write("                    ");
while(r2.next()){
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <center>\n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <font color=\"white\">");
      out.print( r2.getString(1));
      out.write("</font>\n");
      out.write("                                <div class=\"dropdown-content\">\n");
      out.write("                                    <a href=\"MemberAction.jsp?user=");
      out.print( r.getString(1));
      out.write("&event=0&action=delm&username=");
      out.print( uname);
      out.write("&target=");
      out.print( r2.getString(2));
      out.write("\">Delete Member</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <center>");
      out.print( r2.getString(2));
      out.write("</center></div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                            <center>");
      out.print( r2.getString(3));
      out.write("</center></div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" name=\"back\" value=\"Back\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\">\n");
      out.write("                <input type=\"submit\" name=\"addm\" value=\"Add Members\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px\"></form><br>\n");
      out.write("            </center>\n");
      out.write("                    ");
if(request.getParameter("addm")!=null){
                        response.sendRedirect("admaction.jsp?target="+r1.getString(4)+"&action=addm&username="+uname);
                    }
                    if(request.getParameter("back")!=null){
                        response.sendRedirect("Event.jsp?username="+uname+"&target="+r1.getString(4)+"&user=mentor");
                    }
                }
            }
            if(r.getString(1).equals("Member")){
                r1=s1.executeQuery("select * from ClubMember where CMEmail='"+r.getString(2)+"'");
                while(r1.next()){
      out.write("\n");
      out.write("                        <b>Year: </b> \n");
      out.write("                        <input type=\"text\" name=\"year\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getInt(4));
      out.write("\"><br>\n");
      out.write("                        <b>Club: </b>");
      out.print( r1.getString(5));
      out.write("<br>\n");
      out.write("                        <b>Email-ID: </b> \n");
      out.write("                        <input type=\"text\" name=\"email\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(3));
      out.write("\"><br>\n");
      out.write("                        <b>Contact: </b> \n");
      out.write("                        <input type=\"text\" name=\"contact\" style=\"background: none;border: none;color: white;font-size:17px;\" value=\"");
      out.print( r1.getString(6));
      out.write("\"><br><br>\n");
      out.write("                        <input type=\"submit\" name=\"save\" value=\"Save Changes\" style=\"width:150px;font-size:15px;color:white;background-color:midnightblue;\"><br>\n");
      out.write("                    </font>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    ");
if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', username='"+request.getParameter("uname")+"' where email='"+r1.getString(3)+"'");
                        i=s.executeUpdate("update ClubMember set cmphone='"+request.getParameter("contact")+"', cmemail='"+request.getParameter("email")+"', cmyear="+Integer.parseInt(request.getParameter("year"))+" where cmid="+r1.getString(1)+"");
                        i=s.executeUpdate("update Student set sphone='"+request.getParameter("contact")+"', semail='"+request.getParameter("email")+"' where sname='"+r1.getString(2)+"'");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    } 
                    r2=s2.executeQuery("select clgid from Student where semail='"+r1.getString(3)+"'");
                    if(r2.next()){
                        r3=s3.executeQuery("select eid from Temp where clgid="+r2.getString(1)+"");
                        while(r3.next()){
                            Statement s4=conn.createStatement();
                            ResultSet r4=s4.executeQuery("select * from Event where eid="+r3.getInt(1)+" order by date");
                            while(r4.next()){
                                Statement s5=conn.createStatement();
                                ResultSet r5=s5.executeQuery("select cname from Club where cid="+r4.getInt(9)+"");
                                while(r5.next()){
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <font color=\"white\" size=\"5\">You have registered for the following events:</font><br><br>\n");
      out.write("            <center>\n");
      out.write("                <table style=\"width:100%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th><b>Name</b></th>\n");
      out.write("                        <th><b>Description</b></th>\n");
      out.write("                        <th><b>Date</b></th>\n");
      out.write("                        <th><b>Time</b></th>\n");
      out.write("                        <th><b>Venue</b></th>\n");
      out.write("                        <th><b>Category</b></th>\n");
      out.write("                        <th><b>Club</b></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( r4.getString(2));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(3));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(4));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(5));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(6));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r4.getString(7));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( r5.getString(1));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("                                ");
}
                            }
                        }
                    }
                }
            }
            else{
      out.write("\n");
      out.write("            </font>\n");
      out.write("            </div></div>\n");
      out.write("            ");
}
        }

      out.write("    \n");
      out.write("</div>\n");
      out.write("</form>\n");
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
      out.write("function addRemoveAttr(){\n");
      out.write("    var contenteditable = document.getElementById('txt1').contentEditable;\n");
      out.write("    if(contenteditable == 'inherit' || contenteditable == 'false'){\n");
      out.write("        document.getElementById('txt1').contentEditable = true;\n");
      out.write("    }else{\n");
      out.write("        document.getElementById('txt1').contentEditable = false;\n");
      out.write("    }\n");
      out.write("    var elem = document.getElementById(\"but_enable\");\n");
      out.write("    if (elem.value==\"Edit\")\n");
      out.write("        elem.value = \"save\";\t\t\t\n");
      out.write("    else elem.value = \"Edit\";\n");
      out.write("}\n");
      out.write("</script>  \n");
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
      out.write("</footer> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
