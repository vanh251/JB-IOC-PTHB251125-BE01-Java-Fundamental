package session14.bai_2;

public class Account {
    private double initialBalance;
    private double minimumBalance;

    public Account() {
    }

    public Account(double initialBalance, double minimumBalance) {
        this.initialBalance = initialBalance;
        this.minimumBalance = minimumBalance;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
