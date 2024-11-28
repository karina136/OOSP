package Task3;

import java.util.Arrays;
import java.util.List;

public class Zigbee implements INetwork {
    @Override
    public void connect() {
        System.out.println("Соединение с сетью Zigbee успешно");

    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Zigbee успешно");
    }

    @Override
    public List<String> scan() {
        System.out.println("Поиск доступных Zigbee сетей...");
        return Arrays.asList("Zigbee_Device_1", "Zigbee_Device_2", "Zigbee_Device_3");
    }
}
