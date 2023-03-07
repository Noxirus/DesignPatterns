package Structural.Bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.printf("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.printf("Sony: Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.printf("Sony: Set Channel: " + number);
    }
}
