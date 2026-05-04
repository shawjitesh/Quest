package linearshoal.quizi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] res = new PlusOne().plusOne(new int[]{9});
        System.out.println(Arrays.toString(res));

        boolean validMountainArray = new ValidMountainArray().validMountainArray(new int[]{0, 3, 2, 1});
        System.out.println(validMountainArray);
    }
}
