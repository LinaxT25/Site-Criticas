package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDSearch {
    private String SQL;
    private int search = 0;

    /* Search a user in database postgresql using SQL */
    public boolean userSearch(Connection connection , String user) {
        SQL = "SELECT COUNT(Login) FROM data.users WHERE login LIKE " +
                "'%" + user + "%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            search = resultSet.getInt(1);
            connection.close();

            if(search != 0) {
                return true;
            } else {
                return  false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    /* Verifies if password sent by a user is the same in database postgresql with SQL */
    public boolean passwordCheck(Connection connection, String password) {
        SQL = "SELECT COUNT(Password) FROM data.users WHERE Password LIKE " +
                "'%" + password + "%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            search = resultSet.getInt(1);
            connection.close();

            if(search != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    /* If the login and password is corrected then retrieve a unique ID from user in database postgresql with SQL */
    public String idRetrive(Connection connection, String login, String password ) {
        SQL = "SELECT ID FROM data.users WHERE Login LIKE " +
                "'%" + login + "%'" +
                " AND " +
                "Password LIKE " +
                "'%" + password + "%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            return resultSet.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public int registeredMovies(Connection connection) {
        SQL = "SELECT COUNT(*) FROM data.obras";
        int count = 0;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            count = resultSet.getInt(1);
            return  count;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }

    public String loginById(Connection connection, String userID) {
        SQL = "SELECT Login FROM data.users WHERE ID LIKE " + "'%" + userID + "%'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            return resultSet.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
