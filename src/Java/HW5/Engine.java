package Java.HW5;

public class Engine {
    private Hand hand;
    private boolean isOn = false;

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }
}
