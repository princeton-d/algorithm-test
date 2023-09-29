package org.example.baekjoon.bronze;

public class 정수_N개의_합 {

    public long sum(int[] a) {
        long result = 0;

        for (int number : a) {
            result += number;
        }

        return result;
    }

}
