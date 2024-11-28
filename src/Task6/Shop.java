package Task6;

public class Shop extends CityObject{
    @Override
    protected void draw() {
        System.out.println("Отрисовка магазина с витриной и вывеской.");
    }
    @Override
    protected void hook(){
        System.out.println("Специальные украшения для магазина.");
    }
}
