//package complaint;
//
//public class ViewComplaint {
//
//    public static void showAll() {
//        if (ComplaintStore.complaints.isEmpty()) {
//            System.out.println("No complaints found.");
//            return;
//        }
//
////        for (Complaint c : ComplaintStore.complaints) {
////            System.out.println(
////                "ID: " + c.id +
////                " | Customer: " + c.customerId +
////                " | Status: " + c.status +
////                " | Desc: " + c.description
////            );
////        }
//        
//        for (Complaint c : ComplaintStore.getAllComplaints()) {
//            System.out.println(
//                "ID: " + c.id + 
//                " | CustomerID: " + c.customerId + 
//                " | Desc: " + c.description + 
//                " | Status: " + c.status
//            );
//        }
//
//    }
//}

package complaint;

import java.util.List;

public class ViewComplaint {

    public static void showAll() {
        List<Complaint> complaints = ComplaintStore.getAllComplaints();

        if (complaints.isEmpty()) {
            System.out.println("No complaints available.");
            return;
        }

        for (Complaint c : complaints) {
            System.out.println(
                "ID: " + c.id +
                " | CustomerID: " + c.customerId +
                " | Desc: " + c.description +
                " | Status: " + c.status
            );
        }
    }
}

