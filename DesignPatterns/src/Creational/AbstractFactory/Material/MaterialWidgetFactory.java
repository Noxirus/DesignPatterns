package Creational.AbstractFactory.Material;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.TextBox;
import Creational.AbstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
