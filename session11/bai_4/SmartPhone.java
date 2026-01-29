package session11.bai_4;

public class SmartPhone extends Device implements Chargeable, Connectable{
    public SmartPhone(int id, String name) {
        super(id, name);
    }

    @Override
    public void charge() {
        System.out.println("Charging smartphone " + name);
    }

    @Override
    public void connectWifi() {
        System.out.println("Connecting smartphone " + name + " to WiFi");
    }

    @Override
    protected void turnOn() {
        System.out.println("Turning on smartphone " + name);
    }

    @Override
    protected void turnOff() {
        System.out.println("Turning off smartphone " + name);
    }
}
