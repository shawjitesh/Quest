package monotonicstack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] finalPrices = new FinalPricesWithASpecialDiscountInAShop().finalPrices(new int[]{8, 4, 6, 2, 3});
        System.out.println(Arrays.toString(finalPrices));
    }
}
