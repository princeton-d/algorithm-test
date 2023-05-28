package org.example;

import java.io.*;

public class 백준_b2_알파벳_찾기 {
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
