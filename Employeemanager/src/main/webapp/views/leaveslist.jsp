<%@page import="com.example.demo.EmployeeDao.Leavestatus"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.EmployeeDao.LeaveManagement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file = "Header.jsp" %><br><br>
<meta charset="ISO-8859-1">



    <style>
    table.center {
  margin-left: auto; 
  margin-right: auto;
  width: 50%;
  
}
body {background-color: #A8A8A8;}
</style>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>

	$('#approveid').click(function() {
	    location.reload();
	});
</script>

</head>
<body  >
<table id="Employees" border="1"   class="center" > 
  <tr>

    <th>Employee id</th>
    <th>From date</th>
    <th>To date</th>
    <th>Leave type</th>
    <th>reason</th>
    <th>Approval</th>
    
</tr>

<tr>


<%List<LeaveManagement> list= (List)request.getAttribute("list");
  for(LeaveManagement li:list){%>
 <tr>
  <td><%=li.getEmpid()%></a></td>
  <td><%=li.getFromdate()%></td>
  <td><%=li.getTodate()%></td>
  <td><%=li.getLeavetype()%></td>
  <td><%=li.getReason()%></td>
  <td><a href="/approve/<%=li.getEmpid()%>" id="approveid">Approve</a><button><a href="/reject/<%=li.getEmpid()%>" id = "approveid">Reject</button></td></tr>
 <%} %>


</table>
</body>
</html>