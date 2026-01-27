package session10.bai_3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        double basePrice = 1000.0;
        double tax = 10.0; // 10%
        double discount = 5.0; // 5%

        double price1 = computer.calculatePrice(basePrice);
        double price2 = computer.calculatePrice(basePrice, tax);
        double price3 = computer.calculatePrice(basePrice, tax, discount);

        System.out.println("Usign basePrice only:\n" + price1);
        System.out.println("Using basePrice + tax:\n" + price2);
        System.out.println("Using basePRice + tax + discount:\n" + price3);
    }
}
