<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<form method = "get" action = "/piecharts">
<%@ include file = "Header.jsp" %><br><br>


<script>
window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer", {
exportEnabled: true,
animationEnabled: true,
title:{
text: "Employee Working Status"
},
legend:{
cursor: "pointer",
itemclick: explodePie
},
data: [{
type: "pie",
showInLegend: true,
toolTipContent: "{name}: <strong>{y}</strong>",
indexLabel: "{name} - {y}",
dataPoints: [
{ y: ${pc.workingdays}, name: "Workingdays", exploded: true },
{ y: ${pc.leaves}, name: "Leaves" },

]
}]
});
chart.render();
}

function explodePie (e) {
if(typeof (e.dataSeries.dataPoints[e.dataPointIndex].exploded) === "undefined" || !e.dataSeries.dataPoints[e.dataPointIndex].exploded) {
e.dataSeries.dataPoints[e.dataPointIndex].exploded = true;
} else {
e.dataSeries.dataPoints[e.dataPointIndex].exploded = false;
}
e.chart.render();

}
</script>
</head>
<body>
<div id="chartContainer" style="height: 300px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</form>
</body>
</html>
<title>Employee Pie chart</title>
</head>
