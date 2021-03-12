package currencyconversions;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Dram dram = new Dram();
        dram.setAmount(100);
        Ruble ruble = new Ruble();
        ruble.setAmount(50);
        Dollar dollar = new Dollar();
        dollar.setAmount(10);
        currencyConverter.convert(ruble, dram);
        currencyConverter.convert(dollar, dram);
        currencyConverter.convert(ruble, dollar);
        currencyConverter.convert(dram, dollar);
        currencyConverter.convert(dram, ruble);
        currencyConverter.convert(dollar, ruble);

    }
}
