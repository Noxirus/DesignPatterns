package Structural.Composite;

public class Shape implements Component{
    @Override
    public void render(){
        System.out.println("Render shape");
    }

    @Override
    public void move() {
        System.out.println("Move Shape");
    }
}
