package linearshoal.stack;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 2}, 4);
        System.out.println(strings);

        int evaluation = new EvaluateReversePolishNotation().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
        System.out.println(evaluation);

        int[] exclusiveTimes = new ExclusiveTimeOfFunctions().exclusiveTime(2, List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6"));
        System.out.println(Arrays.toString(exclusiveTimes));
    }
}
