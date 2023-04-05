package org.example;

import java.util.ArrayList;
import java.util.List;

public class 짝수는_싫어요 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
    
        while (count <= n) {
            list.add(count);
            count += 2;
        }
        
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
