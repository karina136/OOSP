package Task4;

public class SmtpClientAdapter implements Protocol{
    private SmtpProtocol smtpProtocol;
    public SmtpClientAdapter(){
        this.smtpProtocol = new SmtpProtocol();
    }
    @Override
    public void connect() {
        smtpProtocol.connect();
    }

    @Override
    public void send(String message) {
        smtpProtocol.send(message);
    }

    @Override
    public void disconnect() {
        smtpProtocol.disconnect();
    }
}
