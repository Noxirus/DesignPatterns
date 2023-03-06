package Memento;

public class Document {
    public String content;
    public String fontName;
    public int fontSize;

    public void undo(DocumentState state){
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    public DocumentState createState(){
        return new DocumentState(content, fontName, fontSize);
    }

    @Override
    public String toString(){
        return "Content: " + content + " fontName: " + fontName + " fontSize: " + fontSize;
    }
}
