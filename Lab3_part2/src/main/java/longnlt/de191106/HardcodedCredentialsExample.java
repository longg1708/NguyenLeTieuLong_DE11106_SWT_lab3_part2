package longnlt.de191106;

import java.util.logging.Logger;

public class HardcodedCredentialsExample {
    private static final Logger logger = Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        String username = "admin";
        String password = System.getenv("APP_PASSWORD"); // Read from environment variable
        if (authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }
    }

    private static boolean authenticate(String user, String pass) {
        String expectedPassword = System.getenv("APP_PASSWORD");
        return user.equals("admin") && pass != null && pass.equals(expectedPassword);
    }
}

