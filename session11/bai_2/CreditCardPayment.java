package session11.bai_2;

public class CreditCardPayment extends Payment implements Refundable{

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    protected void pay() {
        printAmount();
        System.out.println("Paid with credit card.");
    }

    @Override
    public void refund() {
        System.out.println("Refunded to credit card.");
    }
}
