package org.example.programmers.level2;

import java.util.*;

public class H_index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int count = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            count++;

            if (citations[i] == count) {
                return count;
            }

            if (citations[i] < count) {
                return count - 1;
            }
        }

        return count;
    }
}
