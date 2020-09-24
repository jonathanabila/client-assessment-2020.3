<%--
  Created by IntelliJ IDEA.
  User: jonathan
  Date: 20/09/2020
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="style.jsp" />
<!DOCTYPE html>
<html>
<head>
    <title>Assessment - Jonathan Tolentino</title>
    <meta charset="UTF-8">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar bg">
        <a class="navbar-brand" href="home">
            <img class="p-3 align-items-center" src="<c:url value="/resources/images/jedi-logo.svg" />" alt="infnet">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div style="display: flex" class="collapse navbar-collapse" id="navbarSupportedContent">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            <a class="nav-link" href="<c:url value="/buys"/>">Compras</a>
            <a class="nav-link" href="<c:url value="/buyers"/>">Compradores</a>
            <a class="nav-link" href="<c:url value="/products"/>">Produtos</a>
            <a class="nav-link" href="<c:url value="/coffee-machines"/>">Máquinas de café</a>
            <a class="nav-link" href="<c:url value="/keyboards"/>">Teclados</a>
            <a class="nav-link" href="<c:url value="/monitors"/>">Monitores</a>
            <a class="nav-link" href="<c:url value="/user"/>">Perfil</a>
            <a class="nav-link" href="<c:url value="/logout"/>">Sair</a>
        </div>
        <hr>
    </nav>
