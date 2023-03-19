<%@page import="com.example.demo.EmployeeDao.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.example.demo.EmployeeDao.User"%>
<html>

<head>
<%@ include file="Header.jsp"%><br>
<br>
<meta charset="ISO-8859-1">



<script src="https://cdn.jsdelivr.net/npm/@jsuites/cropper/cropper.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@jsuites/cropper/cropper.min.css" type="text/css" />
 
 

<script src="https://jsuites.net/v4/jsuites.js"></script>
<link rel="stylesheet" href="https://jsuites.net/v4/jsuites.css" type="text/css" />
<script src="https://cdn.jsdelivr.net/npm/@jsuites/cropper/cropper.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@jsuites/cropper/cropper.min.css" type="text/css" />
 
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
	


<style>

body {
	background: #e6e6fae8 ;
}

.form-control:focus {
	box-shadow: none;
	border-color: #BA68C8
}

.profile-button {
	background: rgb(99, 39, 120);
	box-shadow: none;
	border: none
}

.profile-button:hover {
	background: #682773
}

.profile-button:focus {
	background: #682773;
	box-shadow: none
}

.profile-button:active {
	background: #682773;	
	box-shadow: none
}

.back:hover {
	color: #682773;
	cursor: pointer
}

.labels {
	font-size: 11px
}

.add-experience:hover {
	background: #BA68C8;
	color: #fff;
	cursor: pointer;
	border: solid 1px #BA68C8
}

.cropper-container {
  margin: 0 auto 20px auto;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

</head>
<body>
<form action="/profilepic" method="post" enctype="multipart/form-data">

<div>
    <div id="image-cropper" style="border:1px solid #ccc; margin: 5px;"></div>
    <div id="image">
     <img style="width:150px; height:150px; margin: 6px;"></div>
    
	</div>
	<!-- 
			 <input 
				type="file" id="file" name="image"
				data-file-accept=" jpg, jpeg, png"
				data-file-maxsize="100000000" data-file-minsize="100000">
 				
 				<button> Submit</button> -->
			<input type="button" value="Get cropped image"   id="submit" class="jbutton dark">
	</form>

	
	<form id="formId" method="get">

		<div class="container rounded bg-white mt-10 mb-10">
			<div class="row">
				<div class="col-md-4 border-right"></div>
				<div class="col-md-5 border-right">
					<div class="p-3 py-5">
						<div
							class="d-flex justify-content-between align-items-center mb-3">
							<h4 class="text-right">Profile</h4>
						</div>
						<div
							class="d-flex flex-column align-items-center text-center p-3 py-5">

							<img src="data:image/jpg;base64,${emp.image}"
								class="rounded-circle mt-7" width="150px" height="150px";  id="image">
							
						</div>
						<div class="row mt-2">
							<div class="col-md-6">
								<label class="labels">EmployeeId</label></span>
								<button id="submitbutton" style="display: none" type="submit">submit</button>
								<input type="text" class="form-control" name="empid"
									value="${emp.empid}" readonly="readonly">
							</div>
							<br>
							<div class="col-md-6">
								<label class="labels">Name</label> <input type="text"
									class="form-control" name="name" value="${emp.name}" readonly="readonly" />
							</div>
						</div>

						<div class="row mt-3">
							<div class="col-md-12">
								<label class="labels">Contact</label> <input type="text"
									class="form-control" name="contact" value="${emp.contact}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Gender</label> <input type="text"
									class="form-control" name="gender" value="${emp.gender}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Date of Birth</label> <input type="text"
									class="form-control" name="dateofbirth"
									value="${emp.dateofbirth}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Date of joining</label> <input type="text"
									class="form-control" name="dateofjoining"
									value="${emp.dateofjoining}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Experience</label> <input type="text"
									class="form-control" name="experience"
									value="${emp.experience}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Team</label> <input type="text"
									class="form-control" name="team" value="${emp.team}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Email ID</label> <input type="text"
									class="form-control" name="email" value="${emp.email}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Pan</label> <input type="text"
									class="form-control" name="pan" value="${emp.pan}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Aadhaar</label> <input type="text"
									class="form-control" name="addhar" value="${emp.addhar}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Designation</label> <input type="text"
									name="desigination" class="form-control"
									value="${emp.desigination}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Reporting manager</label> <input
									type="text" name="reportingmanager" class="form-control"
									value="${emp.reportingmanager}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Blood group</label> <input type="text"
									class="form-control" name="bloodgroup"
									value="${emp.bloodgroup}" readonly="readonly">
							</div>
							<div class="col-md-12">
								<label class="labels">Address</label> <input type="text"
									class="form-control" name="address" value="${emp.address}" readonly="readonly">
							</div>

						</div>
						<div class="row mt-3">
							<div class="col-md-6">
								<label class="labels">Country</label> <input type="text"
									class="form-control" placeholder="country"
									value="${emp.country}" readonly="readonly">
							</div>


						</div>

					</div>
	</form>
	<h2>Update Employee Data</h2>
	<form method="post" action="/update">
		<label>Employee Name:</label><br> <input type="text" name="name">
		<br>
		<br> <label>Employee Address : </label> <br> <input
			type="text" name="address"><br>
		<br> <label> Phone Number : </label> <br> <input type="text"
			name="contact"><br>
		<br> <label>Email : </label> <br> <input type="text"
			name="email"> <br>
		<br>

		<button style="background-color: #265df2" type="submit">Submit</button>
	</form>

	<script> 
file.addEventListener("change", function() {

	  const reader = new FileReader()

	  reader.addEventListener("load", () => {
	    document.querySelector("#image").src = reader.result
	  })
	  reader.readAsDataURL(this.files[0])
	})
	/* 
	$uploadCrop = $('#upload-demo').croppie({
    enableExif: true,
    viewport: {
        width: 200,
        height: 200,
        type: 'circle'
    },
    boundary: {
        width: 300,
        height: 300
    }
}); */

</script>

<script>
$('#cropContainer').resizeImage({

	  // Formats: 3/2, 200x360, auto
	  imgFormat: 'auto', 

	  // min width/height
	  minWidth: 0,
	  minHeight: 0,

	  // lg-md, sm-xs
	  device: 'all', 

	  // true => circle, square ( by default )
	  circleCrop: false, 

	  // image zoom options
	  zoomable: true,
	  zoomMax: 2,

	  // custom background
	  background: 'transparent', 

	  // shows <a href="https://www.jqueryscript.net/tags.php?/grid/">grid</a>
	  inBoundGrid: true,

	  // black, white
	  outBoundColor: 'black'
	  
	})



</script>

<script>
cropper(document.getElementById('image-cropper'), {
    area: [300, 300 ],
    crop: [ 150, 150 ],
})
 
document.getElementById('submit').onclick = function() {
    document.getElementById('image').children[0].src =
        document.getElementById('image-cropper').crop.getCroppedImage().src;
}

</script>
</body>
</html>













<!-- <script>
$(document).ready(function(){
	var getUrlParameter = function getUrlParameter(sParam) {
	    var sPageURL = window.location.search.substring(1),
	        sURLVariables = sPageURL.split('&'),
	        sParameterName,
	        i;

	    for (i = 0; i < sURLVariables.length; i++) {
	        sParameterName = sURLVariables[i].split('=');

	        if (sParameterName[0] === sParam) {
	            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
	        }
	    }
	    return false;
	};
	

</script> -->



