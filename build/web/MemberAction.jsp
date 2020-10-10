<%-- 
    Document   : Member
    Created on : Feb 3, 2020, 12:39:59 AM
    Author     : neelanshi sharma
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
    <title>Club Member Action</title>
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
textarea{
    overflow-y: scroll;
    overflow-x: scroll;
    height: 100px;
    resize: none; 
}       
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
</style>
</head>
<body> 
<form method="post">
<div class="topnav">
    <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px"onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
</div>
<%
    String user=request.getParameter("user");
%>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Dashboard.jsp?username=<%= uname%>">Profile</a>
    <%if(user.equals("Member")){%>
    <a href="ClubList.jsp?username<%= uname%>">Event Registration</a>
    <%}%>
    <a href="AboutUs.jsp?username<%= uname%>">About Us</a>
    <a href="ContactUs.jspusername<%= uname%>">Contact Us</a>
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
<%  
    int eid=Integer.parseInt(request.getParameter("event"));
    String cname=request.getParameter("target");
    String action=request.getParameter("action");
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement();
    if(action.equals("club")){
        ResultSet rs=st.executeQuery("select email from Login where username='"+uname+"'");
        Statement s=conn.createStatement();
        if(rs.next()){
            ResultSet r=s.executeQuery("select clubname from Mentor where memail='"+rs.getString(1)+"'");
            if(r.next()){%>
<center>
    <font face="arial" size="7" color="white"><b>Club Details</b></font><br>
    <font face="arial" size="5" color="white">Social Media Links</font>
    <table>  
        <tr>
            <td><font size="5">Facebook:</font></td>
            <td><input type="text" size=80px name="fb"><br></td>
        </tr>
        <tr>
            <td><font size="5">Instagram:</font></td>
            <td><input type="text" size=80px name="ig"><br></td>
        </tr>
        <tr>
            <td><font size="5">LinkedIn:</font></td>
            <td><input type="text" size=80px name="lin"><br></td>
        </tr>
        <tr>
            <td><font size="5">Email:</font></td>
            <td><input type="text" size=80px name="gm"><br></td>
        </tr>
        <br><br>
    </table>
    <input type="submit" name="upd" value="Update" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">
</center>    
    <%          if(request.getParameter("upd")!=null){
                    int i=st.executeUpdate("update Club set fblink='"+request.getParameter("fb")+"',"
                                + "iglink='"+request.getParameter("ig")+"',linkedin='"+request.getParameter("lin")+"',"
                                + "gmail='"+request.getParameter("gm")+"' where cname='"+r.getString(1)+"'");
                    response.sendRedirect("Dashboard.jsp?username="+uname);
                }
            }
        }  
    }
    if(action.equals("delm")){
        int i=st.executeUpdate("delete from Student where semail='"+cname+"'");
        i=st.executeUpdate("delete from Login where email='"+cname+"'");
        i=st.executeUpdate("delete from ClubMember where cmemail='"+cname+"'");
        response.sendRedirect("Dashboard.jsp?username="+uname);
    }
    if(action.equals("update")){%>
<center>
    <font face="arial" size="7" color="white"><b>Event Details</b></font>
    <table>  
        <tr>
            <td><font size="5">Date:</font></td>
            <td><input type="date" size=30px name="date" required="required"/><br></td>
        </tr>
        <tr>
            <td><font size="5">Time:</font></td>
            <td><input type="time"size=30px name="time" required="required"/><br></td>
        </tr>    
        <tr>
            <td><font size="5">Venue:</font></td>
            <td><input type="text"size=30px name="venue" required="required"/><br></td>
        </tr> 
        <br><br>
    </table>
    <input type="submit" name="upd" value="Update" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">
</center>
        <%
        if(request.getParameter("upd")!=null){
            String venue=request.getParameter("venue");
            String time=request.getParameter("time");
            String date=request.getParameter("date");
            int i=st.executeUpdate("update Event set date='"+date+"', venue='"+venue+"', time='"+time+"' where eid="+eid+"");
            if(i>0){
                ResultSet r=st.executeQuery("select ename from Event where eid="+eid+"");
                while(r.next()){
                    response.sendRedirect("EventDetail.jsp?event="+r.getString(1)+"&username="+uname+"&user="+user);}
            }
        }
    }
    if(action.equals("adde")){%>
<center>
    <font face="arial" size="7" color="white"><b>Event Details</b></font>
    <table>
        <tr>
            <td><font size="5">Event Name:</font></td>
            <td><input type="text" size=30px name="ename" required="required"/><br></td>
        </tr>
        <tr>
            <td><font size="5">Date:</font></td>
            <td><input type="date" size=30px name="date" required="required"/><br></td>
        </tr>
        <tr>
            <td><font size="5">Time:</font></td>
            <td><input type="time"size=30px name="time" required="required"/><br></td>
        </tr>    
        <tr>
            <td><font size="5">Venue:</font></td>
            <td><input type="text"size=30px name="venue" required="required"/><br></td>
        </tr>    
        <tr>
            <td><label for="category"><font size="5">Choose a category:</font></label></td>
            <td>
                <select id="category" name="category">
                <option value="Pen-Paper">Pen-Paper</option>
                <option value="Submission">Submission</option>
                <option value="Workshop">Workshop</option>
                </select>
            </td>
        </tr><br>
        <tr>
            <td><font size="5">Amount:</font></td>
            <td><input type="number" size=15px name="amount" required="required"/><br></td>
        </tr>
        <tr>
            <td><font size="5">Description:</font></td>
            <td><textarea name="desc" placeholder="description" required="required"></textarea><br></td>
        </tr>     
        <br><br>
    </table>
    <input type="submit" name="done" value="Add" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">
</center>
        <% 
        if(request.getParameter("done")!=null){
            int cid=0;
            String name=request.getParameter("ename");
            String date=request.getParameter("date");
            String venue=request.getParameter("venue");
            String time=request.getParameter("time");
            String desc=request.getParameter("desc");
            String category=request.getParameter("category");
            int amount=Integer.parseInt(request.getParameter("amount")); 
            ResultSet rs=st.executeQuery("select cid from Club where cname='"+cname+"'");
            while(rs.next()){
                cid=rs.getInt(1);
            }
            int i=st.executeUpdate("insert into Event(ENAME,DESCRIPTION, DATE, TIME, VENUE, CATEGORY, AMOUNT, CID) "
                    + "values('"+name+"','"+desc+"','"+date+"','"+time+"','"+venue+"','"+category+"',"+amount+","+cid+")");
            if(i>0)
                response.sendRedirect("ImgUpload.jsp?target=event&name="+name+"&username="+uname+"&user="+user+"&cname="+cname);
            else
                out.println("try again");
            
        }
    }
%>
</form>
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

</body>
</html>