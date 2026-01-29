package feedback;

import java.util.Scanner;

public class AddFeedback {

    public static void add(int customerId) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter feedback comment: ");
        String comment = sc.nextLine();

        Feedback f = new Feedback(customerId, rating, comment);
        FeedbackStore.feedbacks.add(f);

        System.out.println("✅ Feedback submitted successfully.");
    }
}
