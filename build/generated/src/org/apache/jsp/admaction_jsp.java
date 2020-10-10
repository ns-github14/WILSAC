package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import com.oreilly.servlet.MultipartRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

public final class admaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Admin Action Page</title>\n");

    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")){
        response.sendRedirect("Login.jsp");
    }

      out.write("       \n");
      out.write("<style> \n");
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
      out.write("<body> \n");
      out.write("<form name=\"Admin Action\" method=\"post\">\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\"onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("    <a href=\"Logout.jsp?username=ns\" onclick=\"return confirm('Are you sure?')\"><b>Logout</b></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"Logout.jsp?username=ns\" onclick=\"return confirm('Are you sure you want to LogOut?')\">Home</a>\n");
      out.write("    <a href=\"Admin.jsp\">Club List</a>\n");
      out.write("    <a href=\"AboutUs.jsp?username=ns\">About Us</a>\n");
      out.write("    <a href=\"ContactUs.jsp?username=ns\">Contact Us</a>\n");
      out.write("</div><br><br>\n");
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
    String str=request.getParameter("action");
    String cname=request.getParameter("target");
    int i=0,j=0;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    if(str.equals("addc")){
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("    <center>\n");
      out.write("        <font size=7 face=\"arial\" color=\"white\"><b>Club Details</b></font>\n");
      out.write("    </center><br><br>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("        \t<tr>\n");
      out.write("                    <td><font size=5>Name:</font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" size=\"50px\" placeholder=\"ABC\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font size=5>Description:</font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"desc\" size=\"50px\" placeholder=\"------\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\t\t\n");
      out.write("                    <td><font size=5>Mentor:</font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"mentor\" size=\"50px\" placeholder=\"Mr./Mrs. XYZ\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\t\t\n");
      out.write("                    <td><font size=5>Mentor Email-Id:</font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"memail\" size=\"50px\" placeholder=\"abc@gmail.com\" pattern=\"^(.+)@(.+)$\" required></td>\n");
      out.write("                </tr>\n");
      out.write("        </table><br>\n");
      out.write("        <input type=\"submit\" name=\"add\" value=\"Add\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\"><br>\n");
      out.write("    </center>\n");
      out.write("    <br><br><br>\n");
      out.write("</div>\n");
      out.write("        ");
if(request.getParameter("add")!=null){
            String name=request.getParameter("name");
            String desc=request.getParameter("desc"); 
            String mentor=request.getParameter("mentor");
            String memail=request.getParameter("memail");
            int flag=0;
            ResultSet rs=st.executeQuery("select cname from Club");
            while(rs.next()){
                String s=rs.getString(1);
                if(name.equals(s)){
                    flag=1;
                    break;
                }
            }   
            if(flag==1){
      out.write("\n");
      out.write("<center><font size=4 face=\"arial\" color=\"white\">Club Exists</font></center>\n");
      out.write("            ");
}
            else{
                int tm=0;
                i=st.executeUpdate("insert into Club(Description,Mentor,CName,TotalMembers) values('"+desc+"','"+mentor+"','"+name+"',"+tm+")");
                j=st.executeUpdate("insert into Mentor(MName, MEmail, ClubName) values('"+mentor+"','"+memail+"','"+name+"')");
                j=st.executeUpdate("insert into Login(EMAIL, TYPE, USERNAME) values('"+memail+"','Mentor','"+memail+"')");
                if(i>0 && j>0)
                    response.sendRedirect("ImgUpload.jsp?target=club&name="+name);
                else{
      out.write("\n");
      out.write("<center><font size=4 face=\"arial\" color=\"white\">Club Exists</font></center>\n");
      out.write("                ");
}
            }   
        }
    }
    if(str.equals("addm")){
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("    <center>\n");
      out.write("        <font size=7 face=\"arial\" color=\"white\"><b>Member Details</b></font>\n");
      out.write("    </center><br><br>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=5>Name:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"name\" size=\"50px\" required></td>\n");
      out.write("            </tr>\n");
      out.write("\t    <tr>\n");
      out.write("                <td><font size=5>Email-Id:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"email\" size=\"50px\" placeholder=\"abc@gmail.com\" pattern=\"^(.+)@(.+)$\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=5>Year:</font></td>\n");
      out.write("                <td><input type=\"text\" name=\"year\" size=\"50px\" placeholder=\"1\" required></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><br>\n");
      out.write("        <input type=\"submit\" name=\"done\" value=\"Done\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px\">\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"submit\" name=\"add\" value=\"Add Another\" style=\"font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px\"><br>\n");
      out.write("    </center>\n");
      out.write("    <br><br><br>\n");
      out.write("</div>\n");
      out.write("        ");
if(request.getParameter("done")!=null){ 
            String email=request.getParameter("email");
            String name=request.getParameter("name");
            int year=Integer.parseInt(request.getParameter("year"));
            i=st.executeUpdate("insert into Login(Email, Type, Username) values('"+email+"','Member','"+email+"')");
            i=st.executeUpdate("insert into ClubMember(CMNAME, CMEMAIL, CNAME, CMYEAR) values('"+name+"','"+email+"','"+cname+"',"+year+")");
            if(i>0){
                i=st.executeUpdate("update Club set TotalMembers=TotalMembers+1 where CName='"+cname+"'");
                ResultSet r=st.executeQuery("select username from Login where type='Admin'");
                while(r.next()){
                    if(request.getParameter("username").equals(r.getString(1)))
                        response.sendRedirect("Admin.jsp");
                    else
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("username"));
                }
            }
            else
                out.println("try again");
        }
        if(request.getParameter("add")!=null){
            String email=request.getParameter("email");
            String name=request.getParameter("name");
            int year=Integer.parseInt(request.getParameter("year"));
            i=st.executeUpdate("insert into Login(Email, Type, Username) values('"+email+"','Member','"+email+"')");
            i=st.executeUpdate("insert into ClubMember(CMNAME, CMEMAIL, CNAME, CMYEAR) values('"+name+"','"+email+"','"+cname+"',"+year+")");
            if(i>0){
                i=st.executeUpdate("update Club set TotalMembers=TotalMembers+1 where CName='"+cname+"'");
                response.sendRedirect("admaction.jsp?target="+cname+"&action=addm&username="+request.getParameter("username"));
            }
        }
    }
    if(str.equals("delc"))
    {
        Statement t=conn.createStatement();
        ResultSet r=t.executeQuery("select MEMAIL from Mentor where ClubName='"+cname+"'");
        while(r.next()){
            i=st.executeUpdate("delete from Login where email='"+r.getString(1)+"'");
            out.println(i+"1");
        }
        r=t.executeQuery("select CMEMAIL from ClubMember where cname='"+cname+"'");
        while(r.next()){
            i=st.executeUpdate("delete from Login where email='"+r.getString(1)+"'");
            out.println(i+"2");
        }
        i=t.executeUpdate("delete from Mentor where ClubName='"+cname+"'");
        out.println(i+"3");
        i=t.executeUpdate("delete from ClubMember where cname='"+cname+"'");
        out.println(i+"4");
        r=t.executeQuery("select cid from Club where cname='"+cname+"'");
        while(r.next()){
            out.println(r.getInt(1));
            ResultSet s=st.executeQuery("select eid,poster from Event where cid="+r.getInt(1)+"");
            while(s.next()){
                Statement t1=conn.createStatement();
                i=t1.executeUpdate("delete from Temp where eid="+s.getInt(1)+"");
                out.println(i+"5");
                File f=new File("C:/Users/neelanshi sharma/Documents/NetBeansProjects/WILSAC/web/"+s.getString(2));
                f.delete();
                i=t1.executeUpdate("delete from Event where eid="+s.getInt(1)+"");
                out.println(i+"6");
            }
        }
        r=t.executeQuery("select icon from Club where cname='"+cname+"'");
        while(r.next()){
        File f=new File("C:/Users/neelanshi sharma/Documents/NetBeansProjects/WILSAC/web/"+r.getString(1));
        f.delete();}
        out.println("--");
        i=t.executeUpdate("delete from Club where cname='"+cname+"'");
        out.println(i+"7");
        if(i>0)
            response.sendRedirect("Admin.jsp");
    } 
    if(str.equals("viewm"))
    {
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("<br><center>\n");
      out.write("    <font color=\"white\" size=\"7\"><b>Team <i>");
      out.print( cname);
      out.write("</i></b></font> \n");
      out.write("        ");
ResultSet rs=st.executeQuery("select mentor from Club where cname='"+cname+"'");
        while(rs.next()){
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <font color=\"white\" size=\"5\">(Mentor: ");
      out.print( rs.getString(1));
      out.write(")</font>\n");
      out.write("    </center>\n");
      out.write("        ");
}
        rs=st.executeQuery("select cmname, cmemail, cmyear from ClubMember where cname='"+cname+"'");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th><center><b>Name</b></center></th>\n");
      out.write("                <th><center><b>Email-Id</b></center></th>\n");
      out.write("                <th><center><b>Year</b></center></th><br><br>\n");
      out.write("            </tr>\n");
      out.write("        ");

        while(rs.next())
        {
      out.write("\n");
      out.write("            <tr>            \n");
      out.write("                <td><center>");
      out.print( rs.getString(1));
      out.write("</center></td>\n");
      out.write("                <td><center>");
      out.print( rs.getString(2));
      out.write("</center></td>\n");
      out.write("                <td><center>");
      out.print( rs.getString(3));
      out.write("</center></td>\n");
      out.write("            </tr>\n");
      out.write("        ");
}
    }
}
catch(Exception e){
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <font size=\"5\" face=\"arial\" color=\"white\"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>\n");
      out.write("        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group\n");
      out.write("    </div>\n");
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
