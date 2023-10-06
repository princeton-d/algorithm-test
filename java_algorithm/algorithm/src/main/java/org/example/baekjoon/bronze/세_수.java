package org.example.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class 세_수 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstNumber = Integer.parseInt(st.nextToken());
        int secondNumber = Integer.parseInt(st.nextToken());
        int thirdNumber = Integer.parseInt(st.nextToken());

        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);

        for (int i = 0; i < 1; i++) {
            if (firstNumber == maxNumber) {
                sb.append(Math.max(secondNumber, thirdNumber));
                break;
            }

            if (secondNumber == maxNumber) {
                sb.append(Math.max(firstNumber, thirdNumber));
                break;
            }

            sb.append(Math.max(firstNumber, secondNumber));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
