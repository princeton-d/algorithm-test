package org.example.baekjoon.bronze;

import java.io.*;
import java.util.*;

public class 약수_1037 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int base = Integer.parseInt(st.nextToken());
        int max = base;
        int min = base;

        for (int i = 1; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input > max) {
                max = input;
                continue;
            }

            if (input < min) {
                min = input;
            }
        }

        System.out.println(max * min);
    }
}
