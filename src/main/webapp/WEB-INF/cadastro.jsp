<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:body>
    <style type="text/css">
            header {
                overflow:clip;
                min-width: 1024px;
                min-height: 768px;
                max-width: 1920px;
                max-height: 1080px;
            }

            .backgroundCadastro{
                position: relative;
                width: 1000px;
                height: 650px;
                left: 23px;
                top: -250px;
                background: rgba(34, 34, 34, 0.9);
            }

            .backgroundFilme{
                position: relative;
                width: 450px;
                height: 650px;
                left: 1050px;
                top: -900px;
                background: rgba(34, 34, 34, 0.9);
            }

            .addButton{
                position: relative;
                height: 150px;
                width: 150px;
                left: 1200px;
                top: -1400px;
                background: url(resources/images/add_button.png);
                background-repeat:no-repeat;
                background-size:cover;
            }

            .backgroundCadastro input[type=text] {
                width: 95%;
                font-size: 1.2em;
                margin: 15px;
            }

            .backgroundCadastro input[type=submit] {
                position: relative;
                width: 50%;
                background-color: #FFCC00;
                cursor: pointer;
                border: none;
                border-radius: 4px;
                font-size: 1.2em;
                margin: 15px;
                left: 20%;
            }

            .backgroundCadastro textarea {
                width: 95%;
                font-size: 1.2em;
                margin: 15px;
            }

            label {
                font-size: 18px;
                color: #FFCC00;
            }
       </style>
       <div class="backgroundCadastro">
          <form>
               <label for="titulo">Título da Obra:</label>
               <input type="text" id="titulo" name="titulodaobra"/>
               <label for="genero">Gênero:</label>
               <input type="text" id="genero" name="generodaobra"/>
               <label for="duracao">Duração:</label>
               <input type="text" id="duracao" name="duracaodaobra"/>
               <label for="sinopse">Sinópse:</label>
               <textarea id="sinopse" name="sinopsedaobra" rows="6" cols="50"></textarea>
               <input type="submit" value="Cadastrar Filme"/>
          </form>
       </div>
       <div class="backgroundFilme"></div>
       <div class="addButton"></div>
    </jsp:body>
</t:layout>