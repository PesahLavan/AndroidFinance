package com.pesahlavan.androidfinance.core.start;

import com.pesahlavan.androidfinance.core.exceptions.CurrencyException;
import com.pesahlavan.androidfinance.core.impls.DefaultStorage;

import java.math.BigDecimal;
import java.util.Currency;



public class Start {

    public static void main(String[] args) {
        try {

            DefaultStorage storage = new DefaultStorage();

            Currency currencyUSD = Currency.getInstance("USD");
            Currency currencyRUB = Currency.getInstance("RUB");

            storage.addCurrency(currencyUSD);
            storage.addCurrency(currencyRUB);
            storage.addAmount(new BigDecimal(200), currencyUSD);

            //storage.expenseAmount(new BigDecimal(250), currencyUSD);

            System.out.println("storage = " + storage.getAvailableCurrencies());


        } catch (CurrencyException e) {
            e.printStackTrace();
        }


    }

}
