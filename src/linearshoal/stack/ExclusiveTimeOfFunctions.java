package linearshoal.stack;

import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] exclusiveTimes = new int[n];
        Stack<Integer> functionStack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            // parse the log
            String[] parts = log.split(":");
            int funcId   = Integer.parseInt(parts[0]);
            String type  = parts[1];
            int currTime = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                // pause current top function — add time it ran so far
                if (!functionStack.isEmpty()) {
                    exclusiveTimes[functionStack.peek()] += currTime - prevTime;
                }
                functionStack.push(funcId);
                prevTime = currTime;
            } else { // end
                // finish current function — +1 because end timestamp is inclusive
                exclusiveTimes[functionStack.pop()] += currTime - prevTime + 1;
                prevTime = currTime + 1; // next function resumes at currTime+1
            }
        }

        return exclusiveTimes;
    }
}
