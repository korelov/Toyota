package org.javaacadmey.toyota.shop;

public class Cashier {
    private static double accountIncome;

    public static double getAccountIncome() {
        return accountIncome;
    }

    public static void setAccountIncome(double accountIncome) {
        Cashier.accountIncome += accountIncome;
    }
}
