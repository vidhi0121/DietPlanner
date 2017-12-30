<%-- 
    Document   : bmrsuccess
    Created on : 19 Apr, 2017, 10:51:23 PM
    Author     : VIDHI RATHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
   String gender=(String)session.getAttribute("gender");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>bmr/bmi success Page</title>
    <a href="index.html">Home</a>
    </head>
    <style>
        body
        {
            background-color: peachpuff;
        }
body,h1,h2,h3{font-family: "Raleway", sans-serif}
body, html {height: 100%}
p {line-height: 2}
</style>

    <body>
        <form action="BmrTest" method="post">
           
                
            
            <h1>Your BMR is:</h1>
            <% 
   if(gender.equals("Male"))
   {  
       double bmrm=(Double)session.getAttribute("bmrm");
       out.println(bmrm);
       
       
   %>
   <p>Calories/day</p>
   <h2>Your BMI is:</h2>
   
   
   <%
       double bmi=(Double)session.getAttribute("bmi");
       
       out.println(bmi);
       }
   
       else
   {
       double bmrf=(Double)session.getAttribute("bmrf");
        out.println(bmrf);
       
       %>
       <p>Calories/day</p>
       <h3 style="font-size: 35px">Your BMI is:</h3>
       <%
      double bmi=(Double)session.getAttribute("bmi");
       
      out.println(bmi);
   
   }
   
            %>
           <p><strong>
                   <pre>
                    BMI Cutoff	          -      Weight Status</strong></p>
                    <p>                             <0.1	  -      Underweight <br>
                        0.1 - 0.2	  -      Healthy weight range<br>
                        0.2 - 0.4	  -      Overweight<br>
                        >0.4	          -      Obese<br>
                    </pre>
                                </p>

           
            
                   
        </form>
    </body>
</html>
