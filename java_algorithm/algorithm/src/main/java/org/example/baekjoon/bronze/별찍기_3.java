package org.example.baekjoon.bronze;

import java.io.*;

public class 별찍기_3 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());
        for (int i = input; i > 0; i--) {
            sb.append("*".repeat(i) + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
