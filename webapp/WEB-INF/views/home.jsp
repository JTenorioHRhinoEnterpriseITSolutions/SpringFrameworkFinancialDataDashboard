<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard Alphavantage</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="/" var="urlRoot"></spring:url>

<link rel="stylesheet"
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>">

<link rel="stylesheet"
	href="<c:url value="/resources/bootstrap/css/theme.css" />">

<script src="http://code.jquery.com/jquery-1.7.1.min.js">
	$(document).ready(function() {
		&('#cbxCategories').on('change', function(){
			var categoryId = $('#cbxCategories option:selected').val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/loadFunctions/' + categoryId + 'html',
				success: function(result) {
					var result = JSON.parse(result);
					var s = '';
					for(var i = 0; i < resut.lenght; i++) {}
						s+= '<option value="' + result[i].description + '">' + result[i].description + '</option>';
					}
					$('#cbxFunctions').html(s);
				}
				});
			});
		}
	});
</script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-12 col-sm-6">
				<div>
					<h1>API Alpha Vantage</h1>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<form method="post">
					<div class="form-group row">
						<div class="col-6 col-md-3 mb-3">
							<label for="cbxCategories">Categories:</label> <select
								name="cbxCategories" id="cbxCategories" class="form-control">
								<c:forEach var="category" items="${categories}">
									<option value="${category.id}">${category.description}</option>
								</c:forEach>
							</select>
						</div>

						<div class="col-6 col-md-3 mb-3">
							<label for="cbxFunctions">Function:</label> 
							<select name="cbxFunction" id="cbxFunction" class="form-control">
							</select>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>