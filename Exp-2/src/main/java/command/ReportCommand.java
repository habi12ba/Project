package command;

import rover.Rover;
import java.util.logging.Logger;

public class ReportCommand implements Command {
    private static final Logger logger = Logger.getLogger(ReportCommand.class.getName());
    private final Rover rover;
    public ReportCommand(Rover rover) { this.rover = rover; }
    @Override public void execute() {
        String report = rover.statusReport();
        logger.fine(report);
        System.out.println(report);
    }
}
