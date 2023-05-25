package org.example;

import java.io.*;
import java.util.*;

public class 백준_s5_요세푸스_문제 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();

        sb.append("<");
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                list.add(list.removeFirst());
            }
            Integer target = list.removeFirst();
            if (i == N - 1) {
                sb.append(target).append(">");
            } else {
                sb.append(target).append(", ");
            }
        }
        System.out.println(sb);
    }
}
