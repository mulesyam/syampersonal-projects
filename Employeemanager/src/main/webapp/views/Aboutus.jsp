<!DOCTYPE html>
<html>
   <%@ include file = "Header.jsp" %><br><br>
<head>
		<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="footer, address, phone, icons" />

	<title>Responsive Footer</title>

	<link rel="stylesheet" href="style.css">
	
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

	<link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
<style>
 @import url('http://fonts.googleapis.com/css?family=Open+Sans:300,500');

*{
	padding:0;
	margin:0;
}

html{
	background-color: #e6e6fae8;
}

body{
	font:16px/1.6 Arial,  sans-serif;
}

header{
	text-align: center;
	padding-top:20px;
	margin-bottom:400px;
}

header h1{
	font: normal 32px/1.5 'Open Sans', sans-serif;
	color: #3F71AE;
	width:20;
	padding-bottom: 16px;
}

header h2{
	color: #F05283;
}

header span{
	color: #3F71EA;
}


/* The footer is fixed to the bottom of the page */

footer{

	bottom: 0;
}

@media (max-height:100px){
	footer { position: static; }
	header { padding-top:40px; }
}


.footer-distributed{
	background-color: #2c292f;
	box-sizing: border-box;
	width: 100%;
	height:20;
	text-align: left;
	font: bold 16px sans-serif;
	padding: 50px 50px 60px 50px;
	margin-top: 80px;
}

.footer-distributed .footer-left,
.footer-distributed .footer-center,
.footer-distributed .footer-right{
	display: inline-block;
	vertical-align: top;
}

/* Footer left */

.footer-distributed .footer-left{
	width: 30%;
}

.footer-distributed h3{
	color:  #ffffff;
	font: normal 36px 'Cookie', cursive;
	margin: 0;
}

/* The company logo */

.footer-distributed .footer-left img{
	width: 20%;
}

.footer-distributed h3 span{
	color:  #e0ac1c;
}

/* Footer links */

.footer-distributed .footer-links{
	color:  #ffffff;
	margin: 20px 0 12px;
}

.footer-distributed .footer-links a{
	display:inline-block;
	line-height: 1.8;
	text-decoration: none;
	color:  inherit;
}

.footer-distributed .footer-company-name{
	color:  #8f9296;
	font-size: 14px;
	font-weight: normal;
	margin: 0;
}

/* Footer Center */

.footer-distributed .footer-center{
	width: 35%;
}


.footer-distributed .footer-center i{
	background-color:  #33383b;
	color: #ffffff;
	font-size: 25px;
	width: 38px;
	height: 38px;
	border-radius: 50%;
	text-align: center;
	line-height: 42px;
	margin: 10px 15px;
	vertical-align: middle;
}

.footer-distributed .footer-center i.fa-envelope{
	font-size: 17px;
	line-height: 38px;
}

.footer-distributed .footer-center p{
	display: inline-block;
	color: #ffffff;
	vertical-align: middle;
	margin:0;
}

.footer-distributed .footer-center p span{
	display:block;
	font-weight: normal;
	font-size:14px;
	line-height:2;
}

.footer-distributed .footer-center p a{
	color:  #e0ac1c;
	text-decoration: none;;
}


/* Footer Right */

.footer-distributed .footer-right{
	width: 30%;
}

.footer-distributed .footer-company-about{
	line-height: 20px;
	color:  #92999f;
	font-size: 13px;
	font-weight: normal;
	margin: 0;
}

.footer-distributed .footer-company-about span{
	display: block;
	color:  #ffffff;
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 20px;
}

.footer-distributed .footer-icons{
	margin-top: 25px;
}

.footer-distributed .footer-icons a{
	display: inline-block;
	width: 35px;
	height: 35px;
	cursor: pointer;
	background-color:  #33383b;
	border-radius: 2px;

	font-size: 20px;
	color: #ffffff;
	text-align: center;
	line-height: 35px;

	margin-right: 3px;
	margin-bottom: 5px;
}

/* Here is the code for Responsive Footer */
/* You can remove below code if you don't want Footer to be responsive */


@media (max-width: 80px) {

	.footer-distributed .footer-left,
	.footer-distributed .footer-center,
	.footer-distributed .footer-right{
		display: block;
		width: 100%;
		margin-bottom: 40px;
		text-align: center;
	}

	.footer-distributed .footer-center i{
		margin-left: 0;
	}

}
</style>
</head>
	<body >
	<form  method="Get" action="/Aboutus">
		<header>
		 <h1> OUR COMPANY TECNICS </h1>
			<h2>We deliver Identity, Security and Access Management products and services for our enterprise customers throughout the globe.</h2>
			
	<br>
	<br>
	
			<h3>
			    Tecnics Integration Technologies Private Limited
			</h3>
			<span>Mission Statement:</span>
<p>We aim to be your trusted partner for end-to-end technology solutions; to become a natural extension of your business, and to deliver the best possible value in innovation and operation of an optimal IT and technology platform. We aim to be your trusted partner for end-to-end technology solutions; to become a natural extension of your business, and to deliver the best possible value in innovation and operation of an optimal IT and technology platform.</p><br> 
 <img src=" https://tecnics.com/wp-content/uploads/2020/03/mission.png" align="left" width="50px" height="20px">
<br>


  <span>About Us</span>
  <p>
   Headquartered in Houston, Texas (U.S.), Tecnics has a global presence with Regional Offices and Development Centers in Dubai (UAE), and Hyderabad (India). 
Founded in the year 1998, our collaborative workforce includes 400+ consultants and associates globally with an average of 20+ years of techno-functional experience. 
We maintain a diverse portfolio of clients and deliver high-quality IT solutions, front end development, mobility, back end services and Identity Services for their business success. 
We support identity and access management services from industry leaders including OKTA, Microsoft Azure and IBM. We support multiple technology platforms 
including .Net, Oracle, SAP, Java, Python, Node.js, JavaScript, and much more and also support front end development including React, Angular and Vue.js. 
We implement & support various business applications including SAP, Oracle eBusiness Suite, Microsoft Dynamics, Salesforce, and so on. 
We provide 24x7x365 support to customers who are looking for outsourced development and IT management services. 

  </p>
   
			<p>
			    <span>WHAT WE DO</span>
  <p>Tecnics focuses on meeting your organizational demands through consulting, managed services and next generation platform services.
Across its portfolio, we leverage the capabilities and services around automation, security, compliance, and analytics to bring you better business availability,
 easier connectivity, and stronger productivity.</p>

			</p>
			<br>
			
		</header>

		

		<footer class="footer-distributed">

			<div class="footer-left">
          <img src="data:image/jpeg;base64,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">
				<h3>About<span>Us</span></h3>

				<p class="footer-links">
					<a href="#">Home</a>
					|
					<a href="#">Blog</a>
					|
					<a href="#">About</a>
					|
					<a href="#">Contact</a>
				</p>

				<p class="footer-company-name">©  2005 Tecnics Integration Technologies Private Limited  </p>
			</div>

			<div class="footer-center">
				<div>
					<i class="fa fa-map-marker"></i>
					  <p><span> : Plot 12/1, Sector 1, Huda Techno Enclave Rd, HUDA Techno Enclave,</span>
						Madhapur, Hyderabad, Telangana 500081 </p>
				</div>

				<div>
					<i class="fa fa-phone"></i>
					<p>+91 22-27782183</p>
				</div>
				<div>
					<i class="fa fa-envelope"></i>
					<p><a href="mailto: vc@tecnics.com"> vc@tecnics.com</a></p>
				</div>
			</div>
			<div class="footer-right">
				<p class="footer-company-about">
					<span>About the company</span>
					We offer training and skill building courses across Technology, Design, Management, Science and Humanities.</p>
				<div class="footer-icons">
					<a href="www.facebook.com"><i class="fa fa-facebook"></i></a>
					<a href="www.twiter.com"><i class="fa fa-twitter"></i></a>
					<a href="www.instagram"><i class="fa fa-instagram"></i></a>
					<a href="www.linkedin"><i class="fa fa-linkedin"></i></a>
					<a href="youtube"><i class="fa fa-youtube"></i></a>
				</div>
			</div>
		</footer>
		</form>
	</body>
</html>