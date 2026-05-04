package linearshoal.stack;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) { // optimized
        List<String> operations = new ArrayList<>();
        int idx = 0; // pointer into target array

        for (int num = 1; num <= n && idx < target.length; num++) {
            operations.add("Push");
            if (target[idx] == num) {
                idx++; // matched, move to next target element
            } else {
                operations.add("Pop"); // not in target, pop it
            }
        }

        return operations;
    }

//    public List<String> buildArray(int[] target, int n) { // brute
//
//        if (target.length == 0) return new ArrayList<>();
//
//        String targetString = Arrays.toString(target)
//                .replace("[", "")
//                .replace("]", "");
//        int num = 1, idx = 0;
//        Stack<Integer> targetStack = new Stack<>();
//        targetStack.push(num++);
//        Stack<String> operationsStack = new Stack<>();
//        operationsStack.push("Push");
//
//        while (!targetString.equals(targetStack.toString()
//                .replace("[", "").replace("]", "")) && num <= n) {
//            if (idx < target.length && target[idx] != targetStack.peek()) {
//                targetStack.pop();
//                operationsStack.push("Pop");
//            } else idx++;
//            targetStack.push(num++);
//            operationsStack.push("Push");
//        }
//
//        return operationsStack.stream().toList();
//    }
}
