<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome to  Home</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container text-center">
        <h1>WELCOME TO EMPLOYEE MANAGEMENT SYSTEM </h1>
       
        <h3><a href="/register" onsubmit="/signupform"> Register</a></h3>
        <h3><a href="/login" onsubmit="/login">Login</a></h3>
    </div>




     
</body>
</html>