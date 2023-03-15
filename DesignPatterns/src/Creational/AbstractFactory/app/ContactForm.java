package Creational.AbstractFactory.app;
import Creational.AbstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createTextBox().render();
        factory.createButton().render();
    }
}

// Sometimes we want to create and render out logic from object, but we don't know how many object we will be needing, we want it to be extensible
// We can create a widget factory class (inherits from the interface) then create the buttons/text box and render it out
// Thus we can create as many widget factory classes as we want, this makes things more extensible
