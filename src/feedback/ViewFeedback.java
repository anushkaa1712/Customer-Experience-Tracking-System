//package feedback;
//
//public class ViewFeedback {
//
//    public static void showAll() {
//
//        if (FeedbackStore.feedbacks.isEmpty()) {
//            System.out.println("No feedback available.");
//            return;
//        }
//
////        for (Feedback f : FeedbackStore.feedbacks) {
////            System.out.println(
////                "Customer ID: " + f.customerId +
////                " | Rating: " + f.rating +
////                " | Comment: " + f.comment
////            );
////        }
//        
//        for (Feedback f : FeedbackStore.getAllFeedbacks()) {
//            System.out.println(
//                "Customer ID: " + f.customerId +
//                " | Rating: " + f.rating +
//                " | Comment: " + f.comment
//            );
//        }
//
//    }
//}


package feedback;

import java.util.List;

public class ViewFeedback {

    public static void showAll() {
        List<Feedback> feedbacks = FeedbackStore.getAllFeedbacks();

        if (feedbacks.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }

        for (Feedback f : feedbacks) {
            System.out.println(
                "Customer ID: " + f.customerId +
                " | Rating: " + f.rating +
                " | Comment: " + f.comment
            );
        }
    }
}
