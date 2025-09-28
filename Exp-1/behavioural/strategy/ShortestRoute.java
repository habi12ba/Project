package behavioural.strategy;
public class ShortestRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination) {
        return "Taking the SHORTEST route from " + start + " to " + destination;
    }
}
