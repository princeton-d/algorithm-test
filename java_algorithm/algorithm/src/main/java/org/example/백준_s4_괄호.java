package org.example;

import java.io.*;
import java.util.*;

public class 백준_s4_괄호 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String[] inputArr = br.readLine().split("");
            boolean result = true;

            for (int j = 0; j < inputArr.length; j++) {
                String input = inputArr[j];

                if (input.equals("(")) {
                    stack.push(0);
                }

                if (input.equals(")") && stack.isEmpty()) {
                    result = false;
                    break;
                }

                if (input.equals(")")) {
                    stack.pop();
                }

                if (j == inputArr.length - 1 && stack.size() != 0) {
                    stack.clear();
                    result = false;
                }

            }

            if (result) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

        }

        System.out.println(sb);

    }

}
