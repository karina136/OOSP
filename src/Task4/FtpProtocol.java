package Task4;

public class FtpProtocol implements Protocol{
    @Override
    public void connect() {
        System.out.println("Подключаемся через FTP...");
    }

    @Override
    public void send(String message) {
        System.out.println("Отправляем данные через FTP: " + message);
    }

    @Override
    public void disconnect() {
        System.out.println("Отключаемся от FTP...");
    }
}
