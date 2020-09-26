<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Comprado</h3>
			<form action="/buyer" method="post">
				<input type="hidden" name="id" value="${buyer.id}">
				<div class="form-group">
					<div>
						<label for="email">Email: </label>
						<input type="email" class="form-control" name="email" id="email" value="${buyer.email}">
					</div>
					<div>
						<label for="socialSecurityNumber">CPF: </label>
						<input type="number" class="form-control" name="socialSecurityNumber" id="socialSecurityNumber" value="${buyer.socialSecurityNumber}">
					</div>
					<div>
						<label for="birth">Data de nascimento: </label>
						<input type="date" class="form-control" name="birth" id="birth" value="${buyer.birth}">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Salvar</button>
			</form>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
