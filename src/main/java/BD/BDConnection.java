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
        String SQL = "CREATE TABLE Data.users" +
                    "(" +
                    "Login varchar(1024) NOT NULL, " +
                    "Password varchar(1024) NOT NULL," +
                    "ID varchar(1024) NOT NULL," +
                    "PRIMARY KEY(ID)" +
                    ")";

        connect().createStatement().executeUpdate(SQLSChema);
        connect().createStatement().executeUpdate(SQL);

        SQL = "CREATE TABLE Data.obras" +
                "(" +
                "Titulo varchar(1024) NOT NULL," +
                "Genero varchar(1024)," +
                "Duracao varchar(1024)," +
                "Sinopse varchar(5012)," +
                "Image varchar(1048575)," +
                "PRIMARY KEY(Titulo)" +
                ")";

        connect().createStatement().executeUpdate(SQL);

        SQL = "CREATE TABLE Data.criticas" +
                "(" +
                "Titulo varchar(1024) NOT NULL," +
                "Genero varchar(1024)," +
                "Critica varchar(5012)," +
                "UserID varchar(1024) NOT NULL," +
                "FOREIGN KEY (Titulo) REFERENCES Data.obras(Titulo)," +
                "FOREIGN KEY (UserID) REFERENCES Data.users(ID)" +
                ")";

        connect().createStatement().executeUpdate(SQL);
    }
}
