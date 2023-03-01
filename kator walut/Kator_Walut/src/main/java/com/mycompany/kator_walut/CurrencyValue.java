package com.mycompany.kator_walut;

public class CurrencyValue {
    public static String PLN = "pln";
    public static String USD = "usd";
    public static String EUR = "eur";
    public static String GBP = "gbp";
    public static String CHF = "chf";
    public static String JPY = "jpy";
    
    private String currencyName = "", currencyShortName;
    private double sell, buy;
    
    public CurrencyValue(String currencyName, String currencyShortName, double sell, double buy) {
        this.currencyName = currencyName;
        this.currencyShortName = currencyShortName;
        this.sell = sell;
        this.buy = buy;
    }
}
