<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CSR</title>
<link rel="icon" type="image/x-icon" href="data:image/jpeg;base64,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">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

</head>
<body>

<div class="text-center">
  <img src="..." class="rounded" alt="...">
</div>
  <p class="lead">
  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus.
</p>
  
  
  
  <div class="text-center">
  <img src="..." class="rounded" alt="...">
</div>


<figure class="figure">
  <img src="..." class="figure-img img-fluid rounded" alt="A generic square placeholder image with rounded corners in a figure.">
  <figcaption class="figure-caption">A caption for the above image.</figcaption>
</figure>


<marquee width="60%" direction="up" height="100px">
This is a sample scrolling text that has scrolls in the upper direction.
</marquee>


  <!-- 3 columns -->
<h3>3 Columns</h3>
<div class="container">
  <div class="row">
    
    <div class="col-xs-12 col-sm-4">
      <div class="box">
        <p>class="col-xs-12 col-sm-4"</p>
      </div>
    </div>
    
    <div class="col-xs-12 col-sm-4">
      <div class="box">
        <p>class="col-xs-12 col-sm-4"</p>
      </div>
    </div>
    
    <div class="col-xs-12 col-sm-4">
      <div class="box">
        <p>class="col-xs-12 col-sm-4"</p>
      </div>
    </div>
    
  </div>
</div>

</body>
</html>