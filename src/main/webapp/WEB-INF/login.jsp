<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: Helvetica;
                color: #323232;
                border: none;
            }

            body {
                background-color: #301934;
                background-size: cover;

            }
            a {
                font-size: .8rem;
            }

            a.hover{
                color: #FFCC00;
            }
            #loginContainer{
                background-color: #FFF;
                width: 400px;
                margin-left: auto;
                margin-right: auto;
                padding: 20px 30px;
                margin-top: 10vh;
                border-radius: 10px;
                text-align: center;
            }

            form{
                margin-top: 30px;
                margin-bottom: 40px;
            }

            label, input{
                display: block;
                width: 100%;
                text-align: left;
            }

            label {
                font-weight: bold;
            }

            input{
                border-bottom: 2px solid #323232;
                padding: 10px;
                font-size: 1rem;
                margin-bottom: 20px;
            }

            input:focus{
                border-bottom: 2px solid #301934;
            }

            input[type="submit"]{
                text-align: center;
                text-transform: uppercase;
                font-weight: bold;
                border: none;
                height: 40px;
                border-radius: 20px;
                margin-top: 30px;
                color: #FFF;
                background-color: #FFCD04;
                cursor: pointer;
            }

            input[type="submit"].hover{
                background-color: #FFCD04;
                transition: .5s;
            }

        </style>
    </head>
    <body>
        <div id="loginContainer">
            <form action="login" method="post">
                <label for="user">User</label>
                <input type="text" id="user" name="User"/>
                <label for="password">Password</label>
                <input type="password" id="password" name="Password"/>
                <input type="submit" name="Login" value="Login">
                <input type="submit" name="Cadastro" value="Cadastro">
            </form>
        </div>
    </body>
</html>
