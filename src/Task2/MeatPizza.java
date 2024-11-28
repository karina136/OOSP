package Task2;

public class MeatPizza implements Pizza{
    private Topping topping;

    public MeatPizza(Topping topping){
        this.topping = topping;
    }
    @Override
    public void make() {
        System.out.println("Заказ: мясная пицца. " + topping.add());

    }
}
