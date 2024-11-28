package Task2;

public class MeatPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MeatPizza(createTopping());
    }

    @Override
    public Topping createTopping() {

        return new CheeseTopping();
    }
}
