package org.example;

import java.io.*;

public class 백준_1929_소수_구하기 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        boolean[] arr = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!arr[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();

        bw.close();
        br.close();

        //        String input = "3 16";
//        String[] splitInput = input.split(" ");
//        int M = Integer.parseInt(splitInput[0]);
//        int N = Integer.parseInt(splitInput[1]);
//
//        validate(M, N);
    }

    static void validate(int M, int N) {
        boolean[] Arr = new boolean[N + 1];
        Arr[0] = true;
        Arr[1] = true;

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (!Arr[i]) { // false
                for (int j = i * i; j < Arr.length; j += i) {
                    Arr[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!Arr[i]) {
                System.out.println(i);
            }
        }
    }
}