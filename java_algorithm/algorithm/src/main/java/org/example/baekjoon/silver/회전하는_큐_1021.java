package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 회전하는_큐_1021 {

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (queue.indexOf(number) <= queue.size() - queue.indexOf(number) - 1) { // 앞에서 뒤로 빼는개 빠름
                int count = queue.indexOf(number);
                for (int j = 0; j < count; j++) {
                    queue.addLast(queue.removeFirst());
                    result++;
                }
                queue.removeFirst();
                continue;
            }

            if (queue.indexOf(number) > queue.size() - queue.indexOf(number) - 1) { // 뒤에서 앞으로 빼는게 빠름
                int count = queue.size() - queue.indexOf(number) - 1;
                for (int j = 0; j <= count; j++) {
                    queue.addFirst(queue.removeLast());
                    result++;
                }
                queue.removeFirst();
            }
        }

        System.out.println(result);

    }

}
