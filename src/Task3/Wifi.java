package Task3;

import java.util.Arrays;
import java.util.List;

public class Wifi implements INetwork {
    @Override
    public void connect() {
        System.out.println("Соединение с сетью Wifi успешно");

    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Wifi успешно");

    }

    @Override
    public List<String> scan() {
        System.out.println("Поиск доступных Wi-Fi сетей...");
        return Arrays.asList("WiFi_1", "WiFi_2", "WiFi_3");
    }
}
