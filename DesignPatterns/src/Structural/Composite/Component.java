package Structural.Composite;

public interface Component {
    void render();
    void move();
}

//There are times when we want to have similar functionality on different objects
// In this case we can have groups and shapes behaving in the same way
// (We move shapes and we can move groups by calling the same function
// Groups composed of leaves can behave in a similar manner and has the same implimentation