package org.example.baekjoon.bronze;

import java.io.*;

public class N_찍기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer();

        int maxValue = Integer.parseInt(br.readLine());

        for (int i = 1; i <= maxValue; i++) {
            sb.append(i);
            if (i != maxValue) {
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
