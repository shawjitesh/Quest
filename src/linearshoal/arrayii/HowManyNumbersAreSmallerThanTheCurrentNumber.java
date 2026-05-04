package linearshoal.arrayii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) { // optimized

        int n = nums.length;
        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(sorted[i], i); // value → first index in sorted array
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }

//    public int[] smallerNumbersThanCurrent(int[] nums) { // brute
//
//        int n = nums.length;
//        int[] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (j != i) {
//                    if (nums[j] < nums[i]) {
//                        count++;
//                    }
//                }
//            }
//            ans[i] = count;
//        }
//
//        return ans;
//    }
}
