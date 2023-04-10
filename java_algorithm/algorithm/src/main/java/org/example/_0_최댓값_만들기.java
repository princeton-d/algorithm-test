package org.example;

import java.util.*;

public class _0_최댓값_만들기 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return a > b ? a : b;
    }
}
