package creational.singleton;


public class ApplicationTask {
    private String taskName;

    public ApplicationTask(String taskName) {
        this.taskName = taskName;
    }

    public void execute() {
        Logger.getInstance().logInfo("Executing task: " + taskName);
    }
}
