package Creational.AbstractFactory.Ant;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.TextBox;
import Creational.AbstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
