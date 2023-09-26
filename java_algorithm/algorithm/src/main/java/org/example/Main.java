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

    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("001"));
        Point tmp = new Point(0, 0);
    }
}