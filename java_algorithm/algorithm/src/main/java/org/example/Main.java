package org.example;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public long solution(int[][] rectangles) {
        int maxValue = 0;

        for (int[] row : rectangles) {

            for (int value : row) {

                if (value > maxValue) {
                    maxValue = value;
                }

            }

        }

        int[][] totalArea = new int[maxValue][maxValue];

        for (int[] area : rectangles) {
            int x1 = area[0];
            int y1 = area[1];
            int x2 = area[2];
            int y2 = area[3];

            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    totalArea[i][j] = 1;
                }
            }
        }

        long result = 0L;

        for (int i = 0; i < totalArea.length; i++) {
            for (int j = 0; j < totalArea[i].length; j++) {
                if (totalArea[i][j] == 1) {
                    result++;
                }
            }
        }

        return result;

//        Set<Long> area = new HashSet<>();
//
//        for (int[] rect : rectangles) {
//            long x1 = rect[0];
//            long y1 = rect[1];
//            long x2 = rect[2];
//            long y2 = rect[3];
//
//            for (long x = x1; x < x2; x++) {
//                for (long y = y1; y < y2; y++) {
//                    area.add(x * 1000000000L + y);
//                }
//            }
//        }
//
//        return area.size();

    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("001"));
        Point tmp = new Point(0, 0);
    }
}