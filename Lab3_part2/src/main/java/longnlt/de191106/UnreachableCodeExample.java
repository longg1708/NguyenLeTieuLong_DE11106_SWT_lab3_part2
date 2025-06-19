package longnlt.de191106;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    private static final Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());

    public static int getNumber() {
        int result = 42;
        logger.info("Returning number: " + result);
        return result;
    }

    public static void main(String[] args) {
        logger.info("Result: " + getNumber());
    }
}
