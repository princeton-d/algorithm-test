package org.example.programmers.level1;

import java.util.*;

public class 추억_점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> nameMap = new HashMap<>();
        int[] result = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            nameMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            result[i] = 0;

            for (int j = 0; j < photo[i].length; j++) {
                result[i] += nameMap.getOrDefault(photo[i][j], 0);
            }
        }

        return result;
    }

}
