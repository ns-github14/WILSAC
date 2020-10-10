<%-- 
    Document   : admaction
    Created on : Feb 15, 2020, 9:33:00 PM
    Author     : neelanshi sharma
--%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Action Page</title>
<%
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
%>       
<style> 
body {
    font-family: "Lato", sans-serif;
    background-image: url('images/n.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed; 
    background-size: 100% 100%;
}
.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: midnightblue;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}
.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration:  none;
    font-size: 25px;
    color: gainsboro;
    display: block;
    transition: 0.3s;
}
.sidenav a:hover {
    color: #f1f1f1;
}
.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}
#main {
    transition: margin-left .5s;
    padding: 16px;
}
@media screen and (max-height: 450px) {
    .sidenav {padding-top: 15px;}
    .sidenav a {font-size: 18px;}
}
.topnav {
    list-style-type: none;
    background: #f1f1f1;
    padding: 12px;
    overflow: hidden;
    background-color: midnightblue;
    color: white;
}
/* Style the links inside the navigation bar */
.topnav a {
    float: right;
    display: block;
    color: #f1f1f1;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 20px;
}
/* Change the color of links on hover */
.topnav a:hover {
    color: #f1f1f1;
    font-size: 22px;
}
/* Add a color to the active/current link */
.topnav a.active {
    background-color: midnightblue;
    color: white;
}
footer {
    background: midnightblue;
    margin-top:15px;
    padding:10px 30px;
    color:white;
}
table, th{
    text-align: left;
    color: white;
    font-size: medium;
}
tr, td{
    padding: 15px;
    text-align: left;
    color: white;
}
.row::after {
  content: "";
  clear: both;
  display: table;
}

[class*="col-"] {
  float: left;
  text-align: center;
    color: white;
    font-size: large;
    text-align: center;
    font-size: large;
}

.col-1 {width: 8.33%;}
.col-2 {width: 16.66%;}
.col-3 {width: 25%;}
.col-4 {width: 33.33%;}
.col-5 {width: 41.66%;}
.col-6 {width: 50%;}
.col-7 {width: 58.33%;}
.col-8 {width: 66.66%;}
.col-9 {width: 75%;}
.col-10 {width: 83.33%;}
.col-11 {width: 91.66%;}
.col-12 {width: 100%;}
</style>
</head>
<body> 
<form name="Admin Action" method="post">
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="Logout.jsp?username=ns" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Logout.jsp?username=ns" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
    <a href="Admin.jsp">Club List</a>
    <a href="AboutUs.jsp?username=ns">About Us</a>
    <a href="ContactUs.jsp?username=ns">Contact Us</a>
</div><br><br>
<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.2)";
}
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
    document.body.style.backgroundColor = "white";
}
</script> 
<%try{
    String str=request.getParameter("action");
    String cname=request.getParameter("target");
    int i=0,j=0;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    if(str.equals("addc")){%>
<div id="main">
    <center>
        <font size=7 face="arial" color="white"><b>Club Details</b></font>
    </center><br><br>
    <center>
        <table>
        	<tr>
                    <td><font size=5>Name:</font></td>
                    <td><input type="text" name="name" size="50px" placeholder="ABC" required></td>
                </tr>
                <tr>
                    <td><font size=5>Description:</font></td>
                    <td><input type="text" name="desc" size="50px" placeholder="------" required></td>
                </tr>
                <tr>		
                    <td><font size=5>Mentor:</font></td>
                    <td><input type="text" name="mentor" size="50px" placeholder="Mr./Mrs. XYZ" required></td>
                </tr>
                <tr>		
                    <td><font size=5>Mentor Email-Id:</font></td>
                    <td><input type="text" name="memail" size="50px" placeholder="abc@gmail.com" pattern="^(.+)@(.+)$" required></td>
                </tr>
        </table><br>
        <input type="submit" name="add" value="Add" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px"><br>
    </center>
    <br><br><br>
</div>
        <%if(request.getParameter("add")!=null){
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
            if(flag==1){%>
<center><font size=4 face="arial" color="white">Club Exists</font></center>
            <%}
            else{
                int tm=0;
                i=st.executeUpdate("insert into Club(Description,Mentor,CName,TotalMembers) values('"+desc+"','"+mentor+"','"+name+"',"+tm+")");
                j=st.executeUpdate("insert into Mentor(MName, MEmail, ClubName) values('"+mentor+"','"+memail+"','"+name+"')");
                j=st.executeUpdate("insert into Login(EMAIL, TYPE, USERNAME) values('"+memail+"','Mentor','"+memail+"')");
                if(i>0 && j>0)
                    response.sendRedirect("ImgUpload.jsp?target=club&name="+name);
                else{%>
<center><font size=4 face="arial" color="white">Club Exists</font></center>
                <%}
            }   
        }
    }
    if(str.equals("addm")){%>
<div id="main">
    <center>
        <font size=7 face="arial" color="white"><b>Member Details</b></font>
    </center><br><br>
    <center>
        <table>
            <tr>
                <td><font size=5>Name:</font></td>
                <td><input type="text" name="name" size="50px" required></td>
            </tr>
	    <tr>
                <td><font size=5>Email-Id:</font></td>
                <td><input type="text" name="email" size="50px" placeholder="abc@gmail.com" pattern="^(.+)@(.+)$" required></td>
            </tr>
            <tr>
                <td><font size=5>Year:</font></td>
                <td><input type="text" name="year" size="50px" placeholder="1" required></td>
            </tr>
        </table><br>
        <input type="submit" name="done" value="Done" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" name="add" value="Add Another" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px"><br>
    </center>
    <br><br><br>
</div>
        <%if(request.getParameter("done")!=null){ 
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
    {%>
<div id="main">
<center>
    <font color="white" size="7"><b>Team <i><%= cname%></i></b></font> 
        <%ResultSet rs=st.executeQuery("select mentor from Club where cname='"+cname+"'");
        while(rs.next()){%>
    <br><br>
    <font color="white" size="5">(Mentor: <%= rs.getString(1)%>)</font><br><br>
</center>
        <%}
        rs=st.executeQuery("select cmname, cmemail, cmyear, cmphone from ClubMember where cname='"+cname+"'");%>
        <center><div class="row">
                    <div class="col-4"><center><b>Name</b></center></div>
                    <div class="col-4"><center><b>Email-Id</b></center></div>
                    <div class="col-4"><center><b>Year</b></center></div>
            </div><br>
                    <%while(rs.next()){%>
                    <div class="row">
                    <div class="col-4">
                        <center><%= rs.getString(1)%></center>
                    </div>
                    <div class="col-4">
                        <center><%= rs.getString(2)%></center></div>
                    <div class="col-4">
                        <center><%= rs.getInt(3)%></center></div>
                    </div>    
                    <br>
                    <%}%>
                <br><br>
        </center>  
        <%}
    }
catch(Exception e){
}%>
</div>
<br><br><br><br><br>
<footer>
    <div class="footer">
        <font size="5" face="arial" color="white"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>
        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group
    </div>
<script>
//Get the button
var mybutton = document.getElementById("myBtn");
// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};
function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        mybutton.style.display = "block";
    } 
    else {
        mybutton.style.display = "none";
    }
}
// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}
</script>
</footer>
</form>
</body>
</html>