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
    String[] images;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            /* Get the number of movies stored in database send by CadastroController to display in page catalogos*/
            numberOfMovies = databaseSearch.registeredMovies(databaseConnection.connect());
            if(req.getParameter("movie") != null) {
                req.getSession().setAttribute("movie",req.getParameter("movie"));
                resp.sendRedirect("movies");
            } else if(numberOfMovies != 0 ) {
                /* For optimization this retrieve only will occur in based in condition */
                images = databaseRetrieveObra.retrieveImage(databaseConnection.connect());
                for(int i = 1; i <= numberOfMovies; i++) {
                    req.setAttribute("Image"+i, images[i-1]);
                    req.setAttribute("numberOfImages", numberOfMovies);
                }
                req.getRequestDispatcher("/WEB-INF/catalogos.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
