package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        char[] arr = new char[]{'(', '(', '}'};

    }

    public static int solution(String s) {
        int answer = 0;
        int count = 0;
        int maxCount = s.length() - 1;
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 == 1) {
            return 0;
        }

        for (int i = 0; i <= maxCount; i++) {
            while (count != maxCount) {
                int value = i;
                char input = s.charAt(value);

                if (input == '(' || input == '{' || input == '[') {
                    stack.push(input);
                    value++;
                    count++;
                }

                if (input == ')' || input == '}' || input == ']') {
                    if (stack.empty() || stack.peek() != input) {
                        stack.push('n');
                        count = 0;
                        break;
                    }

                    if (stack.peek() == input) {
                        stack.pop();
                        value++;
                        count++;
                    }
                }

                if (value == maxCount) {
                    value = 0;
                    count++;
                }
            }

            if (stack.empty()) {
                answer++;
            }

            stack.clear();
        }
        return answer;
    }
}
