<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <script>
            let message = `${message}`;
            if(message)
                alert(message);
            function passwordCheck() {
                let pass = document.getElementById("password").value;
                let passConfirm = document.getElementById("password-confirm").value;
                if (pass !== passConfirm) {
                    alert("Senhas não conferem!");
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <div class="login">
            <form>
                <label for="user">User</label>
                <input type="text" id="user" name="User"/>
                <label for="password">Password</label>
                <input type="text" id="password" name="Password"/>
            </form>
        </div>
    </body>
</html>
