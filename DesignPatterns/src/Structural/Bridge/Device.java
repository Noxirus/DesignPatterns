package Structural.Bridge;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int number);
}

    //There are times when we need a common functionality in an object that can extend to any number of other objects
    //But we want to be able to extend onto BOTH device and control at our own discreation
    // In this case we have a device that can handle basic TV operations
    // The TV's can implement these functions and how they handle them
    // We can then make remote controls that will handle how they communicate with the TV
    // We can add any number of additional TV's and Remote Controls with additional functionality should we need it
    // We have created a single bridge between TV and Remote control

/*
        var remote = new AdvancedRemoteControl(new SamsungTV());
        remote.turnOn();
        remote.setChannel(5);
 */