package arrayi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] concatenation = new ConcatenationOfArray().getConcatenation(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(concatenation));

        int[] shuffle = new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println(Arrays.toString(shuffle));

        int maxConsecutiveOnes = new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println(maxConsecutiveOnes);
    }
}
