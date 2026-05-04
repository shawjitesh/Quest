package linearshoal.arrayi;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int idx = 0, x = 0, y = n;
        while (idx < 2 * n) {
            if (idx % 2 != 0) {
                ans[idx++] = nums[y++];
            } else {
                ans[idx++] = nums[x++];
            }
        }

        return ans;
    }
}
