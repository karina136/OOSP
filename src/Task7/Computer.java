package Task7;

public class Computer {
    private String processor;
    private int ram;
    private int hdd;
    private String graphicsCard;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return  "Процессор = '" + processor + '\'' +
                ", память = " + ram +
                " ГБ, жестий диск = " + hdd +
                " ГБ, графическая карта = '" + graphicsCard + '\'';
    }
}
