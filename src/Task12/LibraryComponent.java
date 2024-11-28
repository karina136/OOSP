package Task12;

public interface LibraryComponent {
    void play();
    void add(LibraryComponent component);
    void remove(LibraryComponent component);
    LibraryComponent getChild(int index);
}
