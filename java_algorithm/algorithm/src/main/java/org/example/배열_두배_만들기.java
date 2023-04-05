package org.example;

import java.util.Arrays;

public class 배열_두배_만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
    
    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers)
            .map(number -> number * 2)
            .toArray();
    }
}
