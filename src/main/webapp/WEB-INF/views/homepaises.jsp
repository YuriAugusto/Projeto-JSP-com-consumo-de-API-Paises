<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<!-- adição do bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" 
			rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
			crossorigin="anonymous">
		<meta charset="UTF-8">
		<title>&#x1F30E Home Países</title><!-- emoji mundo &#x1F30E, emoji bússola &#x1F9ED -->
	</head>
	<body>
		<nav class="navbar navbar-light bg-light">
			<div class="container-fluid">
				<a href="/projeto-jsp-base/home" class="navbar-brand">&#x1F30E Home</a> <!-- redireciona a home -->
				<a href="/projeto-jsp-base/homeOrdenada">
					<button type="button" class="btn btn-secondary">Ordenar Países</button> 
				</a>
			</div>
		</nav>
		
		<div class="container">
			<div class="row align-items-start">
     			<!-- Adicionar o forEach -->
            	<c:forEach items="${listaDePaises}" var="pais">
     				<div class="col-3 row max-tamanho-card">
						<div class="card shadow-sm">
             				<img src="${pais.getBandeira()}" class="card-img-top" alt="${filme.getTitulo()}">
							<div class="card-body">
             					<h5>País Br: ${pais.getNomeTraduzido()}</h5>
             					<h5>Na língua nativa: ${pais.getNomeNativo()}</h5>
             					<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
										<!-- o endpoit tem que ser informado sem a "/" antes de home -->
										<!-- aqui eu informo o Id que tem que ser buscado -->
                 						<a href="home/detalhes/${pais.getNomeTraduzido()}"><button type="button" 
                 							class="btn btn-sm btn-outline-secondary">Visualizar</button>
                 						</a>
									</div>
             					</div>
							</div>
         				</div>
     				</div>
     			</c:forEach>
			</div>     
		</div>
		
	</body>
</html>

<style>
img{
	width: 280px; 
	height: 170px;
}
</style>
