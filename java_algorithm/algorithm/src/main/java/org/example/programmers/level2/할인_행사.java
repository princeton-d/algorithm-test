package org.example.programmers.level2;

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map = new HashMap<>();
            int count = 0;

            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }

            for (int k = i; k < i + 10; k++) {
                map.put(discount[k], map.getOrDefault(discount[k], -1) - 1);

                if (map.get(discount[k]) < 0) {
                    break;
                }

                count++;

            }

            if (count == 10) {
                result++;
            }

        }

        return result;
    }
}