package Creational.AbstractFactory.Ant;

import Creational.AbstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
