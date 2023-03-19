<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Insurance policy</title>
   <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://codepen.io/skjha5993/pen/bXqWpR.css">
   <title>Employee Insurance policy</title>
   
   <style>
   
   
   label {
    font-weight: 600;
    color: #555;
}
body {
  background:  #92a8d1;
    
}
   </style>
</head>
<body>

    <div class="container">
        <form  method="post"  action="/get">
            <h2 class="text-center">Employee Insurance policy</h2><br>
            
        <div class="row jumbotron">
            <div class="col-sm-6 form-group">
                <label for="name-f">Employee Id</label>
                <input type="text" class="form-control" name="empid"  placeholder="Enter your EmployeeId" required>
            </div>
            <div class="col-sm-6 form-group">
                <label for="name-l">Employee Name</label>
                <input type="text" class="form-control" name="name"  placeholder="Enter your  name." required>
            </div>
            
            <div class="col-sm-6 form-group">
                <label for="name-l">Contact</label>
                <input type="text" class="form-control" name="contact"  placeholder="Enter your Contact." required>
            </div>
            <div class="col-sm-6 form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" name="email"  placeholder="Enter your email." required>
            </div>
            
            
            <div class="col-sm-6 form-group">
                <label for="email">Bank Account Number</label>
                <input type="text" class="form-control" name="bankaccountno"  placeholder="Enter your Account number" required>
            </div>
            
            <div class="col-sm-6 form-group">
                <label for="martialstatus">Martialstaus</label>
                <input type="text" class="form-control" name="martialstatus"  placeholder="Enter your Martialstatus." required>
            </div>
            <div class="col-sm-6 form-group">
                <label for="medicailcategory">Medicial Category</label>
                <input type="text" class="form-control" name="medicalcategory"placeholder="Enter your medicialcategory" required>
            </div>
            <div class="col-sm-6 form-group">
                <label for="Date">Effective date</label>
                <input type="Date" class="form-control" name="effectivedate"  placeholder="Enter the Effective Date" required>
            </div>
           
            <div class="col-sm-2 form-group">
                <label for="Date">Termination Date</label>
                <input type="text" class="form-control" name="terminationdate"  placeholder="Termination Date" required>
            </div>

            <div class="col-sm-6 form-group">
                <label for="Date">Date Of Birth</label>
                <input type="Date" name="dateofbirth" class="form-control" id="Date" placeholder="Enter Date of Birth" required>
            </div>
            
            
            
              <div class="col-sm-6 form-group">
                <label for="">Age</label>
                <input type="text" name="age" class="form-control" id="Date" placeholder="Enter Date of Birth" required>
            </div>
            <div class="col-sm-6 form-group">
                <label for="sex">Gender</label>
                <select name="sex" id="sex" class="form-control browser-default custom-select">
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="unspesified">Unspecified</option>
            </select>
            </div>
           
          
            

            <div class="col-sm-12 form-group mb-0">
               <button class="btn btn-primary float-right">Submit</button>
            </div>
           
            <button type="button"  class="btn btn-secondary">Add Depndency</button>
  
                        
            </div>
        </div>
        </form>
    </div>


</body>
</html>

</body>
</html>