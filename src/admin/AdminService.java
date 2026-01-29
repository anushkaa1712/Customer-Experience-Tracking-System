package admin;

import complaint.*;
import feedback.*;

import java.util.Scanner;

public class AdminService {

    public void viewReports() {
        ViewComplaint.showAll();
    }

    public void updateComplaintStatus() {
        Scanner sc = new Scanner(System.in);

        ViewComplaint.showAll();

        System.out.print("Enter Complaint ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Complaint c : ComplaintStore.complaints) {
            if (c.id == id) {
                System.out.print("Enter new status (OPEN / IN_PROGRESS / CLOSED): ");
                c.status = sc.nextLine();
                System.out.println("✅ Status updated.");
                return;
            }
        }
        System.out.println("❌ Complaint not found.");
    }

    public void viewAnalytics() {
        ViewFeedback.showAll();
    }
}
