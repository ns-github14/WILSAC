<%-- 
    Document   : CoronaEvent.jsp
    Created on : Feb 4, 2020, 10:39:10 AM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,javax.mail.*"%>
<%@page import="javax.mail.internet.*" %>
<%@page import="javax.activation.*" %>
<!doctype html>
<html>
    <head>
    <title>Recover Your Password</title>   
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
<form name="emailform" action="Recovery.jsp" method="post">
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
        <font size=7 face="arial" color="white"><b>Recover Your Password</b></font><br><br><br>
        <font size=5 color="white" font="arial">Email ID:</font>
        <input type="text" name="email" size=50px placeholder="email" required="required">
        <br><br><br>
        <input type="submit" name="Email" value="Send Link" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px"><br>
    </center>
    <br><br><br>
</div>
<br><br><br><br><br>    
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
</form>
<%
    if (request.getParameter("Email") != null){
        //Creating a result for getting status that messsage is delivered or not!
        String result=" ";
        // Get recipient's email-ID, message & subject-line from mail.html page
        String to = request.getParameter("email");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
        Statement st=conn.createStatement();
        ResultSet r=st.executeQuery("select username from login where email='"+to+"'");
        if(r.next()){
            final String subject = "Recover Your Password";
            final String messg = "http://localhost:8080/WILSAC/NewPass.jsp?user="+r.getString(1);
            // Sender's email ID and password needs to be mentioned
            final String from = "sharmaneelanshi00@gmail.com";
            final String pass = "dobaramatpuchna";
            // Defining the gmail host
            String host = "smtp.gmail.com";
            // Creating Properties object
            Properties props = new Properties();
            // Defining properties
            props.put("mail.smtp.ssl.enable","true");
            props.put("mail.smtp.host", host);
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.user", from);
            props.put("mail.password", pass);
            props.put("mail.port", 587); // there are some other ports also available
            // Authorized the Session object.
            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pass);
                }
            });
            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(mailSession);
                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));
                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                // Set Subject: header field
                message.setSubject(subject);
                // Now set the actual message
                message.setText(messg);
                // Send message
                Transport.send(message);
                result = "Your mail sent successfully....";
                out.println(result);
            } 
            catch (MessagingException mex) {
                mex.printStackTrace();
                result = "Error: unable to send mail....";
                out.println(mex);
                out.println(result);
            }
        }
    }
    else{
        out.println("You are not a registered user.");
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
