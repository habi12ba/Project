package behavioural.strategy;
public class ScenicRoute implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination) {
        return "Taking the SCENIC route from " + start + " to " + destination;
    }
}
