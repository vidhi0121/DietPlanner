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
    <td>Soaked Almonds<br>Tea/Coffe<br> Biscuits</td>
    <td>4<br>1 cup<br>2</td>
  </tr>
  <tr>
    <td>Breakfast</td>
    <td>Cold Cereals<br>Low fat milk<br>Banana</td>
    <td>3/4 cup<br>1 cup<br>1</td>
  </tr>
  <tr>
    <td>Mid morning</td>
    <td>Curd<br>Banana/Apple/Guava/Orange</td>
    <td>1 small bowl<br>1</td>
  </tr>
  <tr>
    <td>Lunch</td>
    <td>Cooked Brown Rice<br>Chicken<br>Salad(fresh greens,tomato,onion,broccoli)<br>Chapati</td>
    <td>1.5 cup<br>1 bowl<br>1 bowl<br>3</td>
  </tr>
  <tr>
    <td>Evening</td>
    <td>Bread Slice(with 4 teaspoon of jelly)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dinner</td>
    <td>Chapati<br>Chicken(with cheese)<br>Curd/Kadhi/dal</td>
    <td>2<br>1 bowl<br>1 bowl</td>
  </tr>
</table>

    </head>
    <body>
        
    </body>
</html>

