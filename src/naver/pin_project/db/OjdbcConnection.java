package src.naver.pin_project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OjdbcConnection {
    private static String driverName = "com.mysql.cj.jdbc.Driver";

<<<<<<< HEAD
    private static String url = "jdbc:mysql://localhost:3306/test2";
    private static String user = "root";
    private static String pw = "00000000";
=======
    private static String url = "jdbc:mysql://175.209.41.173:3306/kiosk_database";
    private static String user = "siho";
    private static String pw = "1234";
>>>>>>> main


    static {
        try {
            Class.forName(driverName);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();

        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,pw);
    }
}
