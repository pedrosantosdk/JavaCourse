package com.javacourse.lesson17;

public class DollarTree {
    public static void main(String[] args) {
        double priceOfProduct;

        System.out.println("Dollar Tree - Price list:");
        for(int i = 1; i <= 50; i++){
            priceOfProduct = 1.99 * i;
            System.out.printf("%d - $ %.2f\n", i, priceOfProduct);
        }
    }
}
