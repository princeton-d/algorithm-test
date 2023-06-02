package org.example.programmers.level2;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int bigInt = (int) Math.ceil(( (double) (100 - progresses[0])) / speeds[0]);

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = (int) Math.ceil(( (double) (100 - progresses[i])) / speeds[i]);

            if (bigInt < progresses[i]) {
                bigInt = progresses[i];
                list.add(count);
                count = 1;
                continue;
            }

            count++;
        }

        list.add(count);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
