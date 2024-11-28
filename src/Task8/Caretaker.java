package Task8;


import java.util.Stack;
import Task8.Memento;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();
    public void save(TextEditor editor) {
        history.push(editor.createMemento());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restoreFromMemento(history.pop());
        }
    }
}
