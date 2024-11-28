package Task3;

import java.util.Arrays;
import java.util.List;

public class Bluetooth implements INetwork {
    @Override
    public void connect() {
        System.out.println("Соединение с сетью Bluetooth успешно");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от сети Bluetooth успешно");

    }

    @Override
    public List<String> scan() {
        System.out.println("Поиск доступных Bluetooth устройств...");
        return Arrays.asList("Bluetooth_Device_1", "Bluetooth_Device_2");
    }
}
