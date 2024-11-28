package Task12;

public class Track implements LibraryComponent{
    private String name;

    public Track(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Playing track: " + name);
    }

    @Override
    public void add(LibraryComponent component) {
        throw new UnsupportedOperationException("Cannot add components to a track.");
    }

    @Override
    public void remove(LibraryComponent component) {
        throw new UnsupportedOperationException("Cannot remove components from a track.");
    }

    @Override
    public LibraryComponent getChild(int index) {
        throw new UnsupportedOperationException("Track does not have children.");
    }
}
