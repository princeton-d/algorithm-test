package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String input = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        String[] split = input.substring(2, input.length() - 2).split("},\\{|,");
        Map<String, Integer> map = new HashMap<>();

        for (String s : split) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int[] array = map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .map(item -> Integer.parseInt(item.getKey()))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}
