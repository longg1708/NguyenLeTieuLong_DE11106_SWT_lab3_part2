package longnlt.de191106;

import java.io.*;
import java.util.logging.Logger;

public class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());
    private static final String BASE_DIR = "safe_directory/";

    public static void main(String[] args) {
        String userInput = "input.txt"; // Example sanitized input
        File file = new File(BASE_DIR + sanitizePath(userInput));
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                logger.info("Reading file: " + file.getPath());
            } catch (IOException e) {
                logger.severe("Error reading file: " + e.getMessage());
            }
        }
    }

    private static String sanitizePath(String input) {
        // Remove dangerous characters and prevent directory traversal
        return input.replaceAll("[.\\\\/:*?\"<>|]", "");
    }
}
