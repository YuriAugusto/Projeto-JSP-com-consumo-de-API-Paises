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
		<title>&#x1F9ED Detalhes de ${detalhesPais.getNomeTraduzido()}</title>
	</head>
	<body>
		
		<nav class="navbar navbar-light bg-light">
			<div class="container-fluid">
			<a href="/projeto-jsp-base/home" class="navbar-brand">&#x1F30E Home</a> <!-- redireciona a home -->
			</div>
		</nav>
	   
	    <div class="position-absolute top-50 start-50 translate-middle">
	        <div class="card mb-3" style="width: 800px;">
	            <div class="row g-0">
	                <div class="col-md-4">
	                    <img src="${detalhesPais.bandeira}" style="height: 200px;" class="img-fluid rounded-start" 
	                    	alt="${detalhesPais.bandeira}">
	                </div>
	                <div class="col-md-8">
	                    <div class="card-body">
	                        <h5 class="card-title">Nome do País</h5>
	                        <p class="card-text">${detalhesPais.getNomeTraduzido()}</p>
	
	                        <h5 class="card-title">Nome do País na língua nativa</h5>
	                        <p class="card-text">${detalhesPais.getNomeNativo()}</p>
	
	                        <h5 class="card-title">Capital</h5>
	                        <p class="card-text">${detalhesPais.getCapital()}</p>
	
	                        <h5 class="card-title">População</h5>
	                        <p class="card-text">${detalhesPais.getPopulacao()}</p>
	
	                        <h5 class="card-title">Código da Moeda Local</h5>
	                        <p class="card-text">${detalhesPais.getCodigoMoeda()}</p>
	
	                        <h5 class="card-title">Nome da Moeda Local</h5>
	                        <p class="card-text">${detalhesPais.getNomeMoeda()}</p>
	
	                        <h5 class="card-title">Símbolo da Moeda Local</h5>
	                        <p class="card-text">${detalhesPais.getSimboloMoeda()}</p>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	    
	</body>
</html>