package session10.bai_4;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.accelerate(); // Default acceleration
        myCar.accelerate(20); // Accelerate by 20 km/h
        myCar.accelerate(15, 3); // Accelerate by 15 km/h for 3 seconds
    }
}
