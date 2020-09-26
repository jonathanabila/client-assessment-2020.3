<%--
  Created by IntelliJ IDEA.
  User: jonathan
  Date: 20/09/2020
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assessment - Jonathan Tolentino</title>
    <meta charset="UTF-8">
</head>
<body>
    <nav class="bg-light">
        <div style="display: flex; justify-content: space-between; align-items: center" >
            <div style="display: flex; align-items: center">
                <a class="nav-link" href="<c:url value="/home"/>">
                    <img class="align-items-center" src="<c:url value="/resources/images/jedi-logo.svg" />" alt="infnet">
                    Home
                </a>
                <a class="nav-link" href="<c:url value="/buys"/>">Compras</a>
                <a class="nav-link" href="<c:url value="/buyers"/>">Compradores</a>
                <a class="nav-link" href="<c:url value="/products"/>">Produtos</a>
                <a class="nav-link" href="<c:url value="/coffee-machines"/>">Máquinas de café</a>
                <a class="nav-link" href="<c:url value="/keyboards"/>">Teclados</a>
                <a class="nav-link" href="<c:url value="/monitors"/>">Monitores</a>
            </div>
            <div style="display: flex">
                <a class="nav-link" href="<c:url value="#"/>">Usuário: ${user.userName}</a>
                <a class="nav-link" href="<c:url value="/logout"/>">Sair</a>
            </div>
        </div>
    </nav>