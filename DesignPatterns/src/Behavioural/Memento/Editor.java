package Behavioural.Memento;

//Also known as the Originator
public class Editor {
    private String content;
    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

//The originator creates state versions of itself as memento's, it then passes these memento's to the history as a stack
//This way at any time we can "undo" states, or revert back to a state in the past