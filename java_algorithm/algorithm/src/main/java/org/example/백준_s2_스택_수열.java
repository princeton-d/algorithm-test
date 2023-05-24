package org.example;

import java.io.*;
import java.util.*;

public class 백준_s2_스택_수열 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int peekNumber = 0;
        int count = 1;

        while (true) {
            int number = Integer.parseInt(br.readLine());
            while (count <= number) {
                if (number > peekNumber) {
                    stack.push(count);
                    peekNumber = count;
                    count++;
                    sb.append("+").append("\n");
                }
            }

            if (number == peekNumber) {
                stack.pop();
                sb.append("-").append("\n");
                peekNumber = stack.size() > 0 ? stack.peek() : 0;
                if (stack.size() == 0 && count == n + 1) {
                    break;
                }
                continue;
            }

            System.out.println("NO");
            break;
        }

        if (stack.size() == 0 && peekNumber == 0) {
            System.out.println(sb);
        }
    }
}
