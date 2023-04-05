package org.example;

import java.util.Arrays;

public class 배열의_평균값 {
    public double solution(int[] numbers) {
        return (double) Arrays.stream(numbers).sum() / numbers.length;
    }
}
