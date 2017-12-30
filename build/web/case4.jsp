<%-- 
    Document   : dietform
    Created on : 20 Apr, 2017, 9:06:57 AM
    Author     : VIDHI RATHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diet form</title>
        <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 95%;
   
}
body{
    background-color: lightgray;
    
}

td, th {
   
    border: 1px solid black;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}
th
{
    background-color: black;
    color:white;
}
</style>
</head>
<body>
    <a href="afterlogin.jsp" class="w3-padding-large w3-hover-red w3-hide-small w3-right">Home</a>
    <h1 align="center">Diet Chart</h1>
    <br>
    <br>
<table align="center">
  <tr>
    <th>Timing</th>
    <th>Food item</th>
    <th>Quantity</th>
  </tr>
  <tr>
    <td>Early Morning</td>
    <td>Lukewarm water with lime and honey</td>
    <td>1 glass</td>
  </tr>
  <tr>
    <td>Breakfast</td>
    <td>Fresh Fruit(any)<br>Milk(Sweetened with honey or jaggery)</td>
    <td>1<br>1 cup</td>
  </tr>
  <tr>
    <td>Mid morning</td>
    <td>Lemon or Carrot juice</td>
    <td>1 glass</td>
  </tr>
  <tr>
    <td>Lunch</td>
    <td>Raw veg salad<br>Steamed veg<br>Wheat tortilla<br>Buttermilk</td>
    <td>1 bowl<br>1 med bowl<br>1<br>1 glass</td>
  </tr>
  <tr>
    <td>Evening</td>
    <td>Coconut Water/Sugarcane juice</td>
    <td>1 glass</td>
  </tr>
  <tr>
    <td>Dinner</td>
    <td>Veg Soup<br>Boiled veg<br>Wheat tortilla</td>
    <td>1 bowl<br>1 bowl<br>1 </td>
  </tr>
</table>

    </head>
    <body>
        
    </body>
</html>
