<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h>Delete data</h>
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
         
            
            <button type="submit">Submit</button><br>
            <br>
             </div>  
</body>
</html>