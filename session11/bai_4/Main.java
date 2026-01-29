package session11.bai_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();
        devices.add(new Television(1, "Samsung TV"));
        devices.add(new SmartPhone(2, "iPhone"));
        devices.add(new Laptop(3, "Dell Laptop"));

        for (Device d : devices) {
            d.turnOn();
            if (d instanceof Chargeable) {
                ((Chargeable) d).charge();
            }
            if (d instanceof Connectable) {
                ((Connectable) d).connectWifi();
            }
            d.turnOff();
            System.out.println();
        }
    }
}
