package Behavioural.Visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }

    public void execute(Operation operation){
        for(var node : nodes){
            node.execute(operation);
        }
    }
}
// The document may not always want to know what logic we are adding to it
// With this we can create an HTML document and then execute operations on it without the document needing to know what the operation is
// This way we can keep the document separated from the operations being run on it
// Document does not need to change
// Operations are "visiting" the document

        /*
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
         */