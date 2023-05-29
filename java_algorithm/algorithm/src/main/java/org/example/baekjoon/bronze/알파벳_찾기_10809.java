package org.example.baekjoon.bronze;

import java.io.*;

public class 알파벳_찾기_10809 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        char target = 'a';

        for (int i = 0; i < 26; i++) {
            sb.append(input.indexOf(target++)).append(" ");
        }

        System.out.println(sb);
    }
}
