import Iterator.BrowseHistory;
import Iterator.Iterator;
import State.BrushTool;
import State.Canvas;
import State.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while(iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }

}