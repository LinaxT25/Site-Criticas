import BD.BDAdd;
import BD.BDConnection;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Base64;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 100) // 100 MB
@WebServlet(value = "/cadastro")
public class CadastroController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDConnection databaseConnection = new BDConnection();
    BDAdd databaseAdd = new BDAdd();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/cadastro.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titulo = req.getParameter("Titulodaobra");
        String genero = req.getParameter("Generodaobra");
        String duracao = req.getParameter("Duracaodaobra");
        String sinopse = req.getParameter("Sinopsedaobra");
        String cadastro = req.getParameter("Cadastrarfilme");
        Part upload = req.getPart("Upload");

        if(cadastro != null) {
            HttpSession session = req.getSession();
            try {
                if(session.getAttribute("ID") != null) {
                    if(upload != null && titulo != null) {
                        //Encoding image to string to fit in database
                        String encoding = Base64.getEncoder()
                                .encodeToString(IOUtils.toByteArray(upload.getInputStream()));
                        databaseAdd.obraAdd(titulo,genero,duracao,sinopse,encoding, databaseConnection.connect());
                        req.setAttribute("alertMsg", "Movie registered with success!");
                    } else {
                        req.setAttribute("alertMsg", "Title is empty or you don't upload a file!");
                    }
                } else {
                    req.setAttribute("alertMsg", "User not logged in system!");
                }
                req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
