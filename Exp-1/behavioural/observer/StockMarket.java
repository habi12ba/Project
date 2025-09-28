package behavioural.observer;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
        System.out.println(stock.getSymbol() + " added at price " + stock.getPrice());
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }
}
