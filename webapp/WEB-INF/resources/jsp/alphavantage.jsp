<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alpha Vantage</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="/" var="urlRoot"></spring:url>
<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic}/bootstrap/css/theme.css" rel="stylesheet">
</head>
<body>
	<form id="form1" runat="server">
		<div class="container">
			<div class="card-deck mb-3 text-center">
				<div class="card mb-4 box-shadow">
					<div class="card-body">
						<h1 class="card-title pricing-card-title">
							Alphavantage <small class="text-muted"></small>
						</h1>
						<div class="row">
							<div class="col-md-5 mb-3">
								<label for="country">Categories:</label> <select
									class="custom-select d-block w-100" id="country" required>
									<option value="">Choose...</option>
									<option>United States</option>
								</select>
								<div class="invalid-feedback">Please select a valid
									country.</div>
							</div>
							<div class="col-md-4 mb-3">
								<label for="state">State</label> <select
									class="custom-select d-block w-100" id="state" required>
									<option value="">Choose...</option>
									<option>California</option>
								</select>
								<div class="invalid-feedback">Please provide a valid
									state.</div>
							</div>
						</div>

						<ul class="list-unstyled mt-3 mb-4">
							<li>Information: Intraday (5min) open, high, low, close
								prices and volume</li>
							<li>Symbol: MSFT</li>
							<li>Last Refreshed: 2019-03-08 16:00:00</li>
							<li>Interval: 5min</li>
							<li>Output Size: Compact</li>
							<li>Time Zone: US/Eastern</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</form>

	<div class="container-fluid">
		<div class="row">
			<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">


			<canvas class="my-4" id="myChart" width="900" height="380"></canvas>

			<h2>Time Series (5min)</h2>
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<thead>
						<tr>
							<th>Fecha</th>
							<th>Open</th>
							<th>High</th>
							<th>Low</th>
							<th>Close</th>
							<th>Volume</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>2019-03-08 16:00:00</td>
							<td>110.4100</td>
							<td>110.7100</td>
							<td>110.3800</td>
							<td>110.5200</td>
							<td>1154440</td>
						</tr>
						<tr>
							<td>2019-03-08 15:55:00</td>
							<td>110.3400</td>
							<td>110.5400</td>
							<td>110.3400</td>
							<td>110.4300</td>
							<td>421471</td>
						</tr>
					</tbody>
				</table>
			</div>
			</main>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>

	<!-- Icons -->
	<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
	<script>
		feather.replace()
	</script>

	<!-- Graphs -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
	<script>
		var ctx = document.getElementById("myChart");
		var myChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : [ "Sunday", "Monday", "Tuesday", "Wednesday",
						"Thursday", "Friday", "Saturday" ],
				datasets : [ {
					data : [ 15339, 21345, 18483, 24003, 23489, 24092, 12034 ],
					lineTension : 0,
					backgroundColor : 'transparent',
					borderColor : '#007bff',
					borderWidth : 4,
					pointBackgroundColor : '#007bff'
				} ]
			},
			options : {
				scales : {
					yAxes : [ {
						ticks : {
							beginAtZero : false
						}
					} ]
				},
				legend : {
					display : false,
				}
			}
		});
	</script>
</body>
</html>