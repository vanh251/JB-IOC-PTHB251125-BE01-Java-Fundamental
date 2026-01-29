package session11.bai_2;

public class EWalletPayment extends Payment implements Refundable{
    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    protected void pay() {
        printAmount();
        System.out.println("Paid with e-wallet.");
    }

    @Override
    public void refund() {
        System.out.println("Refunded to e-wallet.");
    }
}
