//package complaint;
//
//import java.util.ArrayList;
//
//public class ComplaintStore {
////    public static ArrayList<Complaint> complaints = new ArrayList<>();
//}


package complaint;

import db.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComplaintStore {

    // fetch all complaints from DB
    public static List<Complaint> getAllComplaints() {
        List<Complaint> complaints = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM complaints")) {

            while (rs.next()) {
                Complaint c = new Complaint(
                    rs.getInt("id"),
                    rs.getInt("customerId"),
                    rs.getString("description")
                );
                c.status = rs.getString("status");
                complaints.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return complaints;
    }

    // add new complaint
    public static void addComplaint(Complaint c) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO complaints(customerId, description, status) VALUES (?, ?, ?)")) {

            ps.setInt(1, c.customerId);
            ps.setString(2, c.description);
            ps.setString(3, c.status);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update status
    public static void updateStatus(int id, String newStatus) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "UPDATE complaints SET status = ? WHERE id = ?")) {

            ps.setString(1, newStatus);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
