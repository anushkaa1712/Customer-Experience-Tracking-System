package feedback;

public class Feedback {

    public int customerId;
    public int rating;
    public String comment;

    public Feedback(int customerId, int rating, String comment) {
        this.customerId = customerId;
        this.rating = rating;
        this.comment = comment;
    }
}
