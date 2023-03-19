<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Sign Up - CodeJava</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"> </script>
    <style>@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.container{
  max-width: 700px;
  width: 100%;
  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
  font-size: 25px;
  font-weight: 500;
  position: relative;
}
.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 0 12px 0;
}
form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
}
form .input-box span.details{
  display: block;
  font-weight: 500;
  margin-bottom: 5px;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 16px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}
.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #9b59b6;
}
 form .gender-details .gender-title{
  font-size: 20px;
  font-weight: 500;
 }
 form .category{
   display: flex;
   width: 80%;
   margin: 14px 0 ;
   justify-content: space-between;
 }
 form .category label{
   display: flex;
   align-items: center;
   cursor: pointer;
 }
 form .category label .dot{
  height: 18px;
  width: 18px;
  border-radius: 50%;
  margin-right: 10px;
  background: #d9d9d9;
  border: 5px solid transparent;
  transition: all 0.3s ease;
}
 #dot-1:checked ~ .category label .one,
 #dot-2:checked ~ .category label .two,
 #dot-3:checked ~ .category label .three{
   background: #9b59b6;
   border-color: #d9d9d9;
 }
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   margin: 35px 0
 }
 form .button input{
   height: 100%;
   width: 100%;
   border-radius: 5px;
   border: none;
   color: #fff;
   font-size: 18px;
   font-weight: 500;
   letter-spacing: 1px;
   cursor: pointer;
   transition: all 0.3s ease;
   background: linear-gradient(135deg, #71b7e6, #9b59b6);
 }
 form .button input:hover{
  /* transform: scale(0.99); */
  background: linear-gradient(-135deg, #71b7e6, #9b59b6);
  }
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
  form .category{
    width: 100%;
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
}
    
    </style>
</head>
<body>
    <div class="container text-center">
        <div>
            <h1>User Registration - Sign Up</h1>
        </div>
        <form th:action="@{/register}" method="post" style="max-width: 600px; margin: 0 auto;">
        <div class="m-3">
         
           
        
            <div class="form-group row">
                <label class="col-4 col-form-label">E-mail: </label>
                <div class="col-8">
                    <input type="email" name="email"  onblur="validateEmail()" class="form-control" required  />
                </div>
            </div>
            
            <div class="form-group row">
                <label class="col-4 col-form-label">empid: </label>
                <div class="col-8">
                    <input type="number" name="empid"  onblur="validateId()" class="form-control" required />
                </div>
            </div>
             
            
             
            <div class="form-group row">
                <label class="col-4 col-form-label">First Name: </label>
                <div class="col-8">
                    <input type="text" id="letters" name="firstName"  onblur="validateFirstName()"  pattern="^[A-Za-zÀ-ÿ ,.'-]+$"class="form-control" required minlength="2" maxlength="20"/>
                </div>
            </div>
             
            <div class="form-group row">
                <label class="col-4 col-form-label">Last Name: </label>
                <div class="col-8">
                    <input type="text" id="last" name="lastName" onblur="validateLastName()"class="form-control"
                            required minlength="2" maxlength="20" />
                </div>
            </div>
            <div class="form-group row">
                <label class="col-4 col-form-label">Password: </label>
                <div class="col-8">
               
                    <input type="password"  name="password"  class="form-control"   id="myInput"
                            required minlength="5" maxlength="10"/> 
                    <input type="checkbox" onclick="myFunction()">Show Password
                           
                </div>
            </div>
             
            <div>
                <button type="submit"  class="btn btn-primary">Sign Up</button>
            </div>
        </div>
        
        </form>
    </div>
</body>


 
 <script>
 function validateId() {
     var id = document.forms.RegForm.empid.value;
     var regName = /\d+$/g;
     if (id==null || !regName.test(id)) {
     	window.alert("Please enter your id properly.");
     }
 }
 function validateFirstName(){
 	var firstname = document.forms.RegForm.empname.value;
 	var regName = /\d+$/g;
 	if (name==null || regName.test(firstname)) {
         window.alert("Please enter your firstname properly.");
 	}
 	
 }
 
 function validateLastName(){
	 	var lastname = document.forms.RegForm.empname.value;
	 	var regName = /\d+$/g;
	 	if (name==null || regName.test(lastname)) {
	         window.alert("Please enter your lastname properly.");
	 	}
	 	
	 }
	 	
 }
 function validateEmail() {
 	var regEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/g;
 	var email =
         document.forms.RegForm.email.value;
 	if ( email==null || !regEmail.test(email)) {
         window.alert("Please enter a valid e-mail address.");
         email.focus();
         return false();
     }
 }
 function validate() {
 	window.alert("submitted successfully");
 	return true;
 }

 </script>
 <script>
 
 function myFunction() {
	  var x = document.getElementById("myInput");
	  if (x.type === "password") {
	    x.type = "text";
	  } else {
	    x.type = "password";
	  }
	}
 </script>

</html>