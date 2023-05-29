package org.example.baekjoon.silver;

import java.io.*;

public class 설탕_배달_2839 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (input % 5 == 0) {
                 bw.write(String.valueOf(input / 5 + count));
                 bw.flush();
                 break;
            }

            if (input < 0) {
                bw.write(String.valueOf(-1));
                bw.flush();
                break;
            }

            input -= 3;
            count++;
        }

        bw.close();
        br.close();
    }
}