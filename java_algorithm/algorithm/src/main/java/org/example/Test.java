package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 7));
    }

    public static int[] solution(int[] sequence, int k) {
        int startPoint = sequence.length - 1;
        int endPoint = sequence.length - 1;
        int sum = sequence[startPoint];

        int[] result = new int[]{startPoint, endPoint};
        int resultLength = startPoint;

        while(startPoint >= 0) {
            if (sum == k && resultLength >= endPoint - startPoint) {
                resultLength =
                        result[0] = startPoint;
                result[1] = endPoint;
                startPoint--;
                sum += sequence[startPoint];

                continue;
            }

            if (sum < k) {
                startPoint--;
                sum += sequence[startPoint];

                continue;
            }

            if (sum > k) {
                sum -= sequence[endPoint];
                endPoint--;

                continue;
            }

            startPoint--;
            sum += sequence[startPoint];
        }

        return result;
    }
}