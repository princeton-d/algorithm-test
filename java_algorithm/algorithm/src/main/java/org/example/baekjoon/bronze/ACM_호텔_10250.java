package org.example.baekjoon.bronze;

import java.io.*;

public class ACM_호텔_10250 {
    public static void main(String[] args) throws IOException {
//        System.setIn(new FileInputStream("src/input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int H = Integer.parseInt(st.nextToken());
//            st.nextToken();
//            int N = Integer.parseInt(st.nextToken());
//
//            String left = String.valueOf(N % H == 0 ? H : N % H);
//            String right = String.valueOf(N % H == 0 ? N / H : N / H + 1);
//            right = right.length() == 1 ? "0" + right : right;
//
//            bw.write(left + right + "\n");
//        }
//
//        bw.flush();
//
//        bw.close();
//        br.close();

        String input = "2\n6 12 10\n30 50 72";
        String[] splitInput = input.split("\n");
        int caseCount = Integer.parseInt(splitInput[0]);

        for (int i = 1; i < splitInput.length; i++) {
            String[] splitCase = splitInput[i].split(" ");
            int H = Integer.parseInt(splitCase[0]);
            int N = Integer.parseInt(splitCase[2]);
            String leftValue = String.valueOf(N % H == 0 ? H : N % H);
            String rightValue = String.valueOf(N % H == 0 ? N / H : N / H + 1);
            rightValue = rightValue.length() == 1 ? "0" + rightValue : rightValue;

            System.out.println(leftValue + rightValue);
        }
    }
}