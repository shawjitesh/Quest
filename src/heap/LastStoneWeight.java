package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) pq.offer(stone);

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first == second) continue;
            pq.offer(Math.max(first, second) - Math.min(first, second));
        }

        if (pq.isEmpty()) return 0;
        return pq.poll();
    }
}
