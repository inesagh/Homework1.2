package currencyconversions;

/*
Design classes for currencies - Dram, Ruble, Dollar
Design a class named CurrencyConverter which has methods names “convert” for each pair of currency
convert(Dram from, Ruble to)
convert(Dram from, Dollar to)
convert(Dollar from, Ruble to)
convert(Dollar from, Dram to)
convert(Ruble from, Dram to)
convert(Ruble from, Dollar to)
 */

public class CurrencyConverter {
    public void convert(Ruble from, Dram to){
        System.out.println(from.getAmount() * 7.18);
    }
    public void convert(Dram from, Ruble to){
        System.out.println(from.getAmount() * 0.14);
    }
    public void convert(Dram from, Dollar to){
        System.out.println(from.getAmount() * 0.0019);
    }
    public void convert(Dollar from, Ruble to){
        System.out.println(from.getAmount() * 73.32);
    }
    public void convert(Dollar from, Dram to){
        System.out.println(from.getAmount() * 526.63);
    }
    public void convert(Ruble from, Dollar to){
        System.out.println(from.getAmount() * 0.014);
    }
}
