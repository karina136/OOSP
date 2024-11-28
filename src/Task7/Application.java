package Task7;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        director.constructGamingComputer(gamingComputerBuilder);
        Computer gamingComputer = gamingComputerBuilder.getComputer();
        System.out.println("Игровой компьютер: " + gamingComputer);

        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        director.constructOfficeComputer(officeComputerBuilder);
        Computer officeComputer = officeComputerBuilder.getComputer();
        System.out.println("Офисный компьютер: " + officeComputer);

    }
}
