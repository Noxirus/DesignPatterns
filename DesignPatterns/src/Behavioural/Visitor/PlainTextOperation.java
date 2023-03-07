package Behavioural.Visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Text Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Text Anchor");
    }
}
