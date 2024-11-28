package Task8;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private String text;
    private List<String> openFiles = new ArrayList<>();
    private String windowLayout;


    public void setText(String text){
        this.text = text;
    }
    public void addOpenFile(String fileName) {
        openFiles.add(fileName);
    }
    public void setWindowLayout(String layout) {
        this.windowLayout = layout;
    }
    public Memento createMemento() {
        return new Memento(text, new ArrayList<>(openFiles), windowLayout);
    }

    public void restoreFromMemento(Memento memento) {
        this.text = memento.getText();
        this.openFiles = new ArrayList<>(memento.getOpenFiles());
        this.windowLayout = memento.getWindowLayout();
    }
    public void printState(TextEditor editor){
        System.out.println("Текст: " + editor.text);
        System.out.print("Открытые файлы: ");
        for (String file : editor.openFiles) {
            System.out.print(file + " ");
        }
        System.out.println();
        System.out.println("Окно: " + editor.windowLayout);

    }
}
