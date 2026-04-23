package arrayii;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) { // optimized

        // Pass 1: mark visited indices as negative
        for (int num : nums) {
            int idx = Math.abs(num) - 1; // abs() because num might already be negative
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        // Pass 2: positive index → that number was never visited
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) { // brute - TLE
//        List<Integer> inputList = Arrays.stream(nums).boxed().toList();
//        return IntStream.rangeClosed(1, nums.length).filter(num -> !inputList.contains(num)).boxed().toList();
//    }
}
