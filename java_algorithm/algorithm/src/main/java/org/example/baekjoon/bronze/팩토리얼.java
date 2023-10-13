package org.example.baekjoon.bronze;

import java.io.*;

public class 팩토리얼 {

    static int result = 1;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        dfs(input);
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();

    }

    public static void dfs(int number) {
        if (number < 1) {
            return;
        }

        result = result * number;
        dfs(number - 1);
    }

}
