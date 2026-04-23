package monotonicstack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] finalPrices = new FinalPricesWithASpecialDiscountInAShop().finalPrices(new int[]{8, 4, 6, 2, 3});
        System.out.println(Arrays.toString(finalPrices));

        int[] waitingDays = new DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(waitingDays));

        int area = new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        System.out.println(area);
    }
}
