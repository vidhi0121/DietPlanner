<%-- 
    Document   : newjsp
    Created on : 16 Apr, 2017, 10:45:50 PM
    Author     : VIDHI RATHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Register" method="post">
        <pre>

           
         <input type="text"     class="input"   name="name"  id="password" placeholder="Username" required="true"/>
         <input type="password" class="input"   name="pass"  id="password" placeholder="Password" required="true"/>
         <input type="password" class="input"   name="cpass"  id="password" placeholder="Confirm Password" required="true"/>
         <input type="text"    class="input"   name="email"  id="password" placeholder="Emailid" required="true"/>
      <input type="submit" value="register">
    </pre>
        
        
    </body>
</html>
