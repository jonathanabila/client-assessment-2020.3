<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Compra</h3>
			<input type="hidden" name="id" value="${buy.id}">

			<div class="form-group">
				<h4>Comprador:</h4>
				<select id="buyers" class="form-control" name="buyer.id" disabled>
					<option value="${buy.buyer.id}">${buy.buyer.email}</option>
				</select>
				<br>
				<h4>Para entregar: ${buy.getForDeliveryString()}</h4><br>
				<h4>Data: </h4>
				<input type="datetime-local" class="form-control" name="date" id="date" value="${buy.date}" disabled><br>
			</div>
			<div class="form-group">
				<h3>Produtos:</h3><br>
				<c:if test="${not empty buy.items}">
					<table class="table table-striped">
						<thead>
						<tr>
							<th>Descrição</th>
							<th>Valor</th>
							<th>Tipo</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="p" items="${buy.items}">
							<td>${p.description}</td>
							<td>${p.price}</td>
							<td>${p.getProductTypeString()}</td>
						</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
