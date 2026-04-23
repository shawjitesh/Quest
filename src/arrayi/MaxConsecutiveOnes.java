package arrayi;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0, maxConsecutiveOnes = 0;
        for (int element : nums) {
            if (element == 1)  consecutiveOnes++;
            else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
                consecutiveOnes = 0;
            }
        }
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);

        return maxConsecutiveOnes;
    }
}
