package session11.bai_4;

public class Television extends Device implements Connectable, Chargeable {

    public Television(int id, String name) {
        super(id, name);
    }

    @Override
    public void charge() {
        System.out.println("Charging television " + name);
    }

    @Override
    public void connectWifi() {
        System.out.println("Connecting television " + name + " to WiFi");
    }

    @Override
    protected void turnOn() {
        System.out.println("Turning on television " + name);
    }

    @Override
    protected void turnOff() {
        System.out.println("Turning off television " + name);
    }
}
