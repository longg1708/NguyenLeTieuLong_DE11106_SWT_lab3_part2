package longnlt.de191106;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        String s = null;
        try {
            if (s != null) {
                logger.info("String length: " + s.length());
            } else {
                logger.warning("String is null");
            }
        } catch (NullPointerException e) {
            logger.severe("Null pointer error: " + e.getMessage());
        }
    }
}
