package session12.bai_3;

public class Coffee extends Drink {
    public Coffee(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void prepare() {
        System.out.println("Pha bằng máy");
    }

    @Override
    public void applyDiscount(double percentage) {

    }
}
