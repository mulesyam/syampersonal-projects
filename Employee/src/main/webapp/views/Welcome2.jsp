<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome2</title>

</head>
<body>
<h2>Welcome to CRUD Operations </h2>
<div>
	  <label>Employee ID : </label> <br>
            <input type="text" name="empid" value=${empdao.empid} > <br><br>
             <label>Employee Department : </label> <br>
            <input type="text"  name="department"  value=${empdao.department}><br><br>
            <label>Email : </label>   <br>
            <input type="text"  name="email"  value=${empdao.email}><br><br>
            <label>EMPLOYEE NAME : </label>  <br>
            <input type="text" name="empname"  value=${empdao.empname}> <br><br>
            <label>PHONENUMBER  : </label> <br>
            <input type="text"  name="phonenumber"   value=${empdao.phone}><br><br>
         
            <br>
             </div>  
</body>
</html>