<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Business Directory</h1>
	<form>
		<div class="container">
			<table class="table" border="1">
				<thead>
					<tr>
						<td>Name</td>
						<td>Location</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bus}" var="item">
						<tr>
							<td>${item.name }</td>
							<td>${item.location }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
	<h1>Add a business</h1>
	<form action="/create-business">
		Business Name:<input type="text" name="name"><br>
		Location:<input type="text" name="location"><br> <input
			type="submit" name="Add">
	</form>


</body>
</html>