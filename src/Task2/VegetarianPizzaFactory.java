package Task2;

public class VegetarianPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new VegetarianPizza(createTopping());
    }

    @Override
    public Topping createTopping() {
        return new CherryTopping();
    }
}
