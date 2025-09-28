package behavioural.strategy;
public class DefaultRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination) {
        return "Taking the DEFAULT (fastest) route from " + start + " to " + destination;
    }
}
