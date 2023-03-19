<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <html>
      <%@ include file = "Header.jsp" %><br><br>
<head>

<title>Payroll Management System</title>

<script src="https://smtpjs.com/v3/smtp.js"></script>  

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.22/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.min.js"></script>
    
    
    <script type="text/javascript">
        $("body").on("click", "#btnExport", function () {
            html2canvas($('#tblCustomers')[0], {
                onrendered: function (canvas) {
                    var data = canvas.toDataURL();
                    var docDefinition = {
                        content: [{
                            image: data,
                            width: 500
                            
                        }]
                    };
                    pdfMake.createPdf(docDefinition).download("EmployeeSalary.pdf");
                }
            });
        });
    </script>
    
    
    <script>
    function email(){
    	
    Email.send({
        Host : "smtp.elasticemail.com",
        port:"2525",
        Username : "prasanna_mule@tecnics.com",
        Password : "60E62E8B23002FF808FEF66D2A6A22C4A387",
        To : "vtu14705@veltech.edu.in",
        From : "prasanna_mule@tecnics.com",
        Subject : "This is the subject for a javascript",
        Body : "And this is the body for a sender mail v"
    }).then(
      message => alert(message)
    );
    }
    </script>


<style type="text/css">

.style1 {	
	border-width: 0;
	border: solid gray 0px;
	width: 90%;
	border-radius: 5px;
	margin: 5px auto;
	background: white;
}

.style2 {
	border-width: 0;
	border: solid gray 10px;
	width: 50%;
	border-radius: 5px;
	margin: 5px auto;
	background:;
	align:left;
	font-size:20;
}
.tablefont
{
	font-size:16;
}

.btn {
  width: 302px;
  height: 50px;
  padding: 5px;
  background: gray ;
  font-size:30px;
  color: white;
}
.cbtn{
	width:50px; 
	height:30px; 
	font-size:25; 
	border-radius:8px
	
}

.button {
  background-color: #008CBA;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>

<style>  
        table {  
            font-family: arial, sans-serif;  
            border-collapse: collapse;  
            width: 100%;  
        }  
  
        td, th {  
            border: 1px solid #dddddd;  
            text-align: left;  
            padding: 8px;  
        }  
  
        tr:nth-child(even) {  
            background-color: #dddddd;  
        }  
    </style> 

</head>

<body bgcolor= #D6EAF8  >

<center>
<B><font color="white" style ="font-size:60" > Payroll Management Systems </font></B>
</center>
<hr size=5 color = "white">
<br>
<div >
<form method="get" id="myText" >
<table class="style1"   action="/payslips"  id="tblCustomers" cellspacing="0" cellpadding="0" >


<td>Employee Id:</td>
	<td><input type="text" readonly name = "empid" style="width: 300px" value="${ps.empid}">
</td>
<td>Department:</td>
	<td><input type="text" readonly  name = "department" style="width: 300px" value="${ps.department}">
</td>
</tr>

<tr>
<td>Employee Name:</td>
	<td><input type="text" readonly name = "name" style="width: 300px" value="${ps.name}">
</td>
<td>Designation:</td>
	<td><input type="text" readonly name = "desigination" style="width: 300px" value="${ps.designation}">
</td>
</tr>

<tr>
<td>Branch:</td>
	<td><input type="text"  readonly name = "branch" style="width: 300px" value="${ps.branch}">
</td>
<td>Absent:</td>
	<td><input type="text"  readonly name = "absent" style="width: 300px" value="${ps.absent}">
</td>
</tr>
<tr>
<td>Email:</td>
	<td><input type="text" readonly  name = "email" style="width: 300px" value="${ps.email}">
</td>
<td>Paid Days:</td>
	<td><input type="text" readonly  name = "paiddays" style="width: 300px" value="${ps.paiddays}" >
</td>
</tr>

<tr>

<td>Total Days:</td>
	<td><input type="text" readonly name = "totaldays" style="width: 300px" value="${ps.totaldays}">
</td>

<td>Bank Name:</td>
	<td><input type="text" readonly name = "bank" style="width: 300px" value="${ps.bankname}" >
</td>

</tr>

			<tr>
<td>Basic Salary:</td>
	<td><input type="text"  readonly name = "basicsalary" style="width: 300px" value="${ps.basicsalary}">
</td>
<td>Provisional Fund:</td>
	<td><input type="text"  readonly name = "pf" style="width: 300px" value="${ps.pf}">
</td>
</tr>
		
		<tr>
		<td>House Rent Allowances:</td>
	<td><input type="text" name = "houserent" readonly style="width: 300px" value="${ps.houserentallowances}" >
</td>
<td>Health Insurance:</td>
	<td><input type="text" name = "healthinsurance"  readonly style="width: 300px" value="${ps.healthinsurance}" >
</td>
</tr>

<tr>
		<td>Mediacial Allowances:</td>
	<td><input type="text" name = "medicialallowances"  readonly style="width: 300px" value="${ps.medicalallowances}" >
</td>
<td>Professional Tax:</td>
	<td><input type="text" name = "profrssionaltax"  readonly style="width: 300px" value="${ps.professionaltax}">
</td>
</tr>
<tr>
<td>Special Allowances:</td>
	<td><input type="text" name = "specialallowances" readonly style="width: 300px" value="${ps.specialallowances}">
</td>
<td>Gross Salary:</td>
	<td><input type="text" name = "grosssalary"  readonly style="width: 300px" value="${ps.grosssalary}">
</td>
</tr>


<tr>
<td>Conveyance Allowances:</td>
	<td><input type="text" name = "conveyanceallowances"  readonly style="width: 300px" value="${ps.conveyanceallowances}">
</td>
<td>NetPay:</td>
	<td><input type="text" name = "netpay"  readonly style="width: 300px" value="${ps.netpay}">
</td>
</tr>

	
</table>

</form>

     <input type="button" id="btnExport"  value="Download pdf" class="button"/>
     <input type="button" class="button"  value="Send Email" onclick="email()">
   
 
</body>

</html>