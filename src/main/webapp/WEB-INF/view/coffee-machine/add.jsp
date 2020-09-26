<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Máquina de café</h3>
			<form action="/coffee-machine" method="post">
				<input type="hidden" name="id" value="${coffeeMachine.id}">
				<div class="form-group">
					<div>
						<label for="price">Preço: </label>
						<input type="number" class="form-control" name="price" id="price" value="${coffeeMachine.price}">
					</div>
					<div>
						<label for="description">Descrição: </label>
						<input type="text" class="form-control" name="description" id="description" value="${coffeeMachine.description}">
					</div>
					<div>
						<label for="releaseDate">Lançamento: </label>
						<input type="date" class="form-control" name="releaseDate" id="releaseDate" value="${coffeeMachine.releaseDate}">
					</div>
				</div>
				<div class="form-group">
					<div>
						<p>Controle de intensidade:</p>
						<label for="strengthControlTrue">Sim</label>
						<input type="radio" id="strengthControlTrue" name="strengthControl" value="${true}">
						<label for="strengthControlFalse">Não</label>
						<input type="radio" id="strengthControlFalse" name="strengthControl" value="${false}">
					</div>
					<div>
						<p>Controle de temperatura:</p>
						<label for="temperatureControlTrue">Sim</label>
						<input type="radio" id="temperatureControlTrue" name="temperatureControl" value="${true}">
						<label for="temperatureControlFalse">Não</label>
						<input type="radio" id="temperatureControlFalse" name="temperatureControl" value="${false}">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Salvar</button>
			</form>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
