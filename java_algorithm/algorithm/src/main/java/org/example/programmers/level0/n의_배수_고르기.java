package org.example.programmers.level0;

import java.util.*;

public class n의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int number : numlist) {
            if (number % n == 0) {
                list.add(number);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
