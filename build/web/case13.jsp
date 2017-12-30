
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
    <td>Fenugreek seeds with water<br>Tea without sugar<br> Biscuits</td>
    <td>1cup<br>1 cup<br>2</td>
  </tr>
  <tr>
    <td>Breakfast</td>
    <td>Stuffed methi/palak/lauki paratha<br>Curd<br>or<br>Paneer Bhurji<br>Plain chapati</td>
    <td>2 small<br>1 cup<br><br>1 medium bowl<br>2 small</td>
  </tr>
  <tr>
    <td>Mid morning</td>
    <td>Apple/Guava/Orange</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Lunch</td>
    <td>Chapati(no ghee)<br>Capsicum veg<br>salad(10 min before lunch)<br>Dal</td>
    <td>2<br>1 bowl<br>1 bowl<br>1 medium bowl</td>
  </tr>
  <tr>
    <td>Evening</td>
    <td>Milk/Herbal tea/Green tea/Lemon water<br>Roasted Chana+Muri</td>
    <td>1 cup<br>1 cup</td>
  </tr>
  <tr>
    <td>Dinner</td>
    <td>Chapati<br>Lauki Veg<br>Salad<br>Curd</td>
    <td>2<br>1 cup<br>1 bowl<br>1 cup</td>
  </tr>
</table>

    </head>
    <body>
        
    </body>
</html>
