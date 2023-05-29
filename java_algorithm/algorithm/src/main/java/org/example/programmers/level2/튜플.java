package org.example.programmers.level2;

import java.util.*;

public class 튜플 {
    public int[] solution(String s) {
        String[] splitInput = s.substring(2, s.length() - 2).split("},\\{|,");
        Map<String, Integer> map = new HashMap<>();

        for (String str : splitInput) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .map(item -> Integer.parseInt(item.getKey()))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
