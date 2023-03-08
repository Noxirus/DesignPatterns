package Creational.AbstractFactory.Material;

import Creational.AbstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
