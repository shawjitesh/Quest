package linearshoal.monotonicstack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) { // optimized with monotonic linearshoal.stack
        int temperaturesLength = temperatures.length;
        int[] result = new int[temperaturesLength];

        Stack<Integer> stack = new Stack<>();
        for (int currentDay = 0; currentDay < temperaturesLength; currentDay++) {
            int currentTemperature = temperatures[currentDay];
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemperature) {
                int previousDay = stack.pop();
                result[previousDay] = currentDay - previousDay;
            }
            stack.push(currentDay);
        }

        return result;
    }

//    public int[] dailyTemperatures(int[] temperatures) { // brute without monotonic linearshoal.stack
//        int temperaturesLength = temperatures.length;
//        int[] result = new int[temperaturesLength];
//        int left = 0, right = 1, index = 0;
//
//        while (left < temperaturesLength) {
//            while (right < temperaturesLength && temperatures[right] <= temperatures[left]) {
//                right++;
//            }
//            result[index++] = right < temperaturesLength ? right - left : 0;
//            left++;
//            right = left + 1;
//        }
//
//        return result;
//    }
}
