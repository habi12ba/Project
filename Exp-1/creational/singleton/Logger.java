package creational.singleton;


public class Logger {
    // Single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Open-Closed & Single Responsibility: Only one way to get instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Open-Closed & Single Responsibility: Logging functionality
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
