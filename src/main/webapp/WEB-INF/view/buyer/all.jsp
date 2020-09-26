<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Comprador</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/buyer">Novo</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty buyers}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Email</th>
						<th>CPF</th>
						<th>Data de nascimento</th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="b" items="${buyers}">
						<tr>
							<td>${b.id}</td>
							<td>${b.email}</td>
							<td>${b.socialSecurityNumber}</td>
							<td>${b.birth}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty buyers}">
				<div class="alert alert-warning">
					<strong>Sem compradores cadastrados!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
