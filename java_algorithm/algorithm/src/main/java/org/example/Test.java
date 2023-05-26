package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 5L, 13L)));
    }

    public static int[] solution(int n, long left, long right) {
        int leftX = (int) left % n;
        int leftY = (int) left / n;
        int rightX = (int) right % n;
        int rightY = (int) right / n;
        List<Integer> list = new ArrayList<>();

        for (int i = leftY; i <= rightY; i++) {

            for (int j = leftX; j <= rightX; j++) {

                if (j <= i) {
                    list.add(i + 1);
                    continue;
                }

                list.add(j + 1);
            }

            leftX = 0;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
