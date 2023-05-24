package org.example;

import java.util.Arrays;

public class _2_최댓값과_최솟값 {

    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(str -> Integer.parseInt(str))
                .sorted()
                .toArray();

        return arr[0] + " " + arr[arr.length - 1];
    }

}
