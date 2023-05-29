package org.example.programmers.level2;

import java.util.*;

public class n_2_배열_자르기 {
    public int[] solution(int n, long left, long right) {
        long leftX = left % n;
        long leftY = left / n;
        long rightX = right % n;
        long rightY = right / n;
        List<Long> list = new ArrayList<>();

        for (long i = leftY; i <= rightY; i++) {

            for (long j = leftX; j < n; j++) {

                if (j <= i) {
                    list.add(i + 1);

                    if (i == rightY && j == rightX) {
                        break;
                    }

                    continue;
                }

                list.add(j + 1);

                if (i == rightY && j == rightX) {
                    break;
                }
            }

            leftX = 0;
        }

        return list.stream().mapToInt(Long::intValue).toArray();
    }
}
