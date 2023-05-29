package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 스택_10828 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            String input = br.readLine();

            if (input.contains("push")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                stack.add(num);
                continue;
            }

            if (input.contains("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                    continue;
                }

                bw.write(stack.get(stack.size() - 1) + "\n");
                stack.remove(stack.size() - 1);
                continue;
            }

            if (input.contains("size")) {
                bw.write(stack.size() + "\n");
                continue;
            }

            if (input.contains("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                    continue;
                }

                bw.write("0\n");
                continue;
            }

            if (input.contains("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                    continue;
                }

                bw.write((stack.get(stack.size() - 1)) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
