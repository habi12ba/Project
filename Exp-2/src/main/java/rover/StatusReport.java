package rover;

public class StatusReport {
    private final String payload;
    public StatusReport(String payload) { this.payload = payload; }
    @Override public String toString() { return payload; }
}
