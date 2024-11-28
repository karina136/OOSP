package Task2;

public class SeafoodPizza implements Pizza{
    private Topping topping;

    public SeafoodPizza(Topping topping){
        this.topping = topping;
    }
    @Override
    public void make() {
        System.out.println("Заказ: Морская пицца. " + topping.add());
    }
}
