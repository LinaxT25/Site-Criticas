package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class BDRetrieveObra {
    private String SQL;
    private String SQL2;

    /* Retrieves the title of the movie stored in database postgresql */
    public String[] retrieveTitulo(Connection connection) throws SQLException {
        String [] result = new String[255];
        SQL = "Select Titulo FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        for(int i = 0 ; resultSet.next(); i++) {
            result[i] = resultSet.getString(1);
        }
        connection.close();
        return result;
    }

    /* Retrieves the genre of the movie stored in database postgresql */
    public String[] retrieveGenero(Connection connection) throws SQLException {
        String [] result = new String[255];
        SQL = "Select Genero FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        for(int i = 0 ; resultSet.next(); i++) {
            result[i] = resultSet.getString(1);
        }
        connection.close();
        return result;
    }

    /* Retrieves the duration of the movie stored in database postgresql */
    public String[] retrieveDuracao(Connection connection) throws SQLException {
        String [] result = new String[255];
        SQL = "Select Duracao FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        for(int i = 0 ; resultSet.next(); i++) {
            result[i] = resultSet.getString(1);
        }
        connection.close();
        return result;
    }

    /* Retrieves the synopsis of the movie stored in database postgresql */
    public String[] retrieveSinopse(Connection connection) throws SQLException {
        String [] result = new String[255];
        SQL = "Select Sinopse FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        for(int i = 0 ; resultSet.next(); i++) {
            result[i] = resultSet.getString(1);
        }
        connection.close();
        return result;
    }

    /* Retrieves the image of the movie stored in database postgresql */
    public String[] retrieveImage(Connection connection) throws SQLException {
        String [] result = new String[255];
        SQL = "Select Image FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
       for(int i = 0 ; resultSet.next(); i++) {
           result[i] = resultSet.getString(1);
       }
        connection.close();
        return result;
    }

    public HashMap<String,String> retrieveCritica(Connection connection, String titulo) throws SQLException {
       HashMap<String,String> result = new HashMap<>();
        SQL = "SELECT * FROM data.criticas WHERE Titulo LIKE " + "'%" + titulo + "%'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        for(int i=0; resultSet.next(); i++) {
            //Getting the userID who made the review and the review
            result.put(resultSet.getString(4),resultSet.getString(3));
        }
        connection.close();
        return result;
    }
}
