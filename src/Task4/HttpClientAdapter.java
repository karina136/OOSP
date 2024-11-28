package Task4;

public class HttpClientAdapter implements Protocol{
    private HttpProtocol httpProtocol;

    public HttpClientAdapter(){
        this.httpProtocol = new HttpProtocol();
    }
    @Override
    public void connect() {
        httpProtocol.connect();
    }

    @Override
    public void send(String message) {
        httpProtocol.send(message);
    }

    @Override
    public void disconnect() {
        httpProtocol.disconnect();
    }
}
