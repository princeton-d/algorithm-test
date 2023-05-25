package org.example;

import java.util.Stack;

public class _2_짝지어_제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 == 1) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);

            if (stack.empty() || stack.peek() != input) {
                stack.push(input);
                continue;
            }
            if (stack.peek() == input) {
                stack.pop();
            }
        }
        return stack.empty() ? 1 : 0;
    }
}
