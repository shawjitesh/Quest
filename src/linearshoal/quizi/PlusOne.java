package linearshoal.quizi;

import java.util.Stack;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int n = digits.length;
        int sum = digits[n - 1] + 1;
        if (sum > 9) {
            stack.push(sum % 10);
            int carry = sum / 10;
            for (int i = n - 2; i >= 0; i--) {
                sum = digits[i] + carry;
                stack.push(sum % 10);
                carry = sum / 10;
            }
            if (carry > 0) {
                stack.push(carry);
            }
        } else {
            digits[n - 1] = sum;
            return digits;
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }

        return res;
    }
}
