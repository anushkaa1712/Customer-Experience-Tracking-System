package customer;

import java.util.Scanner;
import complaint.AddComplaint;
import feedback.AddFeedback;

public class CustomerMenu {

    public static void showMenu(Customer customer) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Generate Complaint");
            System.out.println("2. Generate Feedback");
            System.out.println("3. Logout");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    AddComplaint.create(customer.id);
                    break;

                case 2:
                    AddFeedback.add(customer.id);
                    break;

                case 3:
                    System.out.println("Customer logged out.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
