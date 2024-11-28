package Task12;

import java.util.ArrayList;
import java.util.List;

public class MusicContainer implements LibraryComponent{
    private String name;
    private List<LibraryComponent> components = new ArrayList<>();

    public MusicContainer(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Playing: " + name);
        for (LibraryComponent component : components) {
            component.play();
        }
    }

    @Override
    public void add(LibraryComponent component) {
        components.add(component);
    }

    @Override
    public void remove(LibraryComponent component) {
        components.remove(component);
    }

    @Override
    public LibraryComponent getChild(int index) {
        return components.get(index);
    }
}
