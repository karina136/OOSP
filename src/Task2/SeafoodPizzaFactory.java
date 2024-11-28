package Task2;

public class SeafoodPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new SeafoodPizza(createTopping());
    }

    @Override
    public Topping createTopping() {
        return new ShrimpTopping();
    }
}
