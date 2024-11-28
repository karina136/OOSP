package Task6;

public class CitySimulator {
    public static void main(String[] args) {
        CityObject house = new House();
        CityObject road = new Road();
        CityObject shop = new Shop();

        house.render();
        road.render();
        shop.render();
    }
}
