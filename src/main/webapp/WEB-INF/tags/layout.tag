<%@ tag description="Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>

<html>
    <head>
        <title>Site Criticas</title>
        <jsp:invoke fragment="header"/>
        <style type="text/css">
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

            .layout {
            position: relative;
            min-width: 1024px;
            max-width: 1920px;
            height: 50px;
            background: url(resources/images/layout.png);
            background-repeat:no-repeat;
            background-size:cover;
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
            top: -205px;
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
            top: -240px;
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

            .cadastrarFilmes {
            position: relative;
            width: 220px;
            height: 40px;
            left: 25.75%;
            top: -360px;
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
            top: -280px;
            left: 80%;
            font-family: 'Inter';
            font-weight: 400;
            font-size: 32px;
            display: flex;
            align-items: center;
            text-indent: 5px;
            color: #000000;
            background: #FFCC00;
            }

            .cadeado {
            position: relative;
            width: 50px;
            height: 50px;
            top: -410px;
            left: 85.5%;
            background: url(resources/images/cadeado.png);
            background-repeat:no-repeat;
            background-size:cover;
            }
        </style>
    </head>
    <body class="framePrincipal">
        <header>
            <div class="blackFrame"></div>
            <div class="layout"></div>
            <div class="line"></div>
            <div class="criticasNet"></div>
            <span class="catalogos">Catálogos</span>
            <span class="login">Login</span>
            <span class="novaCritica">Nova Critica</span>
            <span class="cadastrarFilmes">Cadastrar Filme</span>
            <div class="cadeado"></div>
            <jsp:doBody/>
        </header>
    </body>
</html>