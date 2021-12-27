package assignement.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

    public java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Crud", "root", "root");
        return con;
    }

    public void closeConnection(java.sql.Connection con) throws SQLException {
        con.close();
    }
}

