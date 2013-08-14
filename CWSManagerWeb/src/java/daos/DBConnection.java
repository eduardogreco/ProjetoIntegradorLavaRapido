package daos;

import static daos.DBConnection.conn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {  
    public static Connection conn;

      public static final String JDBC_URL = "jdbc:mysql://localhost:3306/bolao?user=root&password=";

    public static  Connection getMyDConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
    }

    public static Connection connect(){
        try {
            return DBConnection.getMyDConnection();
        } catch (Exception ex) {
             ex.printStackTrace();
             return null;
        }
    }
    public static void close(){
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static PreparedStatement prepareStatement(String sql){
        conn = DBConnection.connect();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ps;
    }
}