//package db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DBConnection {
//
//    private static Connection con;
//
//    public static Connection getConnection() {
//        try {
//            if (con == null) {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                con = DriverManager.getConnection(
//                        "jdbc:mysql://localhost:3306/cx_track",
//                        "root",
//                        "anu1712"
//                );
//            }
//        } catch (Exception e) {
//            System.out.println("Database connection failed");
//            e.printStackTrace();
//        }
//        return con;
//    }
//}

package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/cx_db";

    private static final String USER = "root";
    private static final String PASSWORD = "anu1712";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

