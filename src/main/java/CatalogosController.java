import BD.BDConnection;
import BD.BDRetrieveObra;
import BD.BDSearch;

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
    BDSearch databaseSearch = new BDSearch();
    int numberOfMovies = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            /* Get the number of movies stored in database send by CadastroController */
            numberOfMovies = databaseSearch.registeredMovies(databaseConnection.connect());

            if(numberOfMovies != 0 ) {
                String [] image = databaseRetrieveObra.retrieveImage(databaseConnection.connect());
                for(int i = 1; i <= numberOfMovies; i++) {
                    req.setAttribute("Image"+i,image[i-1]);
                    req.setAttribute("numberOfImages", numberOfMovies);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("/WEB-INF/catalogos.jsp").forward(req, resp);
    }
}
