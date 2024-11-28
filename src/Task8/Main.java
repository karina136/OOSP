package Task8;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Снимок — это поведенческий паттерн проектирования");
        editor.addOpenFile("file1.txt");
        editor.setWindowLayout("Layout1");
        System.out.println("Начальное состояние:");
        editor.printState(editor);

        caretaker.save(editor);

        System.out.println("\nИзменения:");
        editor.setText("Снимок — это поведенческий паттерн проектирования, " +
                "который позволяет сохранять и восстанавливать прошлые " +
                "состояния объектов, не раскрывая подробностей их реализации.");
        editor.addOpenFile("file2.txt");
        editor.setWindowLayout("Layout2");
        editor.printState(editor);

        caretaker.undo(editor);

        System.out.println("\nПредыдущее состояние:");
        editor.printState(editor);
    }
}
