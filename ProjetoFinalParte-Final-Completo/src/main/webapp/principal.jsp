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

    <title>Primeira Tela</title>
</head>

<body>
    <div id="login-container">
        <h1>Bem vindo(a) aos nossos serviços de hotelaria</h1>
        <form action="HotelController" method="post"">
            <label for="nome">Favor inserir seu nome:</label>
            <input type="text" name="nome" id="nome" required placeholder="Digite seu nome"></input>
            <p>

             <input type="submit" value="Ir para o site"></input>

        </form>

    </div>
</body>
</html>