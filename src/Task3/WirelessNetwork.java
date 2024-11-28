package Task3;

import java.util.List;

abstract class WirelessNetwork {
    protected INetwork network;
    public WirelessNetwork(INetwork network){
        this.network = network;
    }

    public void connect() {
        network.connect();
    }
    public void disconnect(){
        network.disconnect();
    }
    public void scan(){
        List<String> availableNetworks = network.scan();
        System.out.println("Доступные сети:");
        for (String networkName : availableNetworks) {
            System.out.println(" - " + networkName);
        }
    }


}
