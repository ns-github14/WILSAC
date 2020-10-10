<%-- 
    Document   : Dashboard
    Created on : Apr 26, 2020, 3:27:19 PM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dashboard</title>
<%
    response.setHeader( "Expires", "Sat, 6 May 1995 12:00:00 GMT" );
    // set standard HTTP/1.1 no-cache headers
    response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
    // set IE extended HTTP/1.1 no-cache headers
    response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
    // set standard HTTP/1.0 no-cache header
    response.setHeader( "Pragma", "no-cache" );
    String uname=request.getParameter("username"); 
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "") || uname == null || uname == ""){
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
table, th{
    text-align: center;
    color: white;
    font-size: large;
    text-align: center;
    font-size: large;
}
/* Avatar image */
img.avatar {
  width: 30%;  
  border-radius: 50%;
  float: right;
}
.row {
  display: flex;
}
.column {
  flex: 50%;
  padding: 10px;
}
.dropdown {
  position: relative;
  display: inline-block;
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

/* Content */
.content {
  padding: 10px;
  text-align: center;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: lightgrey;
    font-size: small;
    font-family: "Arial";
    min-width: 200px;
    z-index: 1;
}
.dropdown-content a {
    color: black;
    padding: 10px 15px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {background-color: white;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: grey;}
</style>
</head>
<body>
    <form method="post">
    <%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/WILSAC", "wilsac", "wilsac");
    Statement st=conn.createStatement(),s1=conn.createStatement(),s2=conn.createStatement(),s3=conn.createStatement();
    ResultSet r=st.executeQuery("select type, email from Login where username='"+uname+"'"),r1,r2,r3;
    while(r.next()){%>
        <div class="topnav">
            <span style="font-size:30px;cursor:pointer;color:white;padding-top:0px" onclick="openNav()">&#9776;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
            <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure?')"><b>Logout</b></a>
        </div>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="Logout.jsp?username=<%= uname%>" onclick="return confirm('Are you sure you want to LogOut?')">Home</a>
            <%if(r.getString(1).equals("Student")){%>
                <a href="ClubList.jsp?username=<%= uname%>">Club List</a>
            <%}
            if(r.getString(1).equals("Member")){%>
                <a href="ClubList.jsp?username=<%= uname%>">Club List</a>
            <%}
            if(r.getString(1).equals("Mentor")){%>
            <a href="MemberAction.jsp?username=<%= uname%>&action=club&user=Mentor&event=0">Club Details</a>
            <%}%>
            <a href="AboutUs.jsp?username=<%= uname%>">About Us</a>
            <a href="ContactUs.jsp?username=<%= uname%>">Contact Us</a>
        </div><br>
        <div id="main">
            <div class="row">
                <div class="column">
                    <img src="images/user.jpg" alt="Avatar" class="avatar">
                </div>
                <div class="column">
                    <br><br>
                    <font color="white" size="4">
                        <b>Username: </b>
                        <input type="text" name="uname" style="background: none;border: none;color: white;font-size:17px;" value="<%= uname%>"><br>
            <%if(r.getString(1).equals("Student")){
                r1=s1.executeQuery("select * from Student where uname='"+uname+"'");
                if(r1.next()){%>
                        <b>Year: </b>
                        <input type="text" name="sem" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getInt(2)%>"><br>
                        <b>Course: </b>
                        <input type="text" name="course" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(5)%>"><br>
                        <b>Email-ID: </b>
                        <input type="text" name="email" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(3)%>"><br>
                        <b>Contact: </b>
                        <input type="text" name="contact" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(4)%>"><br><br>
                        <input type="submit" name="save" value="Save Changes" style="font-size:15px;color:white;background-color:midnightblue;width:150px">
                        <br>
                    </font>
                </div>
            </div>
                    <%
                    if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', "
                                + "username='"+request.getParameter("uname")+"' where username='"+uname+"'");
                        i=s.executeUpdate("update Student set sphone='"+request.getParameter("contact")+"', "
                                + "semail='"+request.getParameter("email")+"', course='"+request.getParameter("course")+"', "
                                + "uname='"+request.getParameter("uname")+"', semester="+Integer.parseInt(request.getParameter("sem"))+" "
                                + "where clgid='"+r1.getString(7)+"'");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    }
                    r2=s2.executeQuery("select * from Temp where clgid='"+r1.getString(7)+"'");%>
            <br><br>
            <font color="white" size="5">You have registered for the following events:</font><br><br>
            <center>
                <table style="width:100%">
                    <tr>
                        <th><b>Name</b></th>
                        <th><b>Description</b></th>
                        <th><b>Date</b></th>
                        <th><b>Time</b></th>
                        <th><b>Venue</b></th>
                        <th><b>Category</b></th>
                        <th><b>Club</b></th>
                    </tr>        
                    <%while(r2.next()){
                        r3=s3.executeQuery("select * from Event where eid="+r2.getInt(2)+" order by date");
                        while(r3.next()){
                            Statement s4=conn.createStatement();
                            ResultSet r4=s4.executeQuery("select cname from Club where cid="+r3.getInt(9)+"");
                            while(r4.next()){%>
                    <tr>
                        <td><%= r3.getString(2)%></td>
                        <td><%= r3.getString(3)%></td>
                        <td><%= r3.getString(4)%></td>
                        <td><%= r3.getString(5)%></td>
                        <td><%= r3.getString(6)%></td>
                        <td><%= r3.getString(7)%></td>
                        <td><%= r4.getString(1)%></td>
                    </tr>
                            <%}
                        }
                    }%>
                </table>
            </center>
        </div>
            <%}
            }
            if(r.getString(1).equals("Mentor")){
                r1=s1.executeQuery("select * from Mentor where MEmail='"+r.getString(2)+"'");
                while(r1.next()){%>
                        <b>Club: </b>
                        <%= r1.getString(4)%><br>
                        <b>Email-ID: </b> 
                        <input type="text" name="email" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(3)%>"><br>
                        <b>Contact: </b> 
                        <input type="text" name="contact" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(5)%>"><br><br>
                        <input type="submit" name="save" value="Save Changes" style="width:150px;font-size:15px;color:white;background-color:midnightblue;"><br>
                    </font>
                </div>
            </div>
                    <%if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', username='"+request.getParameter("uname")+"' where email='"+r1.getString(3)+"'");
                        i=s.executeUpdate("update Mentor set mphone='"+request.getParameter("contact")+"', memail='"+request.getParameter("email")+"' where mid="+r1.getString(1)+"");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    } 
                    r2=s2.executeQuery("select cmname, cmemail, cmyear from ClubMember where cname='"+r1.getString(4)+"' order by cmyear");
                    r3=s3.executeQuery("select count(*) from ClubMember where cname='"+r1.getString(4)+"'");
                    while(r3.next()){%>
            <br><br>
            <font color="white" size="5">Following are the <%= r3.getInt(1)%> active Club Members:</font><br>
                    <%}%>
            <center>
                <div class="row">
                    <div class="col-4">
                        <center><b>Name</b></center></div>
                    <div class="col-4"><center><b>Email-Id</b></center></div>
                    <div class="col-4"><center><b>Year</b></center></div>
                </div>
                    <%while(r2.next()){%>
                    <div class="row">
                    <div class="col-4">
                        <center>
                            <div class="dropdown">
                                <font color="white"><%= r2.getString(1)%></font>
                                <div class="dropdown-content">
                                    <a href="MemberAction.jsp?user=<%= r.getString(1)%>&event=0&action=delm&username=<%= uname%>&target=<%= r2.getString(2)%>">Delete Member</a>
                                </div>
                            </div>
                        </center>
                    </div>
                    <div class="col-4">
                        <center><%= r2.getString(2)%></center></div>
                    <div class="col-4">
                            <center><%= r2.getString(3)%></center></div>
                    </div>
                    <%}%>
                <br><br>
                <input type="submit" name="back" value="Back" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:100px">
                <input type="submit" name="addm" value="Add Members" style="font-size:20px;color:white;background-color:midnightblue;padding:3px;width:200px"></form><br>
            </center>
                    <%if(request.getParameter("addm")!=null){
                        response.sendRedirect("admaction.jsp?target="+r1.getString(4)+"&action=addm&username="+uname);
                    }
                    if(request.getParameter("back")!=null){
                        response.sendRedirect("Event.jsp?username="+uname+"&target="+r1.getString(4)+"&user=mentor");
                    }
                }
            }
            if(r.getString(1).equals("Member")){
                r1=s1.executeQuery("select * from ClubMember where CMEmail='"+r.getString(2)+"'");
                while(r1.next()){%>
                        <b>Year: </b> 
                        <input type="text" name="year" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getInt(4)%>"><br>
                        <b>Club: </b><%= r1.getString(5)%><br>
                        <b>Email-ID: </b> 
                        <input type="text" name="email" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(3)%>"><br>
                        <b>Contact: </b> 
                        <input type="text" name="contact" style="background: none;border: none;color: white;font-size:17px;" value="<%= r1.getString(6)%>"><br><br>
                        <input type="submit" name="save" value="Save Changes" style="width:150px;font-size:15px;color:white;background-color:midnightblue;"><br>
                    </font>
                </div>
            </div>
                    <%if(request.getParameter("save")!=null){
                        Statement s=conn.createStatement();
                        int i=s.executeUpdate("update Login set email='"+request.getParameter("email")+"', username='"+request.getParameter("uname")+"' where email='"+r1.getString(3)+"'");
                        i=s.executeUpdate("update ClubMember set cmphone='"+request.getParameter("contact")+"', cmemail='"+request.getParameter("email")+"', cmyear="+Integer.parseInt(request.getParameter("year"))+" where cmid="+r1.getString(1)+"");
                        i=s.executeUpdate("update Student set sphone='"+request.getParameter("contact")+"', semail='"+request.getParameter("email")+"' where sname='"+r1.getString(2)+"'");
                        response.sendRedirect("Dashboard.jsp?username="+request.getParameter("uname"));
                    } 
                    r2=s2.executeQuery("select clgid from Student where semail='"+r1.getString(3)+"'");
                    if(r2.next()){
                        r3=s3.executeQuery("select eid from Temp where clgid="+r2.getString(1)+"");
                        while(r3.next()){
                            Statement s4=conn.createStatement();
                            ResultSet r4=s4.executeQuery("select * from Event where eid="+r3.getInt(1)+" order by date");
                            while(r4.next()){
                                Statement s5=conn.createStatement();
                                ResultSet r5=s5.executeQuery("select cname from Club where cid="+r4.getInt(9)+"");
                                while(r5.next()){%>
            <br><br>
            <font color="white" size="5">You have registered for the following events:</font><br><br>
            <center>
                <table style="width:100%">
                    <tr>
                        <th><b>Name</b></th>
                        <th><b>Description</b></th>
                        <th><b>Date</b></th>
                        <th><b>Time</b></th>
                        <th><b>Venue</b></th>
                        <th><b>Category</b></th>
                        <th><b>Club</b></th>
                    </tr>
                    <tr>
                        <td><%= r4.getString(2)%></td>
                        <td><%= r4.getString(3)%></td>
                        <td><%= r4.getString(4)%></td>
                        <td><%= r4.getString(5)%></td>
                        <td><%= r4.getString(6)%></td>
                        <td><%= r4.getString(7)%></td>
                        <td><%= r5.getString(1)%></td>
                    </tr>
                </table>
            </center>
                                <%}
                            }
                        }
                    }
                }
            }
            else{%>
            </font>
            </div></div>
            <%}
        }
%>    
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
function addRemoveAttr(){
    var contenteditable = document.getElementById('txt1').contentEditable;
    if(contenteditable == 'inherit' || contenteditable == 'false'){
        document.getElementById('txt1').contentEditable = true;
    }else{
        document.getElementById('txt1').contentEditable = false;
    }
    var elem = document.getElementById("but_enable");
    if (elem.value=="Edit")
        elem.value = "save";			
    else elem.value = "Edit";
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

