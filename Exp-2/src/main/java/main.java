package main;
import command.*;
import grid.*;
import direction.*;
import rover.Rover;
import java.util.*;
import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        setupLogger();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter grid width: ");
            int width = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter grid height: ");
            int height = Integer.parseInt(sc.nextLine().trim());
            Grid grid = new Grid();
            grid.add(new Cell(width, height));

            System.out.print("Enter number of obstacles: ");
            int obsCount = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < obsCount; i++) {
                System.out.print("Obstacle " + (i + 1) + " (x y): ");
                String[] parts = sc.nextLine().trim().split("\\s+");
                int ox = Integer.parseInt(parts[0]);
                int oy = Integer.parseInt(parts[1]);
                grid.add(new Obstacle(ox, oy));
            }

            System.out.print("Enter starting position (x y direction[N/S/E/W]): ");
            String[] start = sc.nextLine().trim().split("\\s+");
            int startX = Integer.parseInt(start[0]);
            int startY = Integer.parseInt(start[1]);
            String dirToken = start[2].toUpperCase(Locale.ROOT);
            Direction direction = switch (dirToken) {
                case "N" -> new North();
                case "S" -> new South();
                case "E" -> new East();
                case "W" -> new West();
                default -> new North();
            };

            Rover rover = new Rover(startX, startY, direction, grid);

            System.out.print("Enter command sequence (M/L/R/P for report): ");
            String commands = sc.nextLine().trim().toUpperCase(Locale.ROOT);

            Map<Character, Command> commandMap = new HashMap<>();
            commandMap.put('M', new MoveCommand(rover));
            commandMap.put('L', new LeftCommand(rover));
            commandMap.put('R', new RightCommand(rover));
            commandMap.put('P', new ReportCommand(rover));

            for (char c : commands.toCharArray()) {
                Optional.ofNullable(commandMap.get(c)).ifPresent(Command::execute);
            }

            System.out.println("=== Final Status ===");
            System.out.println(rover.statusReport());

        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Unhandled exception: ", ex);
        }
    }

    private static void setupLogger() {
        Logger root = Logger.getLogger("");
        for (Handler h : root.getHandlers()) root.removeHandler(h);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        ch.setFormatter(new SimpleFormatter());
        root.addHandler(ch);
        root.setLevel(Level.ALL);
    }
}
