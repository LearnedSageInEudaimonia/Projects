package Level_4.ATM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDAO {
    public void recordTransaction(String username, String type, double amount) throws SQLException {
        String sql = "INSERT INTO Transactions (user_id, type, amount) VALUES ((SELECT user_id FROM Users WHERE username = ?), ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, type);
            statement.setDouble(3, amount);
            statement.executeUpdate();
        }
    }

    public void getTransactionHistory(String username) throws SQLException {
        String sql = "SELECT type, amount, timestamp FROM Transactions WHERE user_id = (SELECT user_id FROM Users WHERE username = ?) ORDER BY timestamp DESC";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Transaction History:");
            while (rs.next()) {
                System.out.println(rs.getString("type") + " | ₹" + rs.getDouble("amount") + " | " + rs.getTimestamp("timestamp"));
            }
        }
    }
}
