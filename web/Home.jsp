<%-- 
    Document   : newjsp
    Created on : Feb 2, 2020, 9:40:41 AM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    background-repeat: no-repeat;
    font-family: "Lato", sans-serif;
    background-attachment: fixed; 
    background-size: 100% 100%;
}
@font-face
{
    font-family: SpecialElite;
    src: url('SpecialElite.ttf'),
    url('SpecialElite.eot');
}
h1 { 
    font-family: 'SpecialElite', Times, serif;
    font-size: 25px;
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
.slideshow-container {
  max-width: 500px;
  position: relative;
  margin: auto;
}

/* Hide the images by default */
.mySlides {
  display: none;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  margin-top: -22px;
  padding: 16px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4}
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4}
  to {opacity: 1}
}
</style>
</head>
<body>
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="Register.jsp"><b>Sign Up</b></a>
    <a href="Login.jsp"><b>Login</b></a>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Register.jsp">Join Us</a>
    <a href="AboutUs.jsp?username=null">About Us</a>
    <a href="ContactUs.jsp?username=null">Contact Us</a>
</div>
<center>
    <img src="images/IMG-20200318-WA0007.jpg" width="600" height="500"/>
</center>
<h1>
    <center>
        <font color="darkcyan">Online Event Registration platform<br><br>BANASTHALI VIDYAPITH</font>
    </center>
</h1>
<br><br>    
<div id="main">
    <font size="6" color="black"><b><u>Users</u></b></font><br><br>
    <font size="5"color="grey">
        - Students interested to register themselves for the events conducted by our clubs.<br>
        - Members of the clubs who can conduct various events.<br>
        - Mentors of the clubs who can guide the activity of the club members.<br>
    </font><br>
    <div class="w3-row w3-center w3-padding-16 w3-section w3-blue">
        <div class="w3-quarter w3-section">
            <span class="w3-xlarge">6</span><br>
                Clubs
        </div>
        <div class="w3-quarter w3-section">
            <span class="w3-xlarge">50+</span><br>
                Members
        </div>
        <div class="w3-quarter w3-section">
            <span class="w3-xlarge">100+</span><br>
                Events
        </div>
        <div class="w3-quarter w3-section">
            <span class="w3-xlarge">5000+</span><br>
                Participants
        </div>
    </div>
    <br><br>
    <font size="6" color="black"><b><u>Upcoming Events</u></b></font><br><br>
    <div class="w3-row-padding" style="margin:0 -16px">
        <div class="w3-third w3-margin-bottom">
            <ul class="w3-ul w3-white w3-center">
                <li class="w3-blue w3-xlarge w3-padding-32">Date</li>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    ResultSet r=st.executeQuery("select date from Event order by date fetch first 5 rows only");
    while(r.next()){%>
                <li class="w3-padding-16"><%= r.getString(1)%></li>
    <%}%>
            </ul>
        </div>
        <div class="w3-third w3-margin-bottom">
            <ul class="w3-ul w3-white w3-center">
                <li class="w3-blue w3-xlarge w3-padding-32">Name</li>
    <%r=st.executeQuery("select ename from Event order by date fetch first 5 rows only");
    while(r.next()){%>
                <li class="w3-padding-16"><%= r.getString(1)%></li><%}%>
            </ul>
        </div>
        <div class="w3-third w3-margin-bottom">
            <ul class="w3-ul w3-white w3-center">
                <li class="w3-blue w3-xlarge w3-padding-32">Club</li>
    <%r=st.executeQuery("select cid from Event order by date fetch first 5 rows only");
    while(r.next()){
        Statement t=conn.createStatement();
        ResultSet rs=t.executeQuery("select cname from Club where cid="+r.getString(1)+"");
        while(rs.next()){%>
                <li class="w3-padding-16"><%= rs.getString(1)%></li>
        <%}%>
    <%}%>
            </ul>
        </div>
    </div>
    <br><br>
    <font size="6" color="black"><b><u>Our Clubs</u></b></font><br><br>
    <!-- Slideshow container -->
<div class="slideshow-container">
  <!-- Full-width images with number and caption text -->
    <%  Statement t=conn.createStatement();
        ResultSet rs=t.executeQuery("select cname,icon from Club order by cname");
        while(rs.next()){%>
            <div class="mySlides fade">
                <img src="<%= rs.getString(2)%>" style="width:100%">
            </div>
        <%}
    %>
  <!-- Next and previous buttons -->
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>

<!-- The dots/circles -->
<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span>
  <span class="dot" onclick="currentSlide(2)"></span>
  <span class="dot" onclick="currentSlide(3)"></span>
</div>
</div>
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
var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
}
</script> 
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
<%
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
%>    