package linearshoal.monotonicstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftSmaller  = new int[n]; // index of first smaller bar to the left
        int[] rightSmaller = new int[n]; // index of first smaller bar to the right
        Deque<Integer> stack = new ArrayDeque<>();

        // --- Pass 1: Previous Smaller Element (left boundary) ---
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            leftSmaller[i] = stack.isEmpty() ? -1 : stack.peek(); // -1 = no smaller bar exists
            stack.push(i);
        }

        stack.clear();

        // --- Pass 2: Next Smaller Element (right boundary) ---
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            rightSmaller[i] = stack.isEmpty() ? n : stack.peek(); // n = no smaller bar exists
            stack.push(i);
        }

        // --- Compute max area ---
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rightSmaller[i] - leftSmaller[i] - 1;
            int area  = heights[i] * width;
            maxArea   = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
