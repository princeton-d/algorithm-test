package org.example.baekjoon.bronze;

import java.io.*;

public class 숫자의_개수 {

        public static void main(String[] args) throws IOException {
            System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            // StringTokenizer st = new StringTokenizer();

            String number = Long.toString(Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()) * Long.parseLong(br.readLine()));
            char[] numbers = number.toCharArray();
            int[] result = new int[10];

            for (char num : numbers) {
                result[num - 48]++;
            }

            for (int i = 0; i < 10; i++) {
                sb.append(result[i]);

                if (i != 9) {
                    sb.append("\n");
                }
            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();

        }

}
