package session08.bai_3;

public class main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.000043);
        double usd = CurrencyConverter.toUSD(1000000);
        System.out.println("1000000 VND = " + usd + " USD");
    }
}
