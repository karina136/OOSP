package Task9;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private static ResourceManager instance;
    private Map<String, String> resources;

    private ResourceManager() {
        resources = new HashMap<>();
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public String loadResource(String name) {
        if (!resources.containsKey(name)) {
            resources.put(name, "Загружен ресурс: " + name);
        }
        return resources.get(name);
    }

    public void printResources() {
        System.out.println("Загруженные ресурсы: " + resources.keySet());
    }
}
