package Behavioural.State;

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}

// We could have any numbers of tools, but we dont want to have to handle them all here as that would become unmaintainable
// We can connect the customized tools to a tool interface and use this interface to dictate its own implementation
// Thus we can add any number of tools to this canvas and not need to expand on it