package complaint;

public class Complaint {
    public int id;
    public int customerId;
    public String description;
    public String status;

    public Complaint(int id, int customerId, String description) {
        this.id = id;
        this.customerId = customerId;
        this.description = description;
        this.status = "OPEN";
    }
}
