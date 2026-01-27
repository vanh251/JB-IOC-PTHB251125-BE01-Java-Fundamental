package session08.bai_3;

class CurrencyConverter{
    private static double rate;

    public CurrencyConverter(double rate) {
        CurrencyConverter.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    static void setRate(double rate) {
        CurrencyConverter.rate = rate;
    }

    static double toUSD(double vnd){
        return vnd * rate;
    }
}
