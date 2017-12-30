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
    <div class="header">
     <img src="befit.jpg" align="bottom" style="width:400px; height:180px;"> 
    </div>
    <h3 align="center" style="font-size:25px"><strong>Dietform Details</strong></h3>
    <h4 align="center">Insert the following details to generate dietchart.</h4>

<div>
    <form action="DietForm" method="post">
        <table align="center" cellspacing="10">
            <tr>
                <th align="left">Gender</th>
                <th align="left">Diseases</th>
                
            </tr>
            <tr>
                <td><select name="Gender" required><option>Select Gender</option><option>Female</option><option>Male</option></select></td>
                <td><select name="Disease" required><option>Diseases if any</option><option>Obesity</option><option>Jaundice</option><option>Diabetes</option><option>Typhoid</option><option>Blood Pressure</option><option>None</option></select></td>
                
            </tr>
            
            <tr>
                <th align="left">Allergy</th>
                <th align="left">Category</th>
            </tr>
             <tr>
                 <td><select name="Allergy" required><option>Allergy if any</option><option>SeaFood</option><option>Milk Products</option><option>Peanut</option><option>Egg</option><option>Lime</option></select></td>
                 <td><select name="category" required><option>Select Category</option><option>Vegetarian</option><option>Non-Vegetarian</option></select></td>
</td>
             </tr>
             <tr>
               <th align="left">Other Conditions</th> 
                
            </tr>
            <tr>
                <td><select name="Other" required><option>Other Conditions</option><option>Pregnancy</option><option>None</option></select></td>
            </tr>
             
            <tr>
                <th colspan="2"><input type="submit" value="Calculate"/></th>
            </tr>
        </table>
         </form>
</div>
</body>
</html>
