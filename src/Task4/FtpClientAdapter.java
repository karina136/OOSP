package Task4;

public class FtpClientAdapter implements Protocol{
    private FtpProtocol ftpProtocol;

    public FtpClientAdapter(){
        this.ftpProtocol = new FtpProtocol();
    }
    @Override
    public void connect() {
        ftpProtocol.connect();
    }

    @Override
    public void send(String message) {
        ftpProtocol.send(message);
    }

    @Override
    public void disconnect() {
        ftpProtocol.disconnect();
    }
}
