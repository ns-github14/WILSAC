<%--
    Document   : EventDetail
    Created on : Feb 10, 2020, 11:27:24 AM
    Author     : neelanshi sharma
--%>

<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event Detail</title>
<%
    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    String uname = request.getParameter("username"); 
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
.row {
  display: flex;
}
.column {
  flex: 50%;
  padding: 10px;
}
table, th{
    text-align: center;
    color: white;
    font-size: large;
    alignment-adjust: central;
}
tr, td{
    padding: 15px;
    text-align: center;
    color: white;
    alignment-adjust: central;
}
</style>
</head>
<body>
<form name="Event Detail" method="Post">
<%
    String ename=request.getParameter("event");
    String user=request.getParameter("user");
%>
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px" onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
</div>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
    <%if(user.equals("admin")){%>
    <a href="Admin.jsp">Club List</a>
    <%}
    else{%>
    <a href="Dashboard.jsp?username=<%= uname%>">
        Profile
    </a>
        <%if(user.equals("Member")){%>
    <a href="ClubList.jsp?username=<%= uname%>">Event Registration</a>
        <%}%>
    <%}%>
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
<%
    int eid=0;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement(); 
    ResultSet rs=st.executeQuery("select * from Event where EName='"+ename+"'");
    while(rs.next()){
        eid=rs.getInt(1);%>
    <div class="row">
        <div class="column">
            <center><img src="<%= rs.getString(10)%>" height="500"></center>
        </div>
        <div class="column">
            <font color="white" size="4">
                <br><br>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Name: </b><%= rs.getString(2)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Description: </b><%= rs.getString(3)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Category: </b><%= rs.getString(7)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Date: </b><%= rs.getString(4)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Time: </b><%= rs.getString(5)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Venue: </b><%= rs.getString(6)%>
                <br><br>&nbsp;&nbsp;&nbsp;<b>Amount: </b><%= rs.getString(8)%>
            </font>
        <%if(user.equals("student"))
        {%>
            <br><br>
            <input type="submit" name="reg" value="Get Registered" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:250px">
        </div>
    </div>
            <%
            if(request.getParameter("reg")!=null){
                Statement t=conn.createStatement();
                ResultSet r=t.executeQuery("select clgid from Student where Uname='"+uname+"'");
                if(r.next()){
                    Statement t1=conn.createStatement();
                    ResultSet r2=t1.executeQuery("select * from Temp where clgid='"+r.getString(1)+"' and Eid="+eid+"");
                    if(r2.next()){%>
    <center><font color="white">You are already registered for this event</font></center>
                    <%}
                    else
                        response.sendRedirect("StudentReg.jsp?username="+uname+"&eid="+eid); 
                }
                else
                    response.sendRedirect("StudentReg.jsp?username="+uname+"&eid="+eid);      
            }
        }
        if(user.equals("member") || user.equals("admin") || user.equals("mentor")){%>
            <br><br>
            <input type="submit" name="viewreg" value="View Registerations" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:250px">&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="submit" name="update" value="Update" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="submit" name="delete" value="Delete" onclick="return confirm('Are you sure?')" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">&nbsp;&nbsp;&nbsp;&nbsp;
        </div>
    </div>
            <%if(request.getParameter("viewreg")!=null){%>
    <br><br><center>
    <table style="width:100%">
        <tr>
            <th><b>Name</b></th>
            <th><b>Year</b></th>
            <th><b>Email</b></th>
            <th><b>College-ID</b></th>
            <th><b>Phone</b></th>
            <th><b>Course</b></th>
        </tr>
                <%Statement t=conn.createStatement();
                ResultSet s=t.executeQuery("select clgid from Temp where eid="+eid+"");
                while(s.next()){
                    Statement t1=conn.createStatement();
                    ResultSet s1=t1.executeQuery("select * from Student where clgid='"+s.getString(1)+"' order by sname");
                    while(s1.next()){%>
        <tr>
            <td><%= s1.getString(1)%></td>
            <td><%= s1.getInt(2)%></td>
            <td><%= s1.getString(3)%></td>
            <td><%= s1.getString(7)%></td>
            <td><%= s1.getString(4)%></td>
            <td><%= s1.getString(5)%></td>
        </tr>
                    <%}
                }%>
    </table>
    </center>
            <%}
            if(request.getParameter("update")!=null){
                response.sendRedirect("MemberAction.jsp?action=update&user="+user+"&username="+uname+"&event="+eid);
            }
            if(request.getParameter("delete")!=null){
                Statement t=conn.createStatement();
                int i=t.executeUpdate("delete from Temp where eid="+eid+"");
                File f=new File("C:/Users/neelanshi sharma/Documents/NetBeansProjects/WILSAC/web/"+rs.getString(10));
                f.delete();
                i=t.executeUpdate("delete from Event where ename='"+ename+"'");
                if(i>0)
                    response.sendRedirect("Event.jsp?target="+uname+"&username="+uname+"&user="+user);
            }
        }
    }
%>
<footer>
    <div class="footer">
        <font size="5" face="arial" color="white"><br>Address:<br>Banasthali Vidyapith<br>Tonk Road<br>District Newai,Jaipur<br>Pincode:304022</font>
        <br><br>&copy WILSAC-The Online Registration Platform By  MNM Group
    </div>
<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
<script>
function change() // no ';' here
{
    var elem = document.getElementById("pay");
    if (elem.value==="Pay") elem.innerHTML = "Paid";
    else elem.innerHTML = "Paid";
}
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
