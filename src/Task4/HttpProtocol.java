package Task4;

public class HttpProtocol implements Protocol{
    @Override
    public void connect() {
        System.out.println("Подключаемся через HTTP...");
    }

    @Override
    public void send(String message) {
        System.out.println("Отправляем данные через HTTP: " + message);
    }

    @Override
    public void disconnect() {
        System.out.println("Отключаемся от HTTP...");
    }
}
