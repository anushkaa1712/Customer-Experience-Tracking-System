package complaint;

import java.util.Scanner;

public class AddComplaint {

    static int count = 1;

    public static void create(int customerId) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complaint description: ");
        String desc = sc.nextLine();

        Complaint c = new Complaint(count++, customerId, desc);
        ComplaintStore.complaints.add(c);

        System.out.println("✅ Complaint added successfully.");
    }
}
 