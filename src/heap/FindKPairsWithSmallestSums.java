package heap;

import java.util.*;

public class FindKPairsWithSmallestSums {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) { // optimized
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) return result;

        // Min-heap: [sum, i, j] where i = index in nums1, j = index in nums2
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Seed heap with (nums1[i], nums2[0]) for all i in nums1
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int i = curr[1], j = curr[2];

            result.add(Arrays.asList(nums1[i], nums2[j]));

            // Advance j for this i — next candidate from same nums1[i]
            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
        }

        return result;
    }

//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) { // brute - TLE
//        List<List<Integer>> kSmallestSums = new ArrayList<>();
//
//        List<List<Integer>> sums = new ArrayList<>();
//        for (int num1 : nums1) {
//            for (int num2 : nums2) {
//                List<Integer> sum = new ArrayList<>();
//                sum.add(num1);
//                sum.add(num2);
//                sums.add(sum);
//            }
//        }
//
//        while (k-- > 0) {
//            int smallestSum = Integer.MAX_VALUE;
//            int j = -1;
//            for (int i = 0; i < sums.size(); i++) {
//                List<Integer> pair = sums.get(i);
//                if (pair.get(0) + pair.get(1) <= smallestSum) {
//                    smallestSum = pair.get(0) + pair.get(1);
//                    j = i;
//                }
//            }
//            kSmallestSums.add(sums.get(j));
//            sums.remove(j);
//        }
//
//        return kSmallestSums;
//    }
}
