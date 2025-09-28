package behavioural.strategy;
public class FastestRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination) {      
        return "Taking the FASTEST route from " + start + " to " + destination;
    }
}
