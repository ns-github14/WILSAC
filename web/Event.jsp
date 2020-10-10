<%-- 
    Document   : CoronaEvent.jsp
    Created on : Feb 4, 2020, 10:39:10 AM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <title>OUR CLUBS</title> 
<%
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
    text-align: center;
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
</style>
</head>
<body>
<%
try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    String cname=request.getParameter("target");
    String user=request.getParameter("user");
    String desc=null;
    int cid=0;
    ResultSet rs1=st.executeQuery("select CId, Description from Club where cname='"+cname+"'");
    while(rs1.next()){
        cid=rs1.getInt(1);
        desc=rs1.getString(2);
    }%>
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <%if(user.equals("mentor")){%>
    <a href="MemberAction.jsp?username=<%= uname%>&target=<%= cname%>&user=<%= user%>&action=adde&event=0"><b>Add Event</b></a>
    <a href="admaction.jsp?target=<%= cname%>&action=addm&username=<%= uname%>"><b>Add Members</b></a>
    <%}
    if(user.equals("member")){%>
    <a href="MemberAction.jsp?username=<%= uname%>&target=<%= cname%>&user=<%= user%>&action=adde&event=0"><b>Add Event</b></a>
    <%}%>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <%if(user.equals("admin")){%>
    <a href="Admin.jsp">Club List</a>
    <%}
    else{%>
    <a href="Dashboard.jsp?username=<%= uname%>">Profile</a>
    <%}%>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
    <%if(user.equals("member")){%>
    <a href="ClubList.jsp?username=<%= uname%>">Event Registration</a>
    <%}
    if(user.equals("mentor")){%>
    <a href="MemberAction.jsp?username=<%= uname%>&action=club&user=Mentor&event=0">Club Details</a>
    <%}%>
    <a href="AboutUs.jsp?username=<%= uname%>">About Us</a>
    <a href="ContactUs.jsp?username=<%= uname%>">Contact Us</a>
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
<div id="main">
    <center>
        <font face="arial" size=7 color="white"><b>Events</b>|<i><b><%= cname%></b></i></font>
        <br><br>
        <font face="arial" size=5 color="white"><%= desc%></font>
    </center><br><br>
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-3">
            <font color="white" size="5"><b>Date</b></font> 
        </div>
        <div class="col-3">
            <font color="white" size="5"><b>Event</b></font>   
        </div>
        <div class="col-3"> 
        </div>
    </div> 
    <%
    ResultSet rs2=st.executeQuery("select Date, EName from Event where CId="+cid+"");
    while(rs2.next()){%>
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-3">
            <font color="white" size="4"><%= rs2.getString(1)%></font> 
        </div>
        <div class="col-3">
            <a href="EventDetail.jsp?event=<%= rs2.getString(2)%>&username=<%= uname%>&user=<%= user%>">
            <font color="white" size="4"><%= rs2.getString(2)%></font>
        </div>
        <div class="col-3">
        </div>
    </div>
    <%}%> 
<%}
catch(Exception e){
}%>
</div>
<br><br><br><br><br><br><br><br><br>
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