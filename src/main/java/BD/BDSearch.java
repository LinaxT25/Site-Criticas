package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDSearch {
    private String SQL;
    private int search = 0;

    public boolean userSearch(Connection connection) {
        SQL = "SELECT COUNT(Login) FROM data.users";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            rs.next();
            search = rs.getInt(1);
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
}
