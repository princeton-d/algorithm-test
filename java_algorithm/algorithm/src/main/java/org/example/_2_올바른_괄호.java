package org.example;

import java.util.*;

public class _2_올바른_괄호 {
    boolean solution(String s) {
        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char str : input) {
            if (str == (')') && stack.empty()) {
                return false;
            }

            if (str == ('(')) {
                stack.push(str);
                continue;
            }

            stack.pop();
        }

        return stack.empty() ? true : false;
    }
}
