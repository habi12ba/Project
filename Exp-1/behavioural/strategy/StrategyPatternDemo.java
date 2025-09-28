package behavioural.strategy;
public class StrategyPatternDemo {
    public static void main(String[] args) {
       
        Navigator navigator = new Navigator("Home", "Office", new DefaultRoute());

        // Fastest route
        navigator.setRouteStrategy(new FastestRoute());
        navigator.navigate();

        // Shortest route
        navigator.setRouteStrategy(new ShortestRoute());
        navigator.navigate();

        // Scenic route
        navigator.setRouteStrategy(new ScenicRoute());
        navigator.navigate();
    }
}
