package Task11;

public class Main {
    public static void main(String[] args) {
        WorldMapRegistry registry = new WorldMapRegistry();

        registry.addPrototype("forest", new WorldMap(100, 100, "Лес"));
        registry.addPrototype("desert", new WorldMap(200, 150, "Пустыня"));
        registry.addPrototype("mountains", new WorldMap(120, 120, "Горы"));

        WorldMap forestMap = (WorldMap) registry.getClone("forest");
        WorldMap desertMap = (WorldMap) registry.getClone("desert");
        WorldMap customForestMap = (WorldMap) registry.getClone("forest");

        customForestMap = new WorldMap(150, 150, "Лес с озером");

        System.out.println(forestMap);
        System.out.println(desertMap);
        System.out.println(customForestMap);
    }
}
