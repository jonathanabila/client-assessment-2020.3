<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Máquinas de café</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/coffee-machine">Novo</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty coffeeMachines}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Preço</th>
						<th>Data de Lançamento</th>
						<th>Descrição</th>
						<th>Controle de temperatura</th>
						<th>Controle de intensidade</th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="c" items="${coffeeMachines}">
						<tr>
							<td>${c.id}</td>
							<td>${c.price}</td>
							<td>${c.releaseDate}</td>
							<td>${c.description}</td>
							<td>${c.strengthControl}</td>
							<td>${c.temperatureControl}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty coffeeMachines}">
				<div class="alert alert-warning">
					<strong>Sem produtos cadastrados!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
