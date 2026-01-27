package session10.bai_3;

public class Computer {
    double calculatePrice(double basePrice){
        return basePrice;
    }

    double calculatePrice(double basePrice, double tax){
        return basePrice + (basePrice * tax / 100);
    }

    double calculatePrice(double basePrice, double tax, double discount){
        double priceWithTax = basePrice + (basePrice * tax / 100);
        return priceWithTax - (priceWithTax * discount / 100);
    }
}
