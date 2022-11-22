<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<% String image = (String) request.getAttribute("movieImage");%>
<% String titulo = (String) request.getAttribute("movieTitulo");%>
<% String genero = (String) request.getAttribute("movieGenero");%>
<% String duracao = (String) request.getAttribute("movieDuracao");%>
<% String sinopse = (String) request.getAttribute("movieSinopse");%>
<% String username = (String) request.getAttribute("userName0");%>
<% String critica = (String) request.getAttribute("movieCriticas0");%>
<% String username1 = (String) request.getAttribute("userName1");%>
<% String critica1 = (String) request.getAttribute("movieCriticas1");%>
<% String username2 = (String) request.getAttribute("userName2");%>
<% String critica2 = (String) request.getAttribute("movieCriticas2");%>

<t:layout>
  <jsp:attribute name="header"></jsp:attribute>
  <jsp:body>
  </jsp:body>
</t:layout>

<style>
  header {
    min-width: 1024px;
    min-height: 768px;
    max-width: 1920px;
    max-height: 1080px;
  }

  .backgroundCadastro {
    position: relative;
    width: 95%;
    height: 95%;
    left: 23px;
    top: -580px;
    background: rgba(34, 34, 34, 0.9);
  }

  .titulo {
    text-align: center;
    position: absolute;
    left: 30%;
    color: #FFCC00;
  }

  .tituloCampo {
    text-align: center;
    position: absolute;
    top: 8px;
    left: 50%;
    color: white;
  }

  .genero {
    text-align: center;
    position: absolute;
    left: 30%;
    top: 10%;
    color: #FFCC00;
  }

  .generoCampo {
    text-align: center;
    position: absolute;
    top: 11%;
    left: 50%;
    color: white;
  }

  .duracao {
    text-align: center;
    position: absolute;
    left: 30%;
    top: 20%;
    color: #FFCC00;
  }

  .duracaoCampo {
    text-align: center;
    position: absolute;
    top: 21%;
    left: 50%;
    color: white;
  }

  .sinopse {
    text-align: center;
    position: absolute;
    left: 30%;
    top: 30%;
    color: #FFCC00;
  }

  .sinopseCampo {
    text-align: center;
    position: absolute;
    top: 38%;
    left: 31%;
    color: white;
  }

  .username {
    position: absolute;
    left: 5%;
    top: 60%;
  }

  .labelUsername {
    text-align: center;
    position: absolute;
    left: 5%;
    top: 55%;
    color: #FFCC00;
  }

  .critica {
    position: absolute;
    left: 5%;
    top: 70%;
  }

  .labelCritica {
    text-align: center;
    position: absolute;
    left: 5%;
    top: 65%;
    color: #FFCC00;
  }

  .username1 {
    position: absolute;
    left: 35%;
    top: 60%;
  }

  .labelUsername1 {
    text-align: center;
    position: absolute;
    left: 35%;
    top: 55%;
    color: #FFCC00;
  }

  .critica1 {
    position: absolute;
    left: 35%;
    top: 70%;
  }

  .labelCritica1 {
    text-align: center;
    position: absolute;
    left: 35%;
    top: 65%;
    color: #FFCC00;
  }

  .username2 {
    position: absolute;
    left: 65%;
    top: 60%;
  }

  .labelUsername2 {
    text-align: center;
    position: absolute;
    left: 65%;
    top: 55%;
    color: #FFCC00;
  }

  .critica2 {
    position: relative;
    left: 65%;
    top: 70%;
  }

  .labelCritica2 {
    text-align: center;
    position: absolute;
    left: 65%;
    top: 65%;
    color: #FFCC00;
  }

  img {
    position: absolute;
    top: 2%;
    left: 3%;
    height: 300px;
    width: 300px;
  }

</style>
<html>
  <body>
    <div class="backgroundCadastro">
      <h1 class="titulo">Titulo do filme:</h1>
        <h2 class="tituloCampo"><%=titulo%></h2>
      <h1 class="genero">Genero do Filme:</h1>
          <h2 class="generoCampo"><%=genero%></h2>
      <h1 class="duracao">Duração do Filme:</h1>
        <h2 class="duracaoCampo"><%=duracao%></h2>
      <h1 class="sinopse">Sinopse:</h1>
        <h2 class="sinopseCampo"><%=sinopse%></h2>

      <label class="labelUsername" for="username">Nome do usuário:</label>
        <input class="username" type="text" id="username" value="<%=username%>">
      <label class="labelCritica" for="critica">Critica:</label>
        <textarea class="critica" id="critica" rows="6" cols="50"><%=critica%></textarea>

      <label class="labelUsername1" for="username1">Nome do usuário:</label>
      <input class="username1" type="text" id="username1" value="<%=username1%>">
      <label class="labelCritica1" for="critica1">Critica:</label>
      <textarea class="critica1" id="critica1" rows="6" cols="50"><%=critica1%></textarea>

      <label class="labelUsername2" for="username2">Nome do usuário:</label>
      <input class="username2" type="text" id="username2" value="<%=username2%>">
      <label class="labelCritica2" for="critica2">Critica:</label>
      <textarea class="critica2" id="critica2" rows="6" cols="50"><%=critica2%></textarea>

      <img src="data:image/png;base64,<%=image%>">
    </div>
  </body>
</html>