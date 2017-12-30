<%-- 
    Document   : showmessage
    Created on : 9 May, 2017, 11:46:54 AM
    Author     : VIDHI RATHI
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
    <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
    
    String qr="select * from askquestion";
    Statement stmt=con.createStatement();
    
    ResultSet rs=stmt.executeQuery(qr);
    
%>

    



<html>
    
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>showfeedback Page</title>
    </head>
    <body>
        <a href="index.html" class="w3-padding-large w3-hover-red w3-hide-small w3-right">Home</a>
        
         <table border="1" width="10" cellspacing="0" cellpadding="25">

            <tbody>
                <tr>
                    <td>Email</td>
                    <td>Name</td>
                    <td>Message</td>
                </tr>
                <%
                   while(rs.next())
                   {
                %>
                <tr>
                    <td> <%= rs.getString(1)%> </td>
                    <td> <%= rs.getString(2)%> </td>
                    <td> <%= rs.getString(3)%> </td>
                </tr>
            
            <%
                   }
            %>
            
            
            
            </tbody>
        </table>

        
        
        
    </body>
</html>
