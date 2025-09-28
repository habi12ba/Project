import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BeverageFactory {
    public abstract Beverage createBeverage();

    // Registry to dynamically store factories
    private static final Map<String, BeverageFactory> registry = new LinkedHashMap<>();

    public static void registerFactory(String key, BeverageFactory factory) {
        registry.put(key, factory);
    }

    public static void serveAllBeverages() {
        for (Map.Entry<String, BeverageFactory> entry : registry.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            Beverage beverage = entry.getValue().createBeverage();
            beverage.serve();
        }
    }
}
