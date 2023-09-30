package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class _1로_만들기 {

    static Queue<Integer> queue = new LinkedList<>();
    static Map<Integer, Boolean> map = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        queue.offer(input);
        bfs();
        sb.append(count);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    public static void bfs() {
        while (queue.isEmpty() == false) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int number = queue.poll();

                if (number == 1) {
                    return;
                }

                map.put(number, true);

                if (number % 3 == 0 && map.getOrDefault(number / 3, false) != true) {
                    queue.offer(number / 3);
                }

                if (number % 2 == 0 && map.getOrDefault(number / 2, false) != true) {
                    queue.offer(number / 2);
                }

                if (map.getOrDefault(number - 1, false) != true) {
                    queue.offer(number - 1);
                }
            }

            count++;
        }
    }

}
