package org.example;

import java.io.*;
import java.util.*;

public class 백준_s4_균형잡힌_세상 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        boolean state = true;



        while (true) {
            String[] input = br.readLine().split("");
            if (input[0].equals(".")) {
                break;
            }

            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("(") || input[i].equals("[")) {
                    stack.push(input[i]);
                    continue;
                }

                if (input[i].equals(")")) {
                    if (stack.empty() || stack.peek().equals("[")) {
                        state = false;
                        break;
                    }
                    stack.pop();
                    continue;
                }

                if (input[i].equals("]")) {
                    if (stack.empty() || stack.peek().equals("(")) {
                        state = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (state) {
                sb.append("yes\n");
            }
            if (!state) {
                sb.append("no\n");
                state = true;
                stack.clear();
            }
        }
        System.out.println(sb);
    }
}
