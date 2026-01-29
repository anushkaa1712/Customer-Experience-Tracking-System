package admin;

import complaint.*;
import feedback.*;

import java.util.Scanner;

public class AdminService {

    public void viewReports() {
        ViewComplaint.showAll();
    }

//    public void updateComplaintStatus() {
//        Scanner sc = new Scanner(System.in);
//
//        ViewComplaint.showAll();
//
//        System.out.print("Enter Complaint ID: ");
//        int id = sc.nextInt();
//        sc.nextLine();
//
//        
//        ComplaintStore.updateStatus(id, sc.nextLine());
//        System.out.println("Status updated.");
//
//        
//        System.out.println("Complaint not found.");
//    }
    
    public void updateComplaintStatus() {
        Scanner sc = new Scanner(System.in);

        // show complaints
        ViewComplaint.showAll();

        System.out.print("Enter Complaint ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new status (OPEN / IN_PROGRESS / CLOSED): ");
        String newStatus = sc.nextLine();

        // JDBC update
        ComplaintStore.updateStatus(id, newStatus);

        System.out.println("✅ Status updated.");
    }


    public void viewAnalytics() {
        ViewFeedback.showAll();
    }
}
