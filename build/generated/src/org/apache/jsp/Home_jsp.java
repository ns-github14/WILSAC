package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    font-family: \"Lato\", sans-serif;\n");
      out.write("    background-attachment: fixed; \n");
      out.write("    background-size: 100% 100%;\n");
      out.write("}\n");
      out.write("@font-face\n");
      out.write("{\n");
      out.write("    font-family: SpecialElite;\n");
      out.write("    src: url('SpecialElite.ttf'),\n");
      out.write("    url('SpecialElite.eot');\n");
      out.write("}\n");
      out.write("h1 { \n");
      out.write("    font-family: 'SpecialElite', Times, serif;\n");
      out.write("    font-size: 25px;\n");
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
      out.write("} \n");
      out.write("#main {\n");
      out.write("    transition: margin-left .5s;\n");
      out.write("    padding: 16px;\n");
      out.write("    margin-left: 100px;\n");
      out.write("    margin-right: 100px;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write(".slideshow-container {\n");
      out.write("  max-width: 500px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Hide the images by default */\n");
      out.write(".mySlides {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Next & previous buttons */\n");
      out.write(".prev, .next {\n");
      out.write("  cursor: pointer;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  width: auto;\n");
      out.write("  margin-top: -22px;\n");
      out.write("  padding: 16px;\n");
      out.write("  color: white;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 18px;\n");
      out.write("  transition: 0.6s ease;\n");
      out.write("  border-radius: 0 3px 3px 0;\n");
      out.write("  user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Position the \"next button\" to the right */\n");
      out.write(".next {\n");
      out.write("  right: 0;\n");
      out.write("  border-radius: 3px 0 0 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On hover, add a black background color with a little bit see-through */\n");
      out.write(".prev:hover, .next:hover {\n");
      out.write("  background-color: rgba(0,0,0,0.8);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The dots/bullets/indicators */\n");
      out.write(".dot {\n");
      out.write("  cursor: pointer;\n");
      out.write("  height: 15px;\n");
      out.write("  width: 15px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active, .dot:hover {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fading animation */\n");
      out.write(".fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 1.5s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 1.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fade {\n");
      out.write("  from {opacity: .4}\n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fade {\n");
      out.write("  from {opacity: .4}\n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <span style=\"font-size:30px;cursor:pointer;color:white;padding-top:0px\"onclick=\"openNav()\">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n");
      out.write("    <a href=\"Register.jsp\"><b>Sign Up</b></a>\n");
      out.write("    <a href=\"Login.jsp\"><b>Login</b></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <a href=\"Register.jsp\">Join Us</a>\n");
      out.write("    <a href=\"AboutUs.jsp?username=null\">About Us</a>\n");
      out.write("    <a href=\"ContactUs.jsp?username=null\">Contact Us</a>\n");
      out.write("</div>\n");
      out.write("<center>\n");
      out.write("    <img src=\"images/IMG-20200318-WA0007.jpg\" width=\"600\" height=\"500\"/>\n");
      out.write("</center>\n");
      out.write("<h1>\n");
      out.write("    <center>\n");
      out.write("        <font color=\"darkcyan\">Online Event Registration platform<br><br>BANASTHALI VIDYAPITH</font>\n");
      out.write("    </center>\n");
      out.write("</h1>\n");
      out.write("<br><br>    \n");
      out.write("<div id=\"main\">\n");
      out.write("    <font size=\"6\" color=\"black\"><b><u>Users</u></b></font><br><br>\n");
      out.write("    <font size=\"5\"color=\"grey\">\n");
      out.write("        - Students interested to register themselves for the events conducted by our clubs.<br>\n");
      out.write("        - Members of the clubs who can conduct various events.<br>\n");
      out.write("        - Mentors of the clubs who can guide the activity of the club members.<br>\n");
      out.write("    </font><br>\n");
      out.write("    <div class=\"w3-row w3-center w3-padding-16 w3-section w3-blue\">\n");
      out.write("        <div class=\"w3-quarter w3-section\">\n");
      out.write("            <span class=\"w3-xlarge\">6</span><br>\n");
      out.write("                Clubs\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-quarter w3-section\">\n");
      out.write("            <span class=\"w3-xlarge\">50+</span><br>\n");
      out.write("                Members\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-quarter w3-section\">\n");
      out.write("            <span class=\"w3-xlarge\">100+</span><br>\n");
      out.write("                Events\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-quarter w3-section\">\n");
      out.write("            <span class=\"w3-xlarge\">5000+</span><br>\n");
      out.write("                Participants\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br><br>\n");
      out.write("    <font size=\"6\" color=\"black\"><b><u>Upcoming Events</u></b></font><br><br>\n");
      out.write("    <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("        <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("            <ul class=\"w3-ul w3-white w3-center\">\n");
      out.write("                <li class=\"w3-blue w3-xlarge w3-padding-32\">Date</li>\n");

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    ResultSet r=st.executeQuery("select date from Event order by date fetch first 5 rows only");
    while(r.next()){
      out.write("\n");
      out.write("                <li class=\"w3-padding-16\">");
      out.print( r.getString(1));
      out.write("</li>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("            <ul class=\"w3-ul w3-white w3-center\">\n");
      out.write("                <li class=\"w3-blue w3-xlarge w3-padding-32\">Name</li>\n");
      out.write("    ");
r=st.executeQuery("select ename from Event order by date fetch first 5 rows only");
    while(r.next()){
      out.write("\n");
      out.write("                <li class=\"w3-padding-16\">");
      out.print( r.getString(1));
      out.write("</li>");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("            <ul class=\"w3-ul w3-white w3-center\">\n");
      out.write("                <li class=\"w3-blue w3-xlarge w3-padding-32\">Club</li>\n");
      out.write("    ");
r=st.executeQuery("select cid from Event order by date fetch first 5 rows only");
    while(r.next()){
        Statement t=conn.createStatement();
        ResultSet rs=t.executeQuery("select cname from Club where cid="+r.getString(1)+"");
        while(rs.next()){
      out.write("\n");
      out.write("                <li class=\"w3-padding-16\">");
      out.print( rs.getString(1));
      out.write("</li>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br><br>\n");
      out.write("    <font size=\"6\" color=\"black\"><b><u>Our Clubs</u></b></font><br><br>\n");
      out.write("    <!-- Slideshow container -->\n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("  <!-- Full-width images with number and caption text -->\n");
      out.write("    ");
  Statement t=conn.createStatement();
        ResultSet rs=t.executeQuery("select cname,icon from Club order by cname");
        while(rs.next()){
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"");
      out.print( rs.getString(2));
      out.write("\" style=\"width:100%\">\n");
      out.write("            </div>\n");
      out.write("        ");
}
    
      out.write("\n");
      out.write("  <!-- Next and previous buttons -->\n");
      out.write("  <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("  <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<!-- The dots/circles -->\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(1)\"></span>\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(2)\"></span>\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(3)\"></span>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
      out.write("var slideIndex = 1;\n");
      out.write("showSlides(slideIndex);\n");
      out.write("\n");
      out.write("// Next/previous controls\n");
      out.write("function plusSlides(n) {\n");
      out.write("  showSlides(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Thumbnail image controls\n");
      out.write("function currentSlide(n) {\n");
      out.write("  showSlides(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showSlides(n) {\n");
      out.write("  var i;\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("  if (n > slides.length) {slideIndex = 1}\n");
      out.write("  if (n < 1) {slideIndex = slides.length}\n");
      out.write("  for (i = 0; i < slides.length; i++) {\n");
      out.write("      slides[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("      dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";\n");
      out.write("  dots[slideIndex-1].className += \" active\";\n");
      out.write("}\n");
      out.write("</script> \n");
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
      out.write("</footer>  \n");
      out.write("</body>\n");
      out.write("</html>\n");

    try{
        if(request.getParameter("login")!=null)
        {
            response.sendRedirect("Login.jsp"); 
        }
        if(request.getParameter("register")!=null)
        { 
            response.sendRedirect("Register.jsp"); 
        }
        if(request.getParameter("about us")!=null)
        {
            response.sendRedirect("AboutUs.jsp"); 
        }
        if(request.getParameter("contact us")!=null)
        {
            response.sendRedirect("ContactUs.jsp");
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
