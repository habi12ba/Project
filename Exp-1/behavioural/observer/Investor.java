package behavioural.observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Notification to " + name + ": " + stockSymbol + " price updated to " + price);
    }
}
