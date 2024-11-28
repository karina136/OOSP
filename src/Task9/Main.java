package Task9;

public class Main {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.getInstance();

        System.out.println(manager.loadResource("image.png"));
        System.out.println(manager.loadResource("font.ttf"));
        System.out.println(manager.loadResource("sound.wav"));

        System.out.println(manager.loadResource("image.png"));

        manager.printResources();
    }
}
