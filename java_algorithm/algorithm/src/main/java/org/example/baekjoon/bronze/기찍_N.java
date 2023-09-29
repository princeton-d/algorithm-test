package org.example.baekjoon.bronze;

import java.io.*;

public class 기찍_N {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer();

        for (int i = Integer.parseInt(br.readLine()); i >= 1; i--) {
            sb.append(i);

            if (i != 1) {
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
