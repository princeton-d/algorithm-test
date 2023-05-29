package org.example.programmers.level2;

import java.util.*;

public class 의상 {
    public int solution(String[][] clothes) {
        Map<String, Integer> categoryCountList = new HashMap<>();
        int result = 1;

        for (String[] items : clothes) {
            String categoryType = items[1];

            categoryCountList.put(categoryType, categoryCountList.getOrDefault(categoryType, 1) + 1);
        }

        for (int value : categoryCountList.values()) {
            result *= value;
        }

        return result - 1;
    }
}
