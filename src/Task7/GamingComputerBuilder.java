package Task7;

public class GamingComputerBuilder implements ComputerBuilder{
    private final Computer gamingComputer;

    public GamingComputerBuilder() {
        this.gamingComputer = new Computer();
    }
    @Override
    public void setProcessor() {
        gamingComputer.setProcessor("Intel Core i9");

    }

    @Override
    public void setRam() {
        gamingComputer.setRam(32);
    }

    @Override
    public void setHdd() {
        gamingComputer.setHdd(1000);
    }

    @Override
    public void setGraphicsCard() {
        gamingComputer.setGraphicsCard("NVIDIA RTX 3080 Ti");
    }

    @Override
    public Computer getComputer() {
        return gamingComputer;
    }
}
