<%@page import="com.example.demo.EmployeeDao.User"%>
<%@page import="com.example.demo.EmployeeDao.LeaveManagement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<link rel="stylesheet" href="style.css">
	
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" />
	<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

::selection {
	color: #000;
	background: #fff;
}

nav {
	position: fixed;
	background: #1b1b1b;
	width: 100%;
	padding: 10px 0;
	z-index: 12;
}

nav .menu {
	max-width: 1250px;
	margin: auto;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 20px;
}

.menu .logo a {
	text-decoration: none;
	color: #fff;
	font-size: 35px;
	font-weight: 800;
}

.menu ul {
	display: inline-flex;
}

.menu ul li {
	list-style: none;
	margin-left: 7px;
}

.menu ul li:first-child {
	margin-left: 0px;
}

.menu ul li a {
	text-decoration: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	padding: 8px 15px;
	border-radius: 5px;
	transition: all 0.3s ease;
}

.menu ul li a:hover {
	background: #fff;
	color: black;
}

.img {
	background: url('img3.jpg') no-repeat;
	width: 100%;
	height: 100vh;
	background-size: cover;
	background-position: center;
	position: relative;
}

.img::before {
	content: '';
	position: absolute;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.4);
}

.center {
	position: absolute;
	top: 52%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 100%;
	padding: 0 20px;
	text-align: center;
}

.center .title {
	color: #fff;
	font-size: 55px;
	font-weight: 600;
}

.center .sub_title {
	color: #fff;
	font-size: 52px;
	font-weight: 600;
}

.center .btns {
	margin-top: 20px;
}

.center .btns button {
	height: 90px;
	width: 200px;
	border-radius: 5px;
	border: none;
	margin: 0 10px;
	border: 2px solid white;
	font-size: 20px;
	font-weight: 900;
	padding: 0 10px;
	cursor: pointer;
	outline: none;
	transition: all 0.3s ease;
}

.center .btns button:first-child {
	color: #fff;
	background: none;
}

.btns button:first-child:hover {
	background: white;
	color: black;
}

.center .btns button:last-child {
	background: white;
	color: black;
}

<
style>body {
	background-color: silver;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}

#my-pie-chart-container {
	display: flex;
	align-items: center;
}

#my-pie-chart {
	background: conic-gradient(brown 0.00%, black 0.00% 0.55%, blue 0.55% 6.08%, green
		6.08% 13.68%, yellow 13.68% 23.27%, orange 23.27% 40.47%, red 40.47%);
	border-radius: 50%;
	width: 150px;
	height: 150px;
}

#legenda {
	margin-left: 20px;
	background-color: white;
	padding: 5px;
}

.entry {
	display: flex;
	align-items: center;
}

.entry-color {
	height: 20px;
	width: 20px;
}

.entry-text {
	margin-left: 5px;
}

#color-red {
	background-color: red;
}

#color-orange {
	background-color: orange;
}

#color-yellow {
	background-color: yellow;
}

#color-green {
	background-color: green;
}

#color-blue {
	background-color: blue;
}

#color-black {
	background-color: black;
}

#color-brown {
	background-color: brown;
}
</style>
</head>

<body >





<nav>
    <div class="logo">
       Brand Logo
    </div>        
</nav>
	<nav>
 <div class="menu">
 <div class="logo"></div>
  <ul>
   
  <li><a  href="/profiles" > profile</a></li>
   <li><a href="/payslips">payslips</a></li>
   <li><a href="/Hrpolices">Hrpolices</a></li>
   <li><a href="/Aboutus">Aboutus</a></li>
    <li><a  href="/leaveform" > Applyleave</a></li>
   <li><a href="/Adddependency">Insurence Policy</a></li>
    <li><a href="/piecharts">Status</a></li>
   <li><a href="/login"> LogOut</a></li> 
   
    </ul>
    </div>
</nav>

</body>
</html>