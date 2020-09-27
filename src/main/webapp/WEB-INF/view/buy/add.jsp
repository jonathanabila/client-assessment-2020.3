<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Compra</h3>
			<form action="/buy" method="post">
				<input type="hidden" name="id" value="${buy.id}">

				<div class="form-group">
					<label for="buyers">Comprador:</label>
					<select id="buyers" class="form-control" name="buyer.id" required>
						<c:forEach var="b" items="${buyers}">
							<option value="${b.id}">${b.email}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<p>Para entregar:</p>
					<label for="forDeliveryTrue">Sim</label>
					<input type="radio" id="forDeliveryTrue" name="forDelivery" value="${true}">
					<label for="forDeliveryFalse">Não</label>
					<input type="radio" id="forDeliveryFalse" name="forDelivery" value="${false}">
				</div>
				<div class="form-group">
					<label>Produtos:</label><br>
					<c:if test="${not empty products}">
						<table class="table table-striped">
							<thead>
							<tr>
								<th></th>
								<th>Descrição</th>
								<th>Valor</th>
								<th>Tipo</th>
							</tr>
							</thead>
							<tbody>
							<c:forEach var="p" items="${products}">
								<tr>
									<td style="display: flex; justify-content: center">
										<label>
											<input type="checkbox" class="form-check-input" name="productsIds" value="${p.id}">
										</label>
									</td>
									<td>${p.description}</td>
									<td>${p.price}</td>
									<td>${p.getProductTypeString()}</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</c:if>
					<c:if test="${empty products}">
						<p>Nenhum produto cadastrado!</p>
					</c:if>
				</div>

				<button type="submit" class="btn btn-primary">Salvar</button>
			</form>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
