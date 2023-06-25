<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

 
<html>
<%@ include file = "Header.jsp" %><br><br>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login and Registration form example</title>
 
<link rel="stylesheet" type="text/css" href="login.css">

 <style>

    body{
    margin: 0px;
    padding: 0px;
    text-align:center;
    width: 60%;
    background-color: #e6e6fae8;
    }
     
    input[type=text], input[type=password]{
    width:20%;
    padding:7px 10px;
    margin: 15px 0;
    display:inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    }
     
    button{
    background-color:#265df2;
    width: 20%;
    padding: 9px 5px;
    margin:10px 0px 0px 35px;
    cursor:pointer;
    border:none;
    color:#ffffff;
    font-size: 15px;
    font-weight: bold;
    }
     
    button:hover{
    opacity:0.8;
    }
     
    #un,#ps{
    font-family:'Lato', sans-serif;
    color: gray;
    }
 
 
    #container{
        position: absolute;
        top:0;
        bottom: 0;
        left: 0;
        right: 0;
        margin: auto;
        width:500;
        height: 300px;
        text-align: center;
    }
     
   
    
 </style>
</head>
 
<body>
 
<div id="container">
<form method="post"  action="/applyleave" >
 
<div class="border-box">
<h2>Apply leave</h2>
<br>

<label>Employee ID:</label>

<input type="number" name="empid"   placeholder="Enter your EmployeeId"  required>
 
 <label> LeaveType:</label>
<input type="text" name="leavetype"   placeholder="Enter your LeaveType"  required>
                  <div class="input-field">
                            <label>Leave Type</label>
                            <select name="leavetype" required>
                                <option >Select Leave type</option>
                                <option>Sickleave</option>
                                <option>Function</option>
                                <option>Others</option>
                            </select>
                        </div>

<label>From:</label>

<input type="date" name="fromdate" placeholder="Enter your fromdate"   required/>

<label>To:</label>
<input type="date"    placeholder="Enter your Todate" name="todate" />
<label>Reason:</label>

<input type="text"  placeholder="Enter your Reason"  name="reason" />  
<br>

 
<button type="submit" value="Login"  id="submit" onClick="alert('Applied leave Successfully')">Send Leave Request</button>
 

</div>
 
</form>
</div>
 
</body>
</html>
