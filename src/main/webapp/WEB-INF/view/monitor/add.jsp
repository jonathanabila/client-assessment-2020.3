<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Monitor</h3>
			<form action="/monitor" method="post">
				<input type="hidden" name="id" value="${monitor.id}">
				<div class="form-group">
					<div>
						<label for="price">Preço: </label>
						<input type="number" class="form-control" name="price" id="price" value="${monitor.price}">
					</div>
					<div>
						<label for="description">Descrição: </label>
						<input type="text" class="form-control" name="description" id="description" value="${monitor.description}">
					</div>
					<div>
						<label for="releaseDate">Lançamento: </label>
						<input type="date" class="form-control" name="releaseDate" id="releaseDate" value="${monitor.releaseDate}">
					</div>
					<div>
						<label for="screenSize">Tamanho da tela: </label>
						<input type="number" class="form-control" name="screenSize" id="screenSize" value="${monitor.screenSize}">
					</div>
				</div>
				<div class="form-group">
					<div>
						<p>Ajuste de altura:</p>
						<label for="heightAdjustableTrue">Sim</label>
						<input type="radio" id="heightAdjustableTrue" name="heightAdjustable" value="${true}">
						<label for="heightAdjustableFalse">Não</label>
						<input type="radio" id="heightAdjustableFalse" name="heightAdjustable" value="${false}">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Salvar</button>
			</form>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
