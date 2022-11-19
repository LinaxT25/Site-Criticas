import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import EJB.UserRepository;
import entities.User;

@WebServlet(value = "/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
   private UserRepository userRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("Cadastro");

        if(action != null && action.equals("Cadastro")) {
            String login = req.getParameter("User");
            String password = req.getParameter("Password");

            try {
                User userExist = this.userRepository.findById(login);

                if(userExist == null) {
                    throw new Exception("User already exists in system!");
                } else {
                    Date userDateCreation = new Date();
                    User user = new User(login, password, userDateCreation);
                    this.userRepository.save(user);
                    req.getSession().setAttribute("user", user);
                }
            } catch (Exception e) {

            }
        }
    }
}
