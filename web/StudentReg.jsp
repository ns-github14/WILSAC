<%-- 
    Document   : StudentReg
    Created on : Feb 6, 2020, 6:36:24 PM
    Author     : neelanshi sharma
--%>
<%@page import="java.util.regex.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
table{
    text-align: left;
    color: white;
    font-size: medium;
}
tr, td{
    padding: 10px;
    text-align: left;
    color: white;
}
</style>
</head>
<body>
<form method="post">
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="Logout.jsp?username=<%=uname%>" onclick="return confirm('Are you sure you want to LogOut?')"><b>Logout</b></a>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Dashboard.jsp?username=<%= uname%>">Profile</a>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
    <a href="AboutUs.jsp?username=<%= uname%>">About Us</a>
    <a href="ContactUs.jsp?username=<%= uname%>">Contact Us</a>
</div><br>
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
        <font size=7 face="arial" color="white"><b>Event Registeration</b></font>
    </center><br><br>
    <center>
        <table>
            <tr>
                <td><font size=5>Name:</font></td>
                <td><input type="text" name="name" size="50px" placeholder="ABC" required></td>
            </tr>
       	    <tr>
                <td><font size=5>College Id:</font></td>
                <td><input type="text" name="clgid" size="50px" placeholder="BTBT..." required></td>
            </tr>
            <tr>
                <td><font size=5>Course:</font></td> 
                <td><select name="course" style="width:80px">
                    <option value="B.Tech CS">B.Tech CS</option>
                    <option value="B.Tech IT">B.Tech IT</option>
                    <option value="B.Tech EC">B.Tech EC</option>
                    <option value="B.Tech EI">B.Tech EI</option>
                    <option value="B.Tech EE">B.Tech EE</option>
                    <option value="B.Tech CE">B.Tech CE</option>
                    <option value="B.Tech BT">B.Tech BT</option>
                    <option value="B.Tech MT">B.Tech MT</option>
                    <option value="M.Tech CS">M.Tech CS</option>
                    <option value="M.Tech IT">M.Tech IT</option>
                    <option value="M.Tech VLSI">M.Tech VLSI</option>
                    <option value="M.Tech Remote Sensing">M.Tech Remote Sensing</option>
                    <option value="BCA">BCA</option>
                    <option value="MCA">MCA</option>
                    <option value="BSc.">BSc.</option>
                    <option value="Msc.">MSc.</option>
                    </select>
                </td>
            </tr>
            <tr>		
                <td><font size=5>Year:</font></td>
                <td><input type="text" name="semester" size="50px" required></td>
            </tr>
            <tr>
                <td><font size=5>Contact No.</font></td>
                <td><input type="text" name="contact" required="required" pattern="[7-9][0-9]{9}"/></td>
            </tr>
        </table><br>
        <input type="submit" name="Done" value="Done" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px"><br>    
    </center>
    <br><br><br>
</div>
<%try{
    int eid=Integer.parseInt(request.getParameter("eid"));
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    ResultSet r=st.executeQuery("select * from Student where uname='"+uname+"'");
    if(r.next()){
        Statement s=conn.createStatement();
        int i=s.executeUpdate("insert into Temp values('"+r.getString(7)+"',"+eid+",'No')");
        ResultSet rs=s.executeQuery("select amount from Event where eid="+eid+"");
        while(rs.next()){
            if(rs.getInt(1)>0)
                response.sendRedirect("Payment.jsp?username="+uname+"&eid="+eid);
            else{
                i=st.executeUpdate("update Temp set payment='Yes' where eid="+eid+" and clgid='"+r.getString(7)+"'");
                response.sendRedirect("ClubList.jsp?username="+uname);
            } 
        }
    }
    if(request.getParameter("Done")!=null){
        String name=request.getParameter("name");
        String id=request.getParameter("clgid");
        String course=request.getParameter("course");
        int sem=Integer.parseInt(request.getParameter("semester")); 
        String contact=request.getParameter("contact");
        r=st.executeQuery("select email from Login where username='"+uname+"'");
        while(r.next()){
            int i=st.executeUpdate("insert into Student values('"+name+"',"+sem+",'"+r.getString(1)+"','"+contact+"','"+course+"','"+uname+"','"+id+"')");
            if(i>0){
                Statement s=conn.createStatement();
                i=s.executeUpdate("insert into Temp values('"+id+"',"+eid+",'No')");
                ResultSet rs=s.executeQuery("select amount from Event where eid="+eid+"");
                while(rs.next()){
                    if(rs.getInt(1)>0)
                        response.sendRedirect("Payment.jsp?username="+uname+"&eid="+eid);
                    else{
                        i=st.executeUpdate("update Temp set payment='Yes' where eid="+eid+" and clgid='"+id+"'");
                        response.sendRedirect("ClubList.jsp?username="+uname);
                    } 
                }
            }
            else
                out.println("try again");
        }
    }    
}
catch(Exception e){
}%>
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
</form>
</body>
</html>