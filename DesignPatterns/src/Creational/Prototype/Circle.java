package Creational.Prototype;

public class Circle implements Component{
    private int radius;
    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    @Override
    public Component clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);

        return newCircle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

// With this implementation we can add as many objects as we want
// But objects will be created with the same component logic added to them, but we can add any additional logic beyond that (get radius, etc)
// But they will need to be rendered out the same or cloned