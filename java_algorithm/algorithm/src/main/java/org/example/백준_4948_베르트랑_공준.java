package org.example;

import java.io.*;

public class 백준_4948_베르트랑_공준 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            bw.write(String.valueOf(validate(n) + "\n"));
        }

        bw.flush();

        bw.close();
        br.close();

//        String input = "1\n" + "10\n" + "13\n" + "100\n" + "1000\n" + "10000\n" + "100000\n" + "0";
//
//        String[] splitInput = input.split("\n");
//
//        for (int i = 0; i < splitInput.length - 1; i++) {
//            int num = Integer.parseInt(splitInput[i]);
//            int result = validate(num);
//            System.out.println(result);
//        }
    }

    private static int validate(int n) {
        int minNumber = n + 1;
        int maxNumber = n * 2;

        boolean[] primNumbers = new boolean[maxNumber + 1];
        int count = 0;

        primNumbers[0] = true;
        primNumbers[1] = true;

        for (int i = 2; i < Math.sqrt(primNumbers.length); i++) {
            if (!primNumbers[i]) {
                for (int j = i * i; j < primNumbers.length; j+=i) {
                    primNumbers[j] = true;
                }
            }
        }

        for (int i = minNumber; i < primNumbers.length; i++) {
            if (!primNumbers[i]) {
                count++;
            }
        }

        return count;
    }

}