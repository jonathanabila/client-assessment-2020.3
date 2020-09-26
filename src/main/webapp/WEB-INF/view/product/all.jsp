<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Produtos</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/monitor">Monitor</a>
				</button>
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/keyboard">Teclado</a>
				</button>
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/coffee-machine">Máquina de café</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty products}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Preço</th>
						<th>Data de Lançamento</th>
						<th>Descrição</th>
						<th>Tipo</th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="m" items="${products}">
						<tr>
							<td>${m.id}</td>
							<td>${m.price}</td>
							<td>${m.releaseDate}</td>
							<td>${m.description}</td>
							<td>${m.getProductTypeString()}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty products}">
				<div class="alert alert-warning">
					<strong>Sem produtos cadastrados!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
