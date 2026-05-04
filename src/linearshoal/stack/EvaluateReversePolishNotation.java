package linearshoal.stack;

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
//        Stack<String> linearshoal.stack = new Stack<>();
//
//        for (String token : tokens) {
//            evaluate(token, linearshoal.stack);
//        }
//
//        if (linearshoal.stack.size() != 1) {
//            String token = linearshoal.stack.pop();
//            evaluate(token, linearshoal.stack);
//        }
//
//        return Integer.parseInt(linearshoal.stack.pop());
//    }
//
//    private void evaluate(String token, Stack<String> linearshoal.stack) {
//        switch (token) {
//            case "+":
//                int b = Integer.parseInt(linearshoal.stack.pop());
//                int a = Integer.parseInt(linearshoal.stack.pop());
//                linearshoal.stack.push(String.valueOf(a + b));
//                break;
//            case  "-":
//                b = Integer.parseInt(linearshoal.stack.pop());
//                a = Integer.parseInt(linearshoal.stack.pop());
//                linearshoal.stack.push(String.valueOf(a - b));
//                break;
//            case  "*":
//                b = Integer.parseInt(linearshoal.stack.pop());
//                a = Integer.parseInt(linearshoal.stack.pop());
//                linearshoal.stack.push(String.valueOf(a * b));
//                break;
//            case  "/":
//                b = Integer.parseInt(linearshoal.stack.pop());
//                a = Integer.parseInt(linearshoal.stack.pop());
//                linearshoal.stack.push(String.valueOf(a / b));
//                break;
//            default:
//                linearshoal.stack.push(token);
//        }
//    }
}
