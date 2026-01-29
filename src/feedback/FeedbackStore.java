//package feedback;
//
//import java.util.ArrayList;
//
//public class FeedbackStore {
////    public static ArrayList<Feedback> feedbacks = new ArrayList<>();
//}

package feedback;

import db.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackStore {

    // fetch all feedback
    public static List<Feedback> getAllFeedbacks() {
        List<Feedback> feedbacks = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM feedbacks")) {

            while (rs.next()) {
                Feedback f = new Feedback(
                    rs.getInt("customerId"),
                    rs.getInt("rating"),
                    rs.getString("comment")
                );
                feedbacks.add(f);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return feedbacks;
    }

    // add feedback
    public static void addFeedback(Feedback f) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO feedbacks(customerId, rating, comment) VALUES (?, ?, ?)")) {

            ps.setInt(1, f.customerId);
            ps.setInt(2, f.rating);
            ps.setString(3, f.comment);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

