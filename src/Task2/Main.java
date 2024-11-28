package Task2;

public class Main {
    public static void main(String[] args) {
        PizzaFactory meatPizzaFactory = new MeatPizzaFactory();
        Pizza meatPizza = meatPizzaFactory.createPizza();
        meatPizza.make();
        System.out.println();


        PizzaFactory vegPizzaFactory = new VegetarianPizzaFactory();
        Pizza vegPizza = vegPizzaFactory.createPizza();
        vegPizza.make();
        System.out.println();

        PizzaFactory seaPizzaFactory = new SeafoodPizzaFactory();
        Pizza seaPizza = seaPizzaFactory.createPizza();
        seaPizza.make();
        System.out.println();

    }

}
