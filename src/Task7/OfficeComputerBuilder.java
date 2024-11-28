package Task7;

public class OfficeComputerBuilder implements ComputerBuilder{
    private final Computer officeComputer;

    public OfficeComputerBuilder() {
        this.officeComputer = new Computer();
    }
    @Override
    public void setProcessor() {
        officeComputer.setProcessor("Intel Core i3");
    }

    @Override
    public void setRam() {
        officeComputer.setRam(8);
    }

    @Override
    public void setHdd() {
        officeComputer.setHdd(500);
    }

    @Override
    public void setGraphicsCard() {
        officeComputer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public Computer getComputer() {
        return officeComputer;
    }
}
