<%--
  Created by IntelliJ IDEA.
  User: jonathan
  Date: 20/09/2020
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="style.jsp" />
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Assessment - Jonathan Tolentino</title>
	<meta charset="UTF-8">

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
	<div class="container-fluid mt-3">
		<div class="card">
			<div class="card-body">
				<h3 class="card-title text-center">Assessment - Jonathan Tolentino</h3>
				<hr>
				<h4 class="card-title text-center">Cadastrar novo usuário</h4>
			</div>
			<form class="m-3" action="user" method="post">
				<div class="form-group">
					<label for="userName">Login:</label>
					<input id="userName" name="userName" type="text" class="form-control">
				</div>
				<div class="form-group">
					<label for="password">Senha:</label>
					<input id="password" name="password" type="password" class="form-control">
				</div>
				<div class="row col-md-6">
					<button type="submit" class="btn btn-primary">Cadastrar</button>
				</div>
			</form>
		</div>
	</div>
</div>
<c:import url="footer.jsp" />