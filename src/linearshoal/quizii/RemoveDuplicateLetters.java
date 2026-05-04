package linearshoal.quizii;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];        // last occurrence of each char
        boolean[] inStack = new boolean[26];  // whether char is already in result
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++)
            lastIndex[s.charAt(i) - 'a'] = i;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (inStack[c - 'a']) continue;  // already included, skip

            // Pop if: top is greater than c AND top appears later in string
            while (!stack.isEmpty()
                    && stack.peek() > c
                    && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        // Stack is LIFO — build string in reverse
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.reverse().toString();
    }
}
