package heap;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int lastStoneWeight = new LastStoneWeight().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println(lastStoneWeight);

        List<List<Integer>> kSmallestSums = new FindKPairsWithSmallestSums().kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2);
        System.out.println(kSmallestSums);

        boolean possible = new ConstructTargetArrayWithMultipleSums().isPossible(new int[]{9, 3, 5});
        System.out.println(possible);
    }
}
