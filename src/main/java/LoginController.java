import BD.BDAdd;
import BD.BDConnection;
import BD.BDSearch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(value = "/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDConnection databaseConnection = new BDConnection();
    BDSearch databaseSearch = new BDSearch();
    BDAdd databaseAdd = new BDAdd();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actionC = req.getParameter("Cadastro");
        String actionL = req.getParameter("Login");
        String login = req.getParameter("User");
        String password = req.getParameter("Password");

        if(actionC != null) {
            try {
                //If user not exist then create a new
                if(!databaseSearch.userSearch(databaseConnection.connect(),login)) {
                    HttpSession session = req.getSession();
                    databaseAdd.userAdd(login,password,session.getId(),databaseConnection.connect());
                    //Logging user recently registered.
                    session.setAttribute("ID",databaseSearch.idRetrive
                            (databaseConnection.connect(),login,password));
                    req.setAttribute("alertMsg", "Registration Successful!");
                } else {
                    req.setAttribute("alertMsg", "User already exists!");
                }
                req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req,resp);
                resp.sendRedirect("home");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if(actionL != null) {
            try {
                //Logging a user into the system if it already exists
                if(databaseSearch.userSearch(databaseConnection.connect(),login)) {
                    if(databaseSearch.passwordCheck(databaseConnection.connect(),password)) {
                        HttpSession session = req.getSession();
                        //Getting a ID from user with logged in system and forwarding in session
                       session.setAttribute("ID",databaseSearch.idRetrive
                               (databaseConnection.connect(),login,password));
                       req.setAttribute("alertMsg", "Logged with success!");
                    } else {
                        req.setAttribute("alertMsg", "Wrong Password!");
                    }
                } else {
                    req.setAttribute("alertMsg", "User not exist!");
                }
                req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req,resp);
                resp.sendRedirect("home");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
