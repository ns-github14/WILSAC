<%-- 
    Document   : ContactUs
    Created on : Feb 2, 2020, 10:09:31 PM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Contact Us</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    font-family: "Lato", sans-serif;
    background-repeat: no-repeat;
    background-attachment: fixed; 
    background-size: 100%;
}
.image {
    display:block;
    height: 100%;
    width: 100%;
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
    margin-left: 100px;
    margin-right: 100px;
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
* {
  box-sizing: border-box;
}
.row::after {
  content: "";
  clear: both;
  display: table;
}

[class*="col-"] {
  float: left;
  padding: 15px;
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

/* Content */
.content {
  padding: 10px;
  text-align: center;
}
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  padding: 16px;
  background-color: midnightblue;
}
.fa {
  padding: 10px;
  font-size: 24px;
  width: 40px;
  height: 40px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
}

.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}

.fa-google {
  background: #dd4b39;
  color: white;
}

.fa-linkedin {
  background: #007bb5;
  color: white;
}

.fa-instagram {
  background: #ea4c89;
  color: white;
}
</style>
</head>
<body>
<%
    String uname=request.getParameter("username");
    if(!uname.equals("null")){%>
    <div class="topnav">
        <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
    </div>
    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
        <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
        <a href="AboutUs.jsp?username=<%= uname%>">About Us</a>
    </div>
    <%}
    else{%>
    <div class="topnav">
        <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <a href="Register.jsp"><b>Sign Up</b></a>
        <a href="Login.jsp"><b>Login</b></a>
    </div>
    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
        <a href="Register.jsp">Join Us</a>
        <a href="Home.jsp">Home</a>
        <a href="AboutUs.jsp?username=null">About Us</a>
    </div>        
    <%}%>
<br><br><br>
<center><font face="arial" size=7><b>Contact Us</b></font></center><br><br>
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
<div id="main">
    <div class="row">
        <div class="col-4">
            <img src="images/IMG-20200318-WA0007.jpg" width="90%">
        </div>
        <div class="col-8">
            <font size="5"color="grey"><br><br>
                <b>Email-Id: </b><a href="mailto:wilsacproject@gmail.com">wilsacproject@gmail.com</a><br><br>
                <b>Contact: </b>+91 9876543210
            </font> 
        </div>
    </div>
    <center>
        <font size="6" color="black"><b><u>Our Mentors</u></b></font><br><br>
    </center>
    <div class="row">
    <%  
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("select * from Mentor order by ClubName");
    while(rs.next()){%>
        <div class="col-4">
            <div class="card">
                <font size="5" color="white" style="font-family: cursive;"><%= rs.getString(2)%><br></font>
                <font color="grey" size="4.5"><%= rs.getString(4)%><br></font><br>
                <a href="mailto:<%= rs.getString(3)%>">
                    <font size="3" color="white"><%= rs.getString(3)%></font>
                </a>
            </div>
        </div>
    <%}%>
    </div>
    <br><br>
    <center><font size="6" color="black"><b><u>Our Clubs</u></b></font><br><br></center>
    <div class="row">
    <%
    rs=st.executeQuery("select Cname,Description,Icon,fblink,iglink,gmail,linkedin from Club order by cname");
    while(rs.next())
    {%> 
        <div class="col-6">
            <div class="col-4">
                <img src="<%= rs.getString(3)%>" class="image"> 
            </div>
            <div class="col-8">
                <font size="3"color="grey">
                    <center><br><%= rs.getString(1)%><br><br></center>    
                    <%= rs.getString(2)%><br><br>
                    <a href="<%= rs.getString(4)%>" class="fa fa-facebook"></a>
                    <a href="<%= rs.getString(6)%>" class="fa fa-google"></a>
                    <a href="<%= rs.getString(7)%>" class="fa fa-linkedin"></a>
                    <a href="<%= rs.getString(5)%>" class="fa fa-instagram"></a>
                </font>
            </div>
        </div>
    <%}%>
    </div>
</div>
<br><br><br><br><br><br><br><br>
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
