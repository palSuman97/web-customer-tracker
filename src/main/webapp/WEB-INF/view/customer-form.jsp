<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer Form</title>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
	</head>
	
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>CRM- Customer Relationship Manager</h2>
			</div>
		</div>
			
		<div id="container">
			<h3>Save Customer</h3>
			
			<form:form action="saveCustomer" modelAttribute="customer" method="POST">
				
				<!-- associates customer data with id -->
				<form:hidden path="id"/>
				
				<table>
					<tbody>
						<tr>
							<td><label>First Name:</label></td>
							<td><form:input path="firstName"/> </td>
						</tr>
						<tr>
							<td><label>Last Name:</label></td>
							<td><form:input path="lastName"/> </td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<td><form:input path="email"/> </td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Submit" class="save"> </td>
						</tr>
					</tbody>	
				</table>
			
				<div style="clear; both;">
					<p>
						<a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
					</p>
				
				</div>
			
			</form:form>
		</div>
	</body>
</html>