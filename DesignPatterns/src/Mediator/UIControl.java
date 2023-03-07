package Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler event){
        eventHandlers.add(event);
    }

    protected void notifyEventHandlers(){
        for(var eventHandle : eventHandlers){
            eventHandle.handle();
        }
    }
}
