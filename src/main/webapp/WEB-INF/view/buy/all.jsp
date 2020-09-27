<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Compras</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/buy">Nova</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty buys}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Data</th>
						<th>Para entrega</th>
						<th>Comprador</th>
						<th>Qtd. de itens</th>
						<th></th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="b" items="${buys}">
						<tr>
							<td>${b.id}</td>
							<td>${b.date}</td>
							<td>${b.getForDeliveryString()}</td>
							<td>${b.buyer.email}</td>
							<td>${b.items.size()}</td>
							<td><a href="/buy/${b.id}">Detalhes</a></td>
							<td><a href="/buy/${b.id}/delete">Excluir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty buys}">
				<div class="alert alert-warning">
					<strong>Sem compras cadastradas!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
