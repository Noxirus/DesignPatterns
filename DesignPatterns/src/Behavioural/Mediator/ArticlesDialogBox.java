package Behavioural.Mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox(){
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    //The interface has one function, so we can declare a brand new class that inherits this interface, but instead of calling a new class etc/
    //We can just pass in a single function reference as a simplified version of this interface that will call this function
    //Now we we update content (or whatever we want to do), (Set selection below) it will notify the other event handlers to trigger the above functions
    //Example further, if we update the articles list box, it has a reference to the function in this class called articleSelected, updating the list box will call that function here
    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Textbox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
