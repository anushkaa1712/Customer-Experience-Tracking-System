package complaint;

public class ViewComplaint {

    public static void showAll() {
        if (ComplaintStore.complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        for (Complaint c : ComplaintStore.complaints) {
            System.out.println(
                "ID: " + c.id +
                " | Customer: " + c.customerId +
                " | Status: " + c.status +
                " | Desc: " + c.description
            );
        }
    }
}
