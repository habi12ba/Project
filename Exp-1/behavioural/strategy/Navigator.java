package behavioural.strategy;
public class Navigator {
    private final String start;
    private final String destination;
    private RouteStrategy strategy;


    public Navigator(String start, String destination, RouteStrategy strategy) {
        this.start = start;
        this.destination = destination;
        this.strategy = strategy;
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate() {

        System.out.println(strategy.buildRoute(start, destination));
    }
}
