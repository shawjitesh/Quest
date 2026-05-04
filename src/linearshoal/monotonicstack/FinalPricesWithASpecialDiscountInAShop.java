package linearshoal.monotonicstack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) { // optimized with monotonic linearshoal.stack
        int n = prices.length;
        int[] result = Arrays.copyOf(prices, n); // default: no discount → keep original price
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices, increasing order of prices

        for (int i = 0; i < n; i++) {
            // prices[i] is a candidate discount for elements in the linearshoal.stack
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                result[idx] = prices[idx] - prices[i]; // prices[i] is the first smaller/equal → apply discount
            }
            stack.push(i);
        }
        // indices still in linearshoal.stack → no discount found → result already has original price
        return result;
    }

//    public int[] finalPrices(int[] prices) { // brute without monotonic linearshoal.stack
//        int n = prices.length;
//        int[] finalPrices = new int[n];
//
//        for (int i = 0; i < n - 1; i++) {
//            boolean discount = false;
//            for (int j = i + 1; j < n; j++) {
//                if (prices[j] <= prices[i]) {
//                    finalPrices[i] = prices[i] - prices[j];
//                    discount = true;
//                    break;
//                }
//            }
//            if (!discount) {
//                finalPrices[i] = prices[i];
//            }
//        }
//        finalPrices[n -1] = prices[n - 1];
//
//        return  finalPrices;
//    }
}
