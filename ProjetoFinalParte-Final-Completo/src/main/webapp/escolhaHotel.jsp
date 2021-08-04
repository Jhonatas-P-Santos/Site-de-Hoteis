<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <title>Login</title>
</head>

<body>
    <div id="login-container">
        <h1>Bem vindo(a) aos nossos serviços de hotelaria</h1>
        <p>Olá ${nome}! favor escolher uma região:
        </p>
        <form action="">
            <select id="address_state" required class="form-control" name="address_state">
            
                <option selected value="">Escolher...</option>
                <option value="Norte">Norte</option>
                <option value="Nordeste">Nordeste</option>
                <option value="CentroOeste">Centro Oeste</option>
                <option value="Sudeste">Sudeste</option>
                <option value="Sul">Sul</option>
                
            </select>


            <input type="submit" id="submit" value="Enviar"></input>


        </form>

    </div>

</body>
<script src="js/script.js"></script>

</html>