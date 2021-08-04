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
          center: { lat: -3.1292, lng:-60.0214 },
          zoom: 6,
        });
        
        new google.maps.Marker({
        	position: {lat: -2.5068904489515798, lng: -43.25665983068697},
        	map,
        	
             	
        	title: "Ciamat Camp",
        });
        new google.maps.Marker({
         	position: {lat: -0.5939001305350685, lng: -47.313119869315976},
         	map,
         	
         	title: "Concha do Mar",
        });
        
        new google.maps.Marker({
         	position: {lat: -3.1290895811276513, lng: -60.02484274602604},
         	map,
         	
         	title: "Villa Amazonia",
        });
        
        
        
      }
    </script>
    
    <title>Região Norte</title>
</head>

<body>

        <div class="slideshow-container">

            <!-- Full-width images with number and caption text -->
            <div class="mySlides fade">
                <div class="numbertext">1 / 3</div>
                <img src=".//img/norte/conhadoMar.jpg">
                <div class="text">Concha do Mar</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">2 / 3</div>
                <img src=".//img/norte/ciamatCamp.jpg">
                <div class="text">Ciamat Camp</div>
            </div>

            <div class="mySlides fade">
                <div class="numbertext">3 / 3</div>
                <img src=".//img/norte/villaAmazonia.jpg">
                <div class="text">Villa Amazonia</div>
            </div>
            
            <!-- Next and previous buttons -->
            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
            <a class="next" onclick="plusSlides(1)">&#10095;</a>
        </div>
        <br>
        
            <div class="titulo">
        Hoteis da região Norte
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