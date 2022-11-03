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
            top: -320px;
            background: rgba(34, 34, 34, 0.9);
            }

            .backgroundFilme{
            position: relative;
            width: 450px;
            height: 650px;
            left: 1050px;
            top: -970px;
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

            .cadastrarFilme{
            position: relative;
            width: 292px;
            height: 38px;
            left: 350px;
            top: -1750px;
            font-family: 'Tomorrow';
            font-style: italic;
            font-weight: 400;
            font-size: 32px;
            color: #FFCC00;
            }

            .titulo{
            position: relative;
            width: 213px;
            height: 38px;
            left: -250px;
            top: -1683px;
            font-family: 'Tomorrow';
            font-style: normal;
            font-weight: 400;
            font-size: 32px;
            color: #FFCC00;
            }

            .campoTitulo{
            position: relative;
            width: 750px;
            height: 38px;
            left: 230px;
            top: -1720px;
            background: #A1A2A6;
            }

            .genero{
            position: relative;
            width: 120px;
            height: 38px;
            left: -360px;
            top: -1615px;
            font-family: 'Tomorrow';
            font-style: normal;
            font-weight: 400;
            font-size: 32px;
            color: #FFCC00;
            }

            .campoGenero{
            position: relative;
            width: 750px;
            height: 38px;
            left: 230px;
            top: -1690px;
            background: #A1A2A6;
            }

            .duracao{
            position: relative;
            width: 135px;
            height: 38px;
            left: -480px;
            top: -1545px;
            font-family: 'Tomorrow';
            font-style: normal;
            font-weight: 400;
            font-size: 32px;
            line-height: 38px;
            color: #FFCC00;
            }

            .campoDuracao{
            position: relative;
            width: 750px;
            height: 38px;
            left: 230px;
            top: -1660px;
            background: #A1A2A6;
            }

            .sinopse{
            position: relative;
            width: 132px;
            height: 38px;
            left: -594px;
            top: -1480px;
            font-family: 'Tomorrow';
            font-style: normal;
            font-weight: 400;
            font-size: 32px;
            color: #FFCC00;
            }

            .campoSinopse{
            position: relative;
            width: 750px;
            height: 300px;
            left: 230px;
            top: -1620px;
            background: #A1A2A6;
            }
       </style>
       <div class="backgroundCadastro"></div>
       <div class="backgroundFilme"></div>
       <div class="addButton"></div>
       <div class="campoTitulo"></div>
       <div class="campoGenero"></div>
       <div class="campoDuracao"></div>
       <div class="campoSinopse"></div>
       <span class="cadastrarFilme">CADASTRAR FILME</span>
       <span class="titulo">Titulo da obra:</span>
       <span class="genero">Gênero:</span>
       <span class="duracao">Duração:</span>
       <span class="sinopse">Sinópse:</span>
    </jsp:body>
</t:layout>