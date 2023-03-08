package Creational.AbstractFactory.Ant;

import Creational.AbstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant Text Box");
    }
}
