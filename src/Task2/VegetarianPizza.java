package Task2;

public class VegetarianPizza implements Pizza{
    private Topping topping;

    public VegetarianPizza(Topping topping){
        this.topping = topping;
    }
    @Override
    public void make() {
        System.out.println("Заказ: вегетерианская пицца. " + topping.add());

    }
}
