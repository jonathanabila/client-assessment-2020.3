<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Monitores</h3>

			<div class="dropdown">
				<button type="button" class="btn btn-primary">
					<a class="dropdown-item" href="/monitor">Novo</a>
				</button>
			</div>
			<br>

			<c:if test="${not empty monitors}">
				<table class="table table-striped">
					<thead>
					<tr>
						<th>ID</th>
						<th>Preço</th>
						<th>Data de Lançamento</th>
						<th>Descrição</th>
						<th>Tamanho da tela</th>
						<th>Ajuste de altura</th>
						<th></th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="m" items="${monitors}">
						<tr>
							<td>${m.id}</td>
							<td>${m.price}</td>
							<td>${m.releaseDate}</td>
							<td>${m.description}</td>
							<td>${m.screenSize}</td>
							<td>${m.getHeightAdjustableString()}</td>
							<td><a href="/monitor/${m.id}/delete">Excluir</a></td>
							<td><a href="/monitor/${m.id}/update">Alterar</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty monitors}">
				<div class="alert alert-warning">
					<strong>Sem produtos cadastrados!</strong>
				</div>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
