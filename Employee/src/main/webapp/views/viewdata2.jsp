<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h> Viewdata2</h>

  
          </form>  

            <h style="color:red;">RETRIVE</h><br>
             
             <form method="post" action="/retrieve">
	         <label>Employee ID : </label> <br>
            <input type="text" name="empid" > <br><br>
             <label>Employee Department : </label> <br>
            <input type="text"  name="department"  ><br><br>
            <label>Email : </label>   <br>
            <input type="text"  name="email"  ><br><br>
            <label>EMPLOYEE NAME : </label>  <br>
            <input type="text" name="empname" > <br><br>
            <label>PHONENUMBER  : </label> <br>
            <input type="text"  name="phone" ><br><br>
            <button type="submit" style="color:"pink;">Submit</button><br>
           </div> 
             </form>
        
</body>
</html>