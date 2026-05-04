package linearshoal.arrayi;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2 * size];

        int idx = 0;
        for (int number : nums) {
            ans[idx] = number;
            ans[idx + size] = number;
            idx++;
        }

        return ans;
    }
}
