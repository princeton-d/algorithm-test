package org.example.programmers.level2;

import java.util.*;

public class 귤_고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : tangerine) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i);
            count++;

            if (answer >= k) {
                return count;
            }
        }

        return count;
    }
}
