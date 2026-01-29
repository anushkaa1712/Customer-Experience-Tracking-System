package admin;

import java.util.Scanner;

public class AdminLogin {

    public static boolean login() {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("admin", "admin123");

        System.out.print("Admin Username: ");
        String u = sc.next();

        System.out.print("Admin Password: ");
        String p = sc.next();

        return admin.validate(u, p);
    }
}
