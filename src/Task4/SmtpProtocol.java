package Task4;

public class SmtpProtocol implements Protocol{
    @Override
    public void connect() {
        System.out.println("Подключаемся через SMTP...");
    }

    @Override
    public void send(String message) {
        System.out.println("Отправляем данные через SMTP: " + message);
    }

    @Override
    public void disconnect() {
        System.out.println("Отключаемся от SMTP...");
    }
}
