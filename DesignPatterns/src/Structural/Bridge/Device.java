package Structural.Bridge;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int number);
}

/*
        var remote = new AdvancedRemoteControl(new SamsungTV());
        remote.turnOn();
        remote.setChannel(5);
 */