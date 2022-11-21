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

            .backgroundFilme input[type=file] {
                display: none;
            }

            .backgroundFilme input[type=submit] {
                position: relative;
                width: 50%;
                background-color: #FFCC00;
                cursor: pointer;
                border: none;
                border-radius: 4px;
                font-size: 1.2em;
                margin: 15px;
                left: 100px;
                top: 200px;
            }

            img {
                position: relative;
                height: 150px;
                width: 150px;
                top: 200px;
                left: 150px;
            }

            label {
                font-size: 18px;
                color: #FFCC00;
            }
       </style>
        <form action="cadastro" method="post" enctype="multipart/form-data">
           <div class="backgroundCadastro">
                   <label for="titulo">Título da Obra:</label>
                   <input type="text" id="titulo" name="Titulodaobra"/>
                   <label for="genero">Gênero:</label>
                   <input type="text" id="genero" name="Generodaobra"/>
                   <label for="duracao">Duração:</label>
                   <input type="text" id="duracao" name="Duracaodaobra"/>
                   <label for="sinopse">Sinópse:</label>
                   <textarea id="sinopse" name="Sinopsedaobra" rows="6" cols="50"></textarea>
                   <input type="submit" value="Cadastrar Filme" name="Cadastrarfilme"/>
           </div>
           <div class="backgroundFilme">
               <label for="image-input">
                   <img src="resources/images/add_button.png"/>
               </label>
               <input id="image-input" type="file" alt="submit" accept=".png,.jpg,.jpeg" name="Upload"/>
            </div>
        </form>
    </jsp:body>
</t:layout>