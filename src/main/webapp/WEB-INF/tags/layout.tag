<%@ tag description="Page template" pageEncoding="UTF-8"%>
<%@ attribute name="header" fragment="true" %>

<html>
    <head>
        <title>Site Criticas</title>
        <jsp:invoke fragment="header"/>
        <style>
            html, body {
                margin: 0;
            }

            .framePrincipal {
                position: relative;
                min-width: 1024px;
                min-height: 768px;
                max-width: 1920px;
                max-height: 1080px;
                background: #301934;
                background-size: cover;
            }

            .blackFrame {
                position: relative;
                min-width: 1024px;
                max-width: 1920px;
                height: 150px;
                background: black;
            }

            .line {
                position: relative;
                min-width: 1024px;
                max-width: 1920px;
                border: 5px solid #FFCD04;
            }

            .criticasNet {
                position: relative;
                width: 140px;
                height: 140px;
                left: 50%;
                top: -160px;
                background: url(resources/images/criticas_net.png);
                background-repeat:no-repeat;
                background-size:cover;
                border-radius: 116px;
            }

            .catalogos {
                position: relative;
                width: 160px;
                height: 40px;
                left: 2%;
                top: -200px;
                font-family: 'Inter';
                font-weight: 400;
                font-size: 32px;
                display: flex;
                align-items: center;
                text-indent: 5px;
                color: #000000;
                background: #FFCC00;
            }

            .novaCritica {
                position: relative;
                width: 185px;
                height: 40px;
                left: 13%;
                top: -280px;
                font-family: 'Inter';
                font-weight: 400;
                font-size: 32px;
                display: flex;
                align-items: center;
                text-indent: 5px;
                color: #000000;
                background: #FFCC00;
            }

            .cadastrarFilmes {
                position: relative;
                width: 220px;
                height: 40px;
                left: 25.75%;
                top: -320px;
                font-family: 'Inter';
                font-weight: 400;
                font-size: 32px;
                display: flex;
                align-items: center;
                text-indent: 5px;
                color: #000000;
                background: #FFCC00;
            }

            .login {
                position: relative;
                width: 140px;
                height: 40px;
                top: -240px;
                left: 80%;
                font-family: 'Inter';
                font-weight: 400;
                font-size: 32px;
                display: flex;
                align-items: center;
                text-indent: 30px;
                color: #000000;
                background: #FFCC00;
            }

        </style>
    </head>
    <body class="framePrincipal">
    <script src="popup.js"></script>
        <header>
            <div class="blackFrame"></div>
            <div class="line"></div>
            <div class="criticasNet"></div>
            <span class="catalogos" onclick="window.open('catalogos')" style="cursor:pointer;">Catálogos</span>
            <span class="login" onclick="window.open('login')" style="cursor:pointer;">Login</span>
            <span class="novaCritica" onclick="" style="cursor:pointer;">Nova Critica</span>
            <span class="cadastrarFilmes" onclick="window.open('cadastro')" style="cursor:pointer;">Cadastrar Filme</span>
            <jsp:doBody/>
        </header>
    </body>
</html>