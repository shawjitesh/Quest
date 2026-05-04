package linearshoal.arrayii;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;

        int actualSum = n * (n + 1) / 2, errorSum = 0;
        for (int number : nums) errorSum += number;

        int duplicateNumber = 0;
        Map<Integer, Long> frequencyMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateNumber = entry.getKey();
                break;
            }
        }

        errorNums[0] = duplicateNumber;
        errorNums[1] = duplicateNumber - (errorSum - actualSum);

        return errorNums;
    }
}
