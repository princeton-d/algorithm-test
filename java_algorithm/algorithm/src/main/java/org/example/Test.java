package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int dot = 48;
        List<int[]> list = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(dot); i++) {
            if (dot % i == 0) {
                int x = i;
                int y = dot / i;
                list.add(x >= y ? new int[]{x, y} : new int[]{y, x});
            }
        }

        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
