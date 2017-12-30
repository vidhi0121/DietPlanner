<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}
body{
    background-color: #f2f2f2;
    align:center;
}
h3{
    margin-bottom: 5px;
}
div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    text-align: center;
}
.header{
    background-color: white;
    height:180px;
}

</style>
<body>
    <form action="displaydoc.jsp" method="post">
    <div class="header">
     <img src="befit.jpg" align="bottom" style="width:400px; height:180px;"> 
    </div>
    <h3 align="center" style="font-size:25px"><strong>Doctor Information</strong></h3>
    <h4 align="center">Insert the following details to take doctor's information</h4>

<div id="1">
    
        <table id="2" align="center" cellspacing="10">
            <tr id="3">
                <th align="left">Area</th>
                 </tr>
            <tr>
                
                <td><select name="Area" required><option>Select Area</option><option>Vijay Nagar</option><option>Palasia</option><option>Sapna Sangeeta</option><option>Sudama Nagar</option></select></td>
                
            </tr>
            <tr>
                
                <th align="left">Speciality</th>
                      
            </tr>
             <tr>
                  <td><select name="category" required><option>Select Specialist</option><option>Gynecologist</option><option>Dermatologist</option><option>E.N.T.</option><option>Dentist</option><option>Cardiologist</option></select></td>
</td>
             </tr>
            <tr>
                <th colspan="2"><input type="submit" value="Generate"/></th>
            </tr>
        </table>
</div>
    </form>
</body>
</html>
