package session11.bai_2;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    protected abstract void pay();

    protected void printAmount() {
        System.out.println("Amount to be paid: " + amount);
    }
}
