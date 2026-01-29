package main;

import java.util.Scanner;
import admin.*;
import customer.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {   // 🔁 MAIN SYSTEM LOOP

            System.out.println("\n=== Customer Experience Tracking System ===");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (AdminLogin.login()) {
                        System.out.println("Admin login successful.");
                        AdminMenu.showMenu();   // returns on logout
                    } else {
                        System.out.println("Invalid admin credentials.");
                    }
                    break;

                case 2:
                    Customer customer = CustomerLogin.login();
                    CustomerMenu.showMenu(customer); // returns on logout
                    break;

                case 3:
                    System.out.println("System terminated.");
                    return;   // ONLY place system exits

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
