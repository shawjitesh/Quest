package sequencevalley.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConstructTargetArrayWithMultipleSums {

    public boolean isPossible(int[] target) { // optimized
        // Max-sequencevalley.heap
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long totalSum = 0;

        for (int num : target) {
            maxHeap.offer((long) num);
            totalSum += num;
        }

        while (maxHeap.peek() != 1) {
            long maxVal = maxHeap.poll();
            long rest = totalSum - maxVal;   // sum of everything except max

            // Base case: single element array — must trace back to 1
            if (rest == 1) return true;

            // rest == 0 means multiple elements all summed to 0 — impossible
            // maxVal <= rest means max wasn't built from rest (already ≤ others)
            if (rest == 0 || maxVal <= rest) return false;

            // How many steps to reduce maxVal below rest in one shot (avoid TLE)
            // maxVal - k*rest must be in range [1, rest]
            long steps = (maxVal - 1) / rest;   // reduces maxVal to ((maxVal-1) % rest) + 1
            long prevVal = maxVal - steps * rest;

            if (prevVal <= 0) return false;

            totalSum = totalSum - maxVal + prevVal;
            maxHeap.offer(prevVal);
        }

        return true;
    }
}
