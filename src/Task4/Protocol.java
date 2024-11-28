package Task4;

public interface Protocol {
    void connect();
    void send(String message);
    void disconnect();
}
