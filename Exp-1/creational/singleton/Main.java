package creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Create tasks
        ApplicationTask task1 = new ApplicationTask("Data Import");
        ApplicationTask task2 = new ApplicationTask("Report Generation");

        // Execute tasks
        task1.execute();
        task2.execute();

        // Verify singleton
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        System.out.println("Logger instances are same: " + (log1 == log2));
    }
}
