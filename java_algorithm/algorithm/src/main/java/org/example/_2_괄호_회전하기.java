package org.example;

import java.util.*;

public class _2_괄호_회전하기 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String arr = s.substring(i, s.length()) + s.substring(0, i);

            for (int j = 0; j < s.length(); j++) {
                char input = arr.charAt(j);

                if (input == '(' || input == '{' || input == '[') {
                    stack.push(input);
                    continue;
                }

                if (stack.size() != 0 && input == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                        continue;
                    }
                    break;
                }

                if (stack.size() != 0 && input == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                        continue;
                    }
                    break;
                }

                if (stack.size() != 0 && input == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                        continue;
                    }
                    break;
                }

                stack.push('n');
                break;
            }

            if (stack.empty()) {
                answer++;
            }
        }

        return answer;
    }
}
