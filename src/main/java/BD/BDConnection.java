package BD;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class BDConnection {
    /* Method for connect to database in postgresql */
    public Connection connect() throws Exception {
        InitialContext context =  new InitialContext();
        if(context == null) {
            throw new Exception("No Context found!");
        }
        DataSource dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/postgres");
        if(dataSource == null) {
            throw new Exception("Data source not found!");
        }
        return dataSource.getConnection();
    }

    /* Script for creating new schema and table in BD for easiness */
    public void initilizationBD() throws Exception {
        String SQLSChema = "CREATE SCHEMA " + "Data";
        String SQL = "CREATE TABLE Data.Users" +
                    "(" +
                    "Login varchar(1024), " +
                    "Password varchar(1024)," +
                    "ID varchar(1024)" +
                    ")";

        connect().createStatement().executeUpdate(SQLSChema);
        connect().prepareStatement(SQL).execute();
    }
}
