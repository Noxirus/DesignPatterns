package Creational.AbstractFactory.app;
import Creational.AbstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
