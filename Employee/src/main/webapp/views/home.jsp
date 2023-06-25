<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <script >

    function validateId() {
        var Id = document.forms.RegForm.empid.value;
        var regId = /\d+$/g;
        if (Id==null || !regId.test(Id)) {
        window.alert("Please enter your id properly.");
        return false();
        }
    }
    
    function validateDepartment(){
        var dept =document.forms.RegForm.department.value;
        var regdepartment = /\d+$/g;
        if (dept==null || regdepartment.test(dept)) {
                window.alert("Please enter your Department properly.");
                dept.focus();
                return false;
        }
    }
        
        function validateEmail() {
            var regEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/g;
            var email =
                    document.forms.RegForm.email.value;
            if (email == null || !regEmail.test(email)) {
                    window.alert("Please enter a valid e-mail address.");
                    email.focus();
                    return false;
                }
            }
    function validateName(){
    var name = document.forms.RegForm.empname.value;
    var regName = /\d+$/g;
    if (name==null || regName.test(name)) {
            window.alert("Please enter your name properly.");
            name.focus();
            return false;
    }
   
    }
    function validatePhone() {
    var phone = document.forms.RegForm.phone.value;
    var regPhone=/^\d{10}$/;
    if (phone==null || !regPhone.test(phone)) {
             alert("Please enter valid phone number.");
             phone.focus();
             return false;
         }
    }
   
 
    function validate() {
    window.alert("submitted successfully");
    return true;
    }
    </script>


<meta charset="ISO-8859-1">
<title>WELCOME TO JSP PAGES</title>
</head >
<body   bgcolor="#CDCDCC" font-family="cursive" font-size="20px;" font-weight="bold">

<h style="color:green;">CRUD OPERATIONS</h><br>
<br>



	<h style="color:tomato;">CREATE</h>
	<form name="RegForm" method="post" action="/create">

        <div class="container">  
            <label>Employee ID : </label> <br>
            <input type="text" name="empid"  onblur="validateId()" > <br><br>
            <label>Employee Department : </label> <br>
            <input type="text"  name="department" onblur="validateDepartment()"><br><br>
            <label>Email : </label>   <br>
            <input type="text"  name="email"  onblur="validateEmail()"><br><br>
            <label>EMPLOYEE NAME : </label>  <br>
            <input type="text" name="empname" onblur="validateName()"> <br><br>
            <label>PHONENUMBER : </label> <br>
            <input type="text"  name="phone" onblur="validatePhone ()"><br><br>
         
            <button  style="background-color:pink" type="submit">Submit</button><br>
        </div>  
        
        
          </form>  

            <h style="color:red;">RETRIVE</h><br>
             <form method="post" action="/retrievebyid">
	  <label>Employee ID : </label> <br>
            <input type="text" name="empid"> <br><br>
              <button style="background-color:pink" type="submit" style="color:"pink;">Submit</button><br>
              </form>
              
               <form method="post" action="/retrievebydepartment">
	  <label>Employee Department : </label> <br>
            <input type="text" name="department" > <br><br>
              <button  style="background-color:pink" type="submit">Submit</button><br>
              </form>
              
              
              <form method="post" action="/retrievebyemail">
            <label> Email : </label> <br>
            <input type="text"  name="email"> <br><br>
            <button  style="background-color:pink" type="submit">Submit</button><br>
            
            </form>
            
            <form method="post" action="/retrievebyempname">
            <label> EMPLOYEE NAME : </label> <br>
            <input type="text"  name="empname"> <br><br>
            <button style="background-color:pink"  type="submit">Submit</button><br>
            
            </form>
             <form method="post" action="/retrievebyphone">
            <label> PHONENUMBER : </label> <br>
            <input type="text"  name="phone"> <br><br>
            <button style="background-color:pink" type="submit">Submit</button><br>
            
            </form>
        
             
        <h style="color:green;">UPDATE</h><br>
	
	<form method="post" action="/update">
	  <label>Employee ID : </label> <br>
            <input type="text" name="empid"  required > <br><br>
            <label>Employee Department : </label> <br>
            <input type="text"  name="department" required><br><br>
            <label>Email : </label>   <br>
            <input type="text"  name="email" required><br><br>
            <label>EMPLOYEE NAME : </label>  <br>
            <input type="text" name="empname" required> <br><br>
            <label>PHONENUMBER  : </label> <br>
            <input type="text"  name="phone" required><br><br>
         
            <button style="background-color:pink" type="submit">Submit</button><br><br>
         
            <br>
        </form>
         
        
         <h style="color:yellow;">DELETE</h><br>
	<br>
       	<form method="post" action="delete">
	
        <div class="container">  
            <label>Employee ID : </label> <br>
            <input type="text" name="empid" > <br><br>
             <button  style="background-color:pink" type="submit">Submit</button><br>
             </div>
             
    </form>  
	</body>
	</html>	