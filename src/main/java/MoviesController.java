import BD.BDConnection;
import BD.BDRetrieveObra;
import BD.BDSearch;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/movies")
public class MoviesController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    BDRetrieveObra databaseRetrieveObra = new BDRetrieveObra();
    BDConnection databaseConnection = new BDConnection();
    BDSearch databaseSearch = new BDSearch();
    String[] images;
    String[] titulos;
    String[] generos;
    String[] duracao;
    String[] sinopses;
    String[] usersName = new String[255];
    HashMap<String,String> result = new HashMap<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* If for optimization purposes */
        if (req.getSession().getAttribute("movie") != null) {
            try {
                titulos = databaseRetrieveObra.retrieveTitulo(databaseConnection.connect());
                generos = databaseRetrieveObra.retrieveGenero(databaseConnection.connect());
                duracao = databaseRetrieveObra.retrieveDuracao(databaseConnection.connect());
                sinopses = databaseRetrieveObra.retrieveSinopse(databaseConnection.connect());
                images = databaseRetrieveObra.retrieveImage(databaseConnection.connect());

                /* Creating a corresponding page to movie based with param id sent in url */
                switch ((String)req.getSession().getAttribute("movie")) {

                    case "id1":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[0]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[0]);
                        req.setAttribute("movieTitulo", titulos[0]);
                        req.setAttribute("movieGenero", generos[0]);
                        req.setAttribute("movieDuracao", duracao[0]);
                        req.setAttribute("movieSinopse", sinopses[0]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id2":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[1]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[1]);
                        req.setAttribute("movieTitulo", titulos[1]);
                        req.setAttribute("movieGenero", generos[1]);
                        req.setAttribute("movieDuracao", duracao[1]);
                        req.setAttribute("movieSinopse", sinopses[1]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id3":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[2]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[2]);
                        req.setAttribute("movieTitulo", titulos[2]);
                        req.setAttribute("movieGenero", generos[2]);
                        req.setAttribute("movieDuracao", duracao[2]);
                        req.setAttribute("movieSinopse", sinopses[2]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id4":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[3]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[3]);
                        req.setAttribute("movieTitulo", titulos[3]);
                        req.setAttribute("movieGenero", generos[3]);
                        req.setAttribute("movieDuracao", duracao[3]);
                        req.setAttribute("movieSinopse", sinopses[3]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id5":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[4]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[4]);
                        req.setAttribute("movieTitulo", titulos[4]);
                        req.setAttribute("movieGenero", generos[4]);
                        req.setAttribute("movieDuracao", duracao[4]);
                        req.setAttribute("movieSinopse", sinopses[4]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id6":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[5]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[5]);
                        req.setAttribute("movieTitulo", titulos[5]);
                        req.setAttribute("movieGenero", generos[5]);
                        req.setAttribute("movieDuracao", duracao[5]);
                        req.setAttribute("movieSinopse", sinopses[5]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id7":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[6]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[6]);
                        req.setAttribute("movieTitulo", titulos[6]);
                        req.setAttribute("movieGenero", generos[6]);
                        req.setAttribute("movieDuracao", duracao[6]);
                        req.setAttribute("movieSinopse", sinopses[6]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id8":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[7]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[7]);
                        req.setAttribute("movieTitulo", titulos[7]);
                        req.setAttribute("movieGenero", generos[7]);
                        req.setAttribute("movieDuracao", duracao[7]);
                        req.setAttribute("movieSinopse", sinopses[7]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id9":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[8]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[8]);
                        req.setAttribute("movieTitulo", titulos[8]);
                        req.setAttribute("movieGenero", generos[8]);
                        req.setAttribute("movieDuracao", duracao[8]);
                        req.setAttribute("movieSinopse", sinopses[8]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id10":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[9]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[9]);
                        req.setAttribute("movieTitulo", titulos[9]);
                        req.setAttribute("movieGenero", generos[9]);
                        req.setAttribute("movieDuracao", duracao[9]);
                        req.setAttribute("movieSinopse", sinopses[9]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id11":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[10]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[10]);
                        req.setAttribute("movieTitulo", titulos[10]);
                        req.setAttribute("movieGenero", generos[10]);
                        req.setAttribute("movieDuracao", duracao[10]);
                        req.setAttribute("movieSinopse", sinopses[10]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id12":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[11]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[11]);
                        req.setAttribute("movieTitulo", titulos[11]);
                        req.setAttribute("movieGenero", generos[11]);
                        req.setAttribute("movieDuracao", duracao[11]);
                        req.setAttribute("movieSinopse", sinopses[11]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;

                    case "id13":
                        //Search for reviews in movie
                        result = databaseRetrieveObra.retrieveCritica(databaseConnection.connect(),titulos[12]);
                        if(!result.isEmpty()) {
                            int i = 0;
                            for(String key: result.keySet()) {
                                usersName[i] = databaseSearch.loginById(databaseConnection.connect(), key);
                                req.setAttribute("movieCriticas"+i, result.get(key));
                                req.setAttribute("userName"+i, usersName[i]);
                                i++;
                            }
                        }
                        req.setAttribute("movieImage", images[12]);
                        req.setAttribute("movieTitulo", titulos[12]);
                        req.setAttribute("movieGenero", generos[12]);
                        req.setAttribute("movieDuracao", duracao[12]);
                        req.setAttribute("movieSinopse", sinopses[12]);
                        req.getRequestDispatcher("/WEB-INF/movies.jsp").forward(req, resp);
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}