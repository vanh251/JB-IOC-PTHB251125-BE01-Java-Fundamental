package session11.bai_2;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    protected void pay() {
        printAmount();
        System.out.println("Paid in cash.");
    }
}
