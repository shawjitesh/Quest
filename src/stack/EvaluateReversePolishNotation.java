package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) { // optimized
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "-" -> { int b = stack.pop(); stack.push(stack.pop() - b); }
                case "/" -> { int b = stack.pop(); stack.push(stack.pop() / b); }
                default  -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

//    public int evalRPN(String[] tokens) { // brute
//        Stack<String> stack = new Stack<>();
//
//        for (String token : tokens) {
//            evaluate(token, stack);
//        }
//
//        if (stack.size() != 1) {
//            String token = stack.pop();
//            evaluate(token, stack);
//        }
//
//        return Integer.parseInt(stack.pop());
//    }
//
//    private void evaluate(String token, Stack<String> stack) {
//        switch (token) {
//            case "+":
//                int b = Integer.parseInt(stack.pop());
//                int a = Integer.parseInt(stack.pop());
//                stack.push(String.valueOf(a + b));
//                break;
//            case  "-":
//                b = Integer.parseInt(stack.pop());
//                a = Integer.parseInt(stack.pop());
//                stack.push(String.valueOf(a - b));
//                break;
//            case  "*":
//                b = Integer.parseInt(stack.pop());
//                a = Integer.parseInt(stack.pop());
//                stack.push(String.valueOf(a * b));
//                break;
//            case  "/":
//                b = Integer.parseInt(stack.pop());
//                a = Integer.parseInt(stack.pop());
//                stack.push(String.valueOf(a / b));
//                break;
//            default:
//                stack.push(token);
//        }
//    }
}
