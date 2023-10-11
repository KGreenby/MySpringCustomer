<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>사용자 관리</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">사용자 목록</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>고객번호</th> 
					<th>이름</th> 
					<th>이메일</th>
					<th>나이</th>
					<th>등록일</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>
					 	${customer.id}
					 </td>
					<td><a href="getCustomer.do?name=${customer.name}">${customer.name}</a></td>
					<td>${customer.email}</td>
					<td>${customer.age}</td>
					<td>${customer.entryDate}</td>
				</tr>
			</c:forEach>
		</tbody> 
	</table>
	</div>
</body>
</html>

































