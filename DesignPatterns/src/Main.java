import Command.Editor.BoldCommand;
import Command.Editor.HTMLDocument;
import Command.Editor.History;
import Command.Editor.UndoCommand;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }

}