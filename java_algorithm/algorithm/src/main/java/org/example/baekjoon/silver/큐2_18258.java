package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 큐2_18258 {

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        int front = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.contains("push")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                arr.add(number);
                continue;
            }

            if (input.contains("pop")) {
                if (arr.isEmpty() || arr.size() == front) {
                    sb.append("-1\n");
                    continue;
                }

                sb.append(arr.get(front) + "\n");
                front++;
                continue;
            }

            if (input.contains("size")) {
                sb.append((arr.size() - front) + "\n");
                continue;
            }

            if (input.contains("empty")) {
                if (arr.isEmpty() || arr.size() == front) {
                    sb.append("1\n");
                    continue;
                }

                sb.append("0\n");
            }

            if (input.contains("front")) {
                if (arr.isEmpty() || arr.size() == front) {
                    sb.append("-1\n");
                    continue;
                }

                sb.append(arr.get(front) + "\n");
                continue;
            }

            if (input.contains("back")) {
                if (arr.isEmpty() || arr.size() == front) {
                    sb.append("-1\n");
                    continue;
                }

                sb.append(arr.get(arr.size() - 1) + "\n");
            }

        }

        System.out.println(sb);

    }

}
