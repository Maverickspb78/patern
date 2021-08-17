package Java.HW5;

public class Hand implements Control{
    private Key key;
    private Engine engine;

    @Override
    public void turnKey() {
        if (engine.isOn()){
            engine.turnOff();
        } else {
            engine.turnOn();
        }
    }
}
