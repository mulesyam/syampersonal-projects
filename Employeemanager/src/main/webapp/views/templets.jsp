<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
 
 
<title>Send Mail</title> 
<script src= "https://smtpjs.com/v3/smtp.js"> </script> 
<style type="text/css">
body{margin: 20px;}
input{border:solid red;
    height: 4vh;
    border-radius: 25px 25px 25px 25px;
    text-align: center;
    margin-bottom: 10px;}
form{border:solid 7px blue;
    width: 50%;
    height: 50%;
    padding: 1%;
    text-align: center;
    background: #234a3a;
    }
    #Message{
    width: 30vw;
    height: 20vh;
    word-break: break-all;
    }
</style>
 </head>
<body>
<form method="post" name="Form">
<input type="Email" name="sender" placeholder="sender@gmail.com"><br>
<input type="Password" name="pswd" placeholder="Password here"><br>
<input type="Email" name="reciever" placeholder="Reciever@gmail.com"><br>
<input type="text" name="Message" placeholder="Your message here" id="Message"><br>
<input type="button" value="SendMessage" onclick ="sendMail()">
</form>
<script type="text/javascript">
function sendMail() {
    var sender=Form.sender.value
    var pswd=Form.pswd.value
    var reciever=Form.reciever.value
    var mesg=Form.Message.value;
    alert(reciever) 
    Email.send({ 
    Host: "smtp.gmail.com", 
    Username: "prasanna_mule@tecnics.com", 
    Password:"Welcome@123", 
    To: "swetha_ketha@tecnics.com", 
    From: "prasanna_mule@tecnics.com", 
    Subject: "Sending Email using javascript",
    Body: "Hi Swetha", 
    }).then(function (message) { 
    alert("mail sent successfully") 
    }); 
    }
</script>
</body>
</html>
  

