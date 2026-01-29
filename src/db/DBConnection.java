package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/cx_track",
                        "root",
                        "anu1712"
                );
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return con;
    }
}
