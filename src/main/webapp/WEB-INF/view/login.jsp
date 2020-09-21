<%--
  Created by IntelliJ IDEA.
  User: jonathan
  Date: 20/09/2020
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="style.jsp" />

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Assessment - Jonathan Tolentino</title>
        <meta charset="UTF-8">
    </head>
    <body>

    <div class="container">
        <div class="card mt-3">
            <div class="card-body">
                <h3 class="card-title text-center">Assessment - Jonathan Tolentino</h3>
            </div>
			<hr>

            <c:if test="${not empty error}">
              <div class="alert alert-warning">
                <strong>Erro: </strong> ${error}
              </div>
            </c:if>

            <form class="was-validated m-3" action="login" method="post">
                <div class="form-group">
                    <label for="userName">Usuário: </label>
                    <input id="userName" name="userName" type="text" class="form-control" required>
                    <div class="invalid-feedback">Usuário é um campo obrigatório!</div>
                </div>
                <div class="form-group">
                    <label for="password">Senha: </label>
                    <input id="password" name="password" type="password" class="form-control"required>
                    <div class="invalid-feedback"> Senha é um campo obrigatório!</div>
                </div>
                <button type="submit" class="btn btn-primary">Logar</button>
            </form>
        </div>

    </div>
    <c:import url="footer.jsp" />
    </body>
</html>