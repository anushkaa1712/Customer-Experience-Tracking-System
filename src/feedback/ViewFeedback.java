package feedback;

public class ViewFeedback {

    public static void showAll() {

        if (FeedbackStore.feedbacks.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }

        for (Feedback f : FeedbackStore.feedbacks) {
            System.out.println(
                "Customer ID: " + f.customerId +
                " | Rating: " + f.rating +
                " | Comment: " + f.comment
            );
        }
    }
}
