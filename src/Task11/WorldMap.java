package Task11;

public class WorldMap implements Prototype{
    private int width;
    private int height;
    private String terrainType;

    public WorldMap(int width, int height, String terrainType) {
        this.width = width;
        this.height = height;
        this.terrainType = terrainType;
    }

    public WorldMap(WorldMap source) {
        this.width = source.width;
        this.height = source.height;
        this.terrainType = source.terrainType;
    }

    @Override
    public Prototype clone() {
        return new WorldMap(this);
    }

    @Override
    public String toString() {
        return "WorldMap{" +
                "width=" + width +
                ", height=" + height +
                ", terrainType='" + terrainType + '\'' +
                '}';
    }
}
