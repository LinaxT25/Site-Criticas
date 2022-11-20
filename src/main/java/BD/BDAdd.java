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
    }
}
