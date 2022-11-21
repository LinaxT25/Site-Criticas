package BD;

import java.sql.*;

public class BDAdd {
    private String SQL;

    /* Add a new user to database in postgresql */
    public void userAdd(String login, String password, String id, Connection connection) throws SQLException {
        SQL = "INSERT INTO data.users(Login,Password,ID) VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, login);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, id);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void criticaAdd(String titulo, String genero, String critica, String ID, Connection connection) throws SQLException {
                SQL = "INSERT INTO data.criticas(Titulo,Genero,Critica,UserID) VALUES(?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1,titulo);
                preparedStatement.setString(2,genero);
                preparedStatement.setString(3,critica);
                preparedStatement.setString(4,ID);
                preparedStatement.executeUpdate();
                connection.close();
    }

    public void obraAdd(String titulo, String genero, String duracao, String sinopse, String encodedImage, Connection connection)
        throws SQLException {
                SQL = "INSERT INTO data.obras(Titulo,Genero,Duracao,Sinopse,Image) VALUES(?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1,titulo);
                preparedStatement.setString(2,genero);
                preparedStatement.setString(3,duracao);
                preparedStatement.setString(4,sinopse);
                preparedStatement.setString(5,encodedImage);
                preparedStatement.executeUpdate();
                connection.close();
    }
}
