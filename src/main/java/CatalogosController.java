import BD.BDConnection;
import BD.BDRetrieveObra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/catalogos")
public class CatalogosController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDRetrieveObra databaseRetrieveObra = new BDRetrieveObra();
    BDConnection databaseConnection = new BDConnection();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setAttribute("Titulo", databaseRetrieveObra.retrieveTitulo(databaseConnection.connect()));
            req.setAttribute("Image", databaseRetrieveObra.retrieveImage(databaseConnection.connect()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("/WEB-INF/catalogos.jsp").forward(req, resp);
    }
}
