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


@WebServlet(value = "/criticas")
public class CriticasController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDConnection databaseConnection = new BDConnection();
    BDAdd databaseAdd = new BDAdd();
    BDSearch databaseSearch = new BDSearch();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/criticas.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titulo = req.getParameter("Titulodofilme");
        String genero = req.getParameter("Generodaobra");
        String critica = req.getParameter("Criticadaobra");
        String cadastro = req.getParameter("Cadastrar");

        try {
            databaseConnection.initilizationBD();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if(cadastro != null) {
            HttpSession session = req.getSession();
            String userID = session.getAttribute("ID").toString();
            System.out.println(userID);
            try {
                if (!userID.isEmpty()) {
                    databaseAdd.criticaAdd(titulo, genero, critica, userID, databaseConnection.connect());
                    req.setAttribute("alertMsg", "Review has been post with success!");
                } else {
                    req.setAttribute("alertMsg", "User not logged in system!");
                }
                req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
                resp.sendRedirect("home");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
