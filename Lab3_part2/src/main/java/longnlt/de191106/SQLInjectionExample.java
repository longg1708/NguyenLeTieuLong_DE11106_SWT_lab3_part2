package longnlt.de191106;

import java.sql.*;
import java.util.logging.Logger;

public class SQLInjectionExample {
    private static final Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    public static void main(String[] args) {
        String userInput = "testUser";
        String query = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "pass");
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userInput);
            logger.info("Executing query: " + stmt);
        } catch (SQLException e) {
            logger.severe("SQL error: " + e.getMessage());
        }
    }
}
