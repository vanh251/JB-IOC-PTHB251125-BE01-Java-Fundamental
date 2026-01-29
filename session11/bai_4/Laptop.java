package session11.bai_4;

public class Laptop extends Device implements Chargeable, Connectable{
    public Laptop(int id, String name) {
        super(id, name);
    }

    @Override
    public void charge() {
        System.out.println("Charging laptop " + name);
    }

    @Override
    public void connectWifi() {
        System.out.println("Connecting laptop " + name + " to WiFi");
    }

    @Override
    protected void turnOn() {
        System.out.println("Turning on laptop " + name);
    }

    @Override
    protected void turnOff() {
        System.out.println("Turning off laptop " + name);
    }
}
