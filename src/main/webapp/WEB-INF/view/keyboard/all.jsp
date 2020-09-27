<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Teclados</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/keyboard">Novo</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty keyboards}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Preço</th>
						<th>Data de Lançamento</th>
						<th>Descrição</th>
						<th>RGB</th>
						<th>Macânico</th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="k" items="${keyboards}">
						<tr>
							<td>${k.id}</td>
							<td>${k.price}</td>
							<td>${k.releaseDate}</td>
							<td>${k.description}</td>
							<td>${k.getIsRGBString()}</td>
							<td>${k.getIsMechanicString()}</td>
							<td><a href="/keyboard/${k.id}/delete">Excluir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty keyboards}">
				<div class="alert alert-warning">
					<strong>Sem produtos cadastrados!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
