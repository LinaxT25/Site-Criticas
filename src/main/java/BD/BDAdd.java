package BD;

import Entities.User;

import java.sql.*;

public class BDAdd {
    private String SQL;

    public void userAdd(User user, Connection connection) throws SQLException {
        SQL = "INSERT INTO data.users(Login,Password) VALUES(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, user.getLogin());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.executeUpdate();
    }
}
