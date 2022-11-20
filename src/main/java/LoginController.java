import BD.BDConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;


@WebServlet(value = "/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDConnection connection = new BDConnection();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("Cadastro");
        String login = req.getParameter("User");
        String password = req.getParameter("Password");

        if(action.equals("Cadastro")) {

        }
    }
}
