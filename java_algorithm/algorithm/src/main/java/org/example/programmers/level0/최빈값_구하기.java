package org.example.programmers.level0;

import java.util.*;

public class 최빈값_구하기 {

    public int solution(int[] array) {
        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                result = key;

                continue;
            }

            if (map.get(key) == maxCount) {
                result = -1;
            }
        }

        return result;
    }

}
