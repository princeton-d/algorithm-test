package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 제로_10773 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.remove(stack.size() - 1);
                continue;
            }

            stack.add(number);

        }

        int result = 0;

        for (Integer number : stack) {
            result += number;
        }

        sb.append(result);
        System.out.println(sb);
    }

}
