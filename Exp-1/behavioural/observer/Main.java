package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        // Create stocks
        Stock apple = new Stock("AAPL", 150);
        Stock google = new Stock("GOOGL", 2800);
        market.addStock(apple);
        market.addStock(google);

        // Create investors
        Investor alice = new Investor("Alice");
        Investor bob = new Investor("Bob");

        // Register investors
        apple.registerObserver(alice);
        apple.registerObserver(bob);
        google.registerObserver(alice);

        // Update stock prices
        apple.setPrice(155);
        google.setPrice(2825);

        // Unsubscribe an investor
        google.removeObserver(alice);

        // Another update
        google.setPrice(2850);
    }
}

