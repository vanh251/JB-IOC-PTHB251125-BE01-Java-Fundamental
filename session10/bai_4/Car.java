package session10.bai_4;

public class Car {
    private int currentSpeed = 0;

    public void accelerate(){
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +" + currentSpeed + " km/h");
    }

    public void accelerate(int speed){
        currentSpeed += speed;
        System.out.println("Car accelerates by: +" + speed + " km/h, Current speed: " + currentSpeed + " km/h");
    }

    public void accelerate(int speed, int seconds){
        currentSpeed += speed * seconds;
        System.out.println("Car accelerates by: +" + (speed * seconds) + " km/h over " + seconds + " seconds, Current speed: " + currentSpeed + " km/h");
    }
}
