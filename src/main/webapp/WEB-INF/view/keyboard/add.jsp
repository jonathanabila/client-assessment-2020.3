<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" />
<div class="container">
	<div class="card-body">
		<div class="jumbotron">
			<h3 class="card-title text-center">Teclado</h3>
			<form action="/keyboard" method="post">
				<input type="hidden" name="id" value="${keyboard.id}">
				<div class="form-group">
					<div>
						<label for="price">Preço: </label>
						<input type="number" class="form-control" name="price" id="price" value="${keyboard.price}" required>
					</div>
					<div>
						<label for="description">Descrição: </label>
						<input type="text" class="form-control" name="description" id="description" value="${keyboard.description}" required>
					</div>
					<div>
						<label for="releaseDate">Lançamento: </label>
						<input type="date" class="form-control" name="releaseDate" id="releaseDate" value="${keyboard.releaseDate}" required>
					</div>
				</div>
				<div class="form-group">
					<div>
						<p>RGB:</p>
						<label for="isRBGTrue">Sim</label>
						<input type="radio" id="isRBGTrue" name="isRGB" value="${true}">
						<label for="isRBGFalse">Não</label>
						<input type="radio" id="isRBGFalse" name="isRBG" value="${false}">
					</div>
					<div>
						<p>Mecânico:</p>
						<label for="isMechanicTrue">Sim</label>
						<input type="radio" id="isMechanicTrue" name="isMechanic" value="${true}">
						<label for="isMechanicFalse">Não</label>
						<input type="radio" id="isMechanicFalse" name="isMechanic" value="${false}">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Salvar</button>
			</form>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
