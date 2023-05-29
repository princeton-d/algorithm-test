package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 최소_힙_1927 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (list.isEmpty() && input == 0) {
                sb.append("0\n");
                continue;
            }
            if (input == 0) {
                list.sort(null);
                sb.append(list.removeFirst()).append("\n");
                continue;
            }
            list.add(input);
        }
        System.out.println(sb);
    }
}