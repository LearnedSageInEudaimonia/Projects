package Level_4.ATM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
    public boolean authenticateUser(String username, String pin) throws SQLException{
        String sql = "SELECT * FROM Users WHERE username = ? AND pin = ?";
        try(Connection connection = DatabaseConnection.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2,pin);
            ResultSet rs = statement.executeQuery();
            return rs.next();
        }
    }

    public double getBalance(String username) throws SQLException {
        String sql = "SELECT balance FROM Users WHERE username = ?";
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            }

        }
        return 0.0;
    }
    public void updateBalance(String username, double amount) throws SQLException {
        String sql = "UPDATE Users SET balance = ? WHERE username = ? ";
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, amount);
            statement.setString(2, username);
            statement.executeUpdate();
        }
    }
}
