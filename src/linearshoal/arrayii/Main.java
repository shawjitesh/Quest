package linearshoal.arrayii;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] errorNums = new SetMismatch().findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println(Arrays.toString(errorNums));

        int[] smallerNumbersThanCurrent = new HowManyNumbersAreSmallerThanTheCurrentNumber()
                .smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        System.out.println(Arrays.toString(smallerNumbersThanCurrent));

        List<Integer> disappearedNumbers = new FindAllNumbersDisappearedInAnArray()
                .findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }
}
