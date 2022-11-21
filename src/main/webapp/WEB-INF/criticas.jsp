<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:body>
    <style>
            header {
                overflow:clip;
                min-width: 1024px;
                min-height: 768px;
                max-width: 1920px;
                max-height: 1080px;
            }

            .Criticas{
                position: relative;
                width: 1450px;
                height: 650px;
                left: 23px;
                top: -250px;
                background: rgba(34, 34, 34, 0.9);
            }

            .Criticas input[type=text] {
                width: 95%;
                font-size: 1.2em;
                margin: 15px;
            }

            .Criticas input[type=submit] {
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

            .Criticas textarea {
                width: 95%;
                font-size: 1.2em;
                margin: 15px;
            }

            label {
                font-size: 18px;
                color: #FFCC00;
            }
       </style>
       <div class="Criticas">
          <form action="criticas" method="post">
               <label for="titulo">Título do Filme:</label>
               <input type="text" id="titulo" name="Titulodofilme"/>
               <label for="genero">Gênero:</label>
               <input type="text" id="genero" name="Generodaobra"/>
               <label for="critica">Crítica:</label>
               <textarea id="critica" name="Criticadaobra" rows="6" cols="50"></textarea>
               <input type="submit" name="Cadastrar" value="Cadastrar Critica"/>
          </form>
       </div>
    </jsp:body>
</t:layout>