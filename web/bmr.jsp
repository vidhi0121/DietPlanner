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
    <h3 align="center" style="font-size:25px"><strong>BMR/BMI Calculation Details</strong></h3>
    <h4 align="center">Insert the following details to generate bmr and bmi.</h4>

<div>
    <form action="BmrTest" method="post">
        <table align="center" cellspacing="10">
            <tr>
                <th align="left">Weight</th>
                <th align="left">Height</th>
            </tr>
            <tr>
                <td><input type="text" placeholder="Weight(in kg)" name="wt" required="true"/></td>
                <td><input type="text" placeholder="Height(in foot)" name="ht" required="true"/></td>
            </tr>
            <tr>
                <th align="left">Age</th>
                <th align="left">Gender</th>
            </tr>
             <tr>
                <td><input type="text" placeholder="Age" name="age" required="true"/></td>
                <td><select name="Gender"><option>---Select Gender---</option><option>Female</option><option>Male</option></select></td>
            </tr>
            <tr>
                <th colspan="2"><input type="submit" value="Calculate"/></th>
            </tr>
        </table>
         </form>
</div>
</body>
</html>
