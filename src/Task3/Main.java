package Task3;

public class Main {
    public static void main(String[] args) {
        WirelessNetwork wifi = new WifiController();
        wifi.scan();
        wifi.connect();
        wifi.disconnect();
        System.out.println();

        WirelessNetwork bluetooth = new BluetoothController();
        bluetooth.scan();
        bluetooth.connect();
        bluetooth.disconnect();
        System.out.println();

        WirelessNetwork zigbee = new ZigbeeController();
        zigbee.scan();
        zigbee.connect();
        zigbee.disconnect();
    }
}
