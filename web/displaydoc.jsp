<%-- 
    Document   : displaydoc
    Created on : 7 May, 2017, 12:27:21 PM
    Author     : VIDHI RATHI
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
   String Area=request.getParameter("Area");
   String Specialization=request.getParameter("category");
try 
{
              ResultSet rs;
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
              String qr="select * from docinfo where Area=? and Specialization=?";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,Area);
              ps.setString(2,Specialization);
              rs=ps.executeQuery();
       
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display docinfo Page</title>
        
        <a href="index.html">Home</a>
        <style>
table {
    border-collapse: collapse;
    width: 100%;
    
}

th, td {
    text-align: left;
    padding: 8px;
    
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color:black;
    color: white;
}
</style>
    </head>
    <body>
        <table>
            
            <tr>
                 <th>Area</th>
                 <th>Specialization</th>
                 <th>Name</th>
                 <th>Address</th>
                 <th>Timings</th>
                 <th>Fees</th>
                 <th>Contact</th>
             </tr>
          
<%
while(rs.next())
       {
        
        String Name=rs.getString(3);
        String Address=rs.getString(4);
        String Timings=rs.getString(5);
        String Fees=rs.getString(6);
        String Contact=rs.getString(7);
        
%>


<tr>
                 <td><%=Area%></td>
                 <td><%=Specialization %></td>
                 <td><%=Name %></td>
                 <td><%=Address %></td>
                 <td><%=Timings %></td>
                 <td><%=Fees %></td>
                 <td><%=Contact %></td>
             </tr>
             
      





   <%    
       }
}
catch(Exception e)
{
System.out.println(e);
}
    
%>
    
    
    
             
             
             
        </table>
        
        
        
    </body>
</html>
