package org.example;

import java.io.*;

public class 문제판 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int result = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();
    }
}