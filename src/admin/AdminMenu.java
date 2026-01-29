package admin;

import java.util.Scanner;

public class AdminMenu {

    public static void showMenu() {

        Scanner sc = new Scanner(System.in);
        AdminService service = new AdminService();

        while (true) {
            System.out.println("\n--- Admin Dashboard ---");
            System.out.println("1. View Complaints Report");
            System.out.println("2. Update Complaint Status");
            System.out.println("3. Logout");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    service.viewReports();   // REAL DATA
                    break;

                case 2:
                    service.updateComplaintStatus(); // REAL UPDATE
                    break;

                case 3:
                    System.out.println("Admin logged out.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
