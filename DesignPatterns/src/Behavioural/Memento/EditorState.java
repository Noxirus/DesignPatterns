package Behavioural.Memento;

//Also known as a Behavioural.Memento
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
