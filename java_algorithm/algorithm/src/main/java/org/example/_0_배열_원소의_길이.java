package org.example;

import java.util.*;

public class _0_배열_원소의_길이 {
    public int[] solution(String[] strlist) {
        List<Integer> stringLengthCountList = new ArrayList<>();
        
        for (String str : strlist) {
            stringLengthCountList.add(str.length());
        }
        
        return stringLengthCountList.stream()
            .mapToInt(item -> item)
            .toArray();
    }
}
