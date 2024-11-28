package Task8;

import java.util.ArrayList;
import java.util.List;
import Task8.TextEditor;

public class Memento {
    private final String text;
    private final List<String> openFiles;
    private final String windowLayout;

    public Memento(String text, List<String> openFiles, String windowLayout) {
        this.text = text;
        this.openFiles = new ArrayList<>(openFiles);
        this.windowLayout = windowLayout;
    }
    public String getText() {
        return text;
    }

    public List<String> getOpenFiles() {
        return new ArrayList<>(openFiles);
    }
    public String getWindowLayout() {
        return windowLayout;
    }

}
