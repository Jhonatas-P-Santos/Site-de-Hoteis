<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/slideshow.css">
    <link rel="stylesheet" href="css/listahoteis.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
     <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
    <style type="text/css">
      
      #map {
        height: 100%;
      }

      
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    <script>
      let map;

      function initMap() {
        map = new google.maps.Map(document.getElementById("map"), {
          center: { lat: -15.7797, lng: -47.9306 },
          zoom: 6,
        });
        
        new google.maps.Marker({
        	position: {lat: -15.853539944361001, lng: -48.94508370426163},
        	map,
        	
             	
        	title: "Chalés Bela Vista",
        });
        
        new google.maps.Marker({
         	position: {lat: -15.731781840893005, lng: -47.84173185285094},
         	map,
         	
         	title: "Espaço Bambu Eventos",
        });
        
        new google.maps.Marker({
         	position: {lat: -15.516799806692521, lng: -47.69787652882801},
         	map,
         	
         	title: "Fazenda Bem Ecológico",
        });
        
        new google.maps.Marker({
         	position: {lat: -15.787317090515595, lng: -47.83234284110443},
         	map,
         	
         	title: "Condomínio Lake Side",
        });
        
      }
    </script>
    
    <title>Região CentroOeste</title>
</head>

<body>

        <div class="slideshow-container">

            <!-- Full-width images with number and caption text -->
            <div class="mySlides fade">
                <div class="numbertext">1 / 4</div>
                <img src=".//img/centrooeste/belavista.jpg">
                <div class="text">Chalés Bela Vista</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">2 / 4</div>
                <img src=".//img/centrooeste/bambu.jpg">
                <div class="text">Espaço Bambu Eventos</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">3 / 4</div>
                <img src=".//img/centrooeste/bemecologico.jpg">
                <div class="text">Fazenda Bem Ecológico</div>
            </div>
            
             <div class="mySlides fade">
                <div class="numbertext">4 / 4</div>
                <img src=".//img/centrooeste/lakeside.jpg">
                <div class="text">Condomínio Lake Side</div>
            </div>
            <!-- Next and previous buttons -->
            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
            <a class="next" onclick="plusSlides(1)">&#10095;</a>
        </div>
        <br>
        
            <div class="titulo">
        Hoteis da região Centro-Oeste
    </div>
          
    
    <section class="containerhotel">

          <ul class="listahoteis">
         <c:forEach items= "${arrayLista}" var="produto">
             <li class="hoteis">
                <span class="lista">Nome:</span>  ${produto.getSite() }
                <br>
                <span class="lista">Estado:</span>  ${produto.getNome() }
                <br>
                <span class="lista">Telefone:</span>  ${produto.getTelefone() } 
                <br>
                <span class="lista">Website:</span><br> <a href= "${produto.getEstado() }">${produto.getEstado() }</a>
               	<br>  
            </li>
            </c:forEach>
        </ul>
    </section>
    
        <div class="titulo">
        localização dos hoteis
    </div>
</body>
<div id="map"></div>

    
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDVFj2lxZrfI_ZJkyZ8LRY1p0oGn3bwC_I&callback=initMap&libraries=&v=weekly"
      async
    ></script>
<script src="js/script.js"></script>

</html>