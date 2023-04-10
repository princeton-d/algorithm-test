package org.example;

import java.util.*;

public class _0_문자열_정렬하기_1 {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        String[] splitString = my_string.split("");
        
        for (String str : splitString) {
            if (str.matches("[+-]?\\d*(\\.\\d+)?")) {
                answer.add(Integer.parseInt(str));
            }
        }
        
        answer.stream()
            .mapToInt(i -> i)
            .sorted()
            .toArray();
        
        return answer.stream().mapToInt(i -> i).sorted().toArray();
    }
}
