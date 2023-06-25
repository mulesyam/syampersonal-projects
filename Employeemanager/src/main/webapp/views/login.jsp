<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration and Login App</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<style>
@import
	url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	outline: none;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body {
	display: flex;
	align-items: center;
	justify-content: center;
	min-height: 100vh;
	padding: 40px;
	background: linear-gradient(115deg, #56d8e4 10%, #9f01ea 90%);
}

.container {
	max-width: 800px;
	background: #fff;
	width: 800px;
	padding: 25px 40px 10px 40px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

.container .text {
	text-align: center;
	font-size: 35px;
	font-weight: 600;
	background: -webkit-linear-gradient(right, #56d8e4, #9f01ea, #56d8e4, #9f01ea);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}

.container form {
	padding: 30px 0 0 0;
}

.container form .form-row {
	display: flex;
	margin: 32px 0;
}

form .form-row .input-data {
	width: 100%;
	height: 40px;
	margin: 0 20px;
	position: relative;
}

form .form-row .textarea {
	height: 70px;
}

.input-data input, .textarea textarea {
	display: block;
	width: 100%;
	height: 100%;
	border: none;
	font-size: 17px;
	border-bottom: 2px solid rgba(0, 0, 0, 0.12);
}

.input-data input:focus ~ label, .textarea textarea:focus ~ label,
	.input-data input:valid ~ label, .textarea textarea:valid ~ label {
	transform: translateY(-20px);
	font-size: 14px;
	color: #3498db;
}

.textarea textarea {
	resize: none;
	padding-top: 10px;
}

.input-data label {
	position: absolute;
	pointer-events: none;
	bottom: 10px;
	font-size: 16px;
	transition: all 0.3s ease;
}

.textarea label {
	width: 100%;
	bottom: 40px;
	background: #fff;
}

.input-data .underline {
	position: absolute;
	bottom: 0;
	height: 2px;
	width: 100%;
}

.input-data .underline:before {
	position: absolute;
	content: "";
	height: 3px;
	width: 100%;
	background: #3498db;
	transform: scaleX(0);
	transform-origin: center;
	transition: transform 0.3s ease;
}

.input-data input:focus ~ .underline:before, .input-data input:valid ~
	.underline:before, .textarea textarea:focus ~ .underline:before,
	.textarea textarea:valid ~ .underline:before {
	transform: scale(1);
}

.submit-btn .input-data {
	overflow: hidden;
	height: 45px !important;
	width: 25% !important;
}

.submit-btn .input-data .inner {
	height: 200%;
	width: 300%;
	position: absolute;
	left: -100%;
	background: -webkit-linear-gradient(right, #56d8e4, #9f01ea, #56d8e4, #9f01ea);
	transition: all 0.4s;
}

.submit-btn .input-data:hover .inner {
	left: 0;
}

.submit-btn .input-data input {
	background: none;
	border: none;
	color: #fff;
	font-size: 17px;
	font-weight: 500;
	text-transform: uppercase;
	letter-spacing: 1px;
	cursor: pointer;
	position: relative;
	z-index: 2;
}

@media ( max-width : 700px) {
	.container .text {
		font-size: 30px;
	}
	.container form {
		padding: 10px 0 0 0;
	}
	.container form .form-row {
		display: block;
	}
	form .form-row .input-data {
		margin: 35px 0 !important;
	}
	.submit-btn .input-data {
		width: 40% !important;
	}
}
</style>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">

				<h1 align="center">LOGIN</h1>


				<form method="post" action="/login">


					<div class="form-group">
						<label for="empid"> EMPLOYEEID </label> : <input type="number"
							class="form-control" id="empid" name="empid"
							placeholder="Enter id" autofocus="autofocus">
					</div>

					<div class="form-group">
						<label for="password">PASSWORD</label>: <input type="password" id="myInput"
						 name="password" class="form-control"
							placeholder="Enter Password" />
							<input type="checkbox" onclick="myFunction()">Show Password

					</div>

					<div class="form-group">
						<div class="column">
							<div class="col-sm-6 col-sm-offset-3">
					 <input type="submit"  name="login-submit"
									id="login-submit" onClick="alert('User Login  Successfully')"  class="form-control btn btn-primary"
									value="Login" /> 
									 <a href="/register" class="form-control btn btn-primary" onsubmit="/signupform">Register</a>
							</div>
						</div>
					</div>
				</form>

			</div>
		</div>
	</div>
	</div>

</body>
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