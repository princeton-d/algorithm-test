package org.example.programmers.level2;

import java.util.Arrays;

public class 요격_시스템 {

    public static void main(String[] args) {
        int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};

        System.out.println(solution(targets));
    }

    public static int solution(int[][] targets) {
        int answer = 1;

        Arrays.sort(targets, (a, b) -> a[1] - b[1]);

        int lastArea = targets[0][1];

        for (int[] target : targets) {

            if (target[0] >= lastArea) {
                answer++;
                lastArea = target[1];
            }

        }

        return answer;
    }
}
