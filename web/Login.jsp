<%-- 
    Document   : Login
    Created on : Feb 2, 2020, 10:09:49 PM
    Author     : neelanshi sharma
--%>
<%@page import="java.util.Objects"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
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
footer #myBtn {
    display: none;
    position: fixed;
    bottom: 20px;
    right: 30px;
    z-index: 99;
    font-size: 18px;
    border: none;
    outline: none;
    background-color: black;
    color: white;
    cursor: pointer;
    padding: 15px;
    border-radius: 4px;
}
footer #myBtn:hover {
    background-color: midnightblue;
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
</style>
</head>
<body>
<form method="post">
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Home.jsp">Home</a>
    <a href="AboutUs.jsp?username=null">About Us</a>
    <a href="ContactUs.jsp?username=null">Contact Us</a>
</div><br><br>
<div id="main">
    <center>
        <font size=7 face="arial" color="white"><b>Login Here</b></font><br>
        <a href="Register.jsp"><font size=3 color="white">Not a Member Yet? Register Now..</font></a>
    </center><br><br>
    <center>
        <table>
            <tr>
                <td><font size=5>Username:</font></td>
                <td><input type="text" name="username" size=50px placeholder="username" required="required"><br><br></td>
            </tr>
       	    <tr>
                <td><font size=5>Password:</font></td>
                <td><input type="password" name="password" size=50px placeholder="password" required="required"></td>
            </tr>
        </table><br><br>
        <input type="submit" name="login" value="Login" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px"><br>
        <a href="Recovery.jsp"><font size=3 color="white"><br> Forgot Password?</font></a>
    </center>
    <br><br><br>
</div>
</form>
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
<%
    try{
        String uname=request.getParameter("username");
        String pass=request.getParameter("password");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
        Statement st=conn.createStatement();
        if(request.getParameter("login")!=null)
        {
            ResultSet rs=st.executeQuery(" Select * from Login where username='"+uname+"' and password='"+pass+"' ");
            if(rs.next())
            {
                session.setAttribute("userid", uname);
                String s=rs.getString(2);
                if(Objects.equals(s, "Student"))
                    response.sendRedirect("ClubList.jsp?username="+uname);
                else if(Objects.equals(s, "Mentor"))                            
                {
                    ResultSet r=st.executeQuery("select clubname from Mentor where memail='"+rs.getString(3)+"'");
                    String cname=null;
                    while(r.next())
                    {
                        cname=r.getString(1);
                    }
                    response.sendRedirect("Event.jsp?username="+uname+"&target="+cname+"&user=mentor");
                }
                else if(Objects.equals(s, "Member"))
                {
                    ResultSet r=st.executeQuery("select cname from ClubMember where cmemail='"+rs.getString(3)+"'");
                    String cname=null;
                    while(r.next())
                    {
                        cname=r.getString(1);
                    }
                    response.sendRedirect("Event.jsp?username="+uname+"&target="+cname+"&user=member");
                }
                else
                    response.sendRedirect("Admin.jsp");
            }
            else%>
            <font size=3 color="white"><center>username or password is wrong</center></font>
        <%;}
        if(request.getParameter("forget password")!=null)
        {
            response.sendRedirect("Recovery.jsp");
        }
    }
    catch(Exception e)
    {
        
    }
%>
<footer>
    <div class="footer">
        <font size="5" face="arial" color="white"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>
        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group
    </div>
<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
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
</body>
</html>