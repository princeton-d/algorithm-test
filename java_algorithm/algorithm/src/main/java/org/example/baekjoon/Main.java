package org.example.baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer();

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}