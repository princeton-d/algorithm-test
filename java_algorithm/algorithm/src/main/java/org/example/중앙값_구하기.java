package org.example;

import java.util.Arrays;

public class 중앙값_구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int answer = array[array.length/2];
        return answer;
    }
}
