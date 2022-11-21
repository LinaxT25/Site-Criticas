package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDRetrieveObra {
    private String SQL;
    private String [] images = new String[255];

    public String retrieveTitulo(Connection connection) throws SQLException {
        SQL = "Select Titulo FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        resultSet.next();

        return resultSet.getString(1);
    }

    public String retrieveGenero(Connection connection) throws SQLException {
        SQL = "Select Genero FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        resultSet.next();

        return resultSet.getString(1);

    }

    public String retrieveDuracao(Connection connection) throws SQLException {
        SQL = "Select Duracao FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        resultSet.next();

        return resultSet.getString(1);

    }

    public String retrieveSinopse(Connection connection) throws SQLException {
        SQL = "Select Sinopse FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        resultSet.next();

        return resultSet.getString(1);

    }

    public String[] retrieveImage(Connection connection) throws SQLException {
        SQL = "Select Image FROM data.obras";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
       for(int i = 0 ; resultSet.next(); i++) {
           this.images[i] = resultSet.getString(1);
       }
        return this.images;
    }
}
