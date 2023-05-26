package org.example;

import java.util.*;

public class _2_연속_부분_수열_합의_개수 {
    public int solution(int[] elements) {
        LinkedList<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();


        for (int num : elements) {
            list.add(num);
        }

        for (int i = 0; i < elements.length; i++) {
            list.add(list.removeFirst());
            int sum = 0;

            for(int j = 0; j < elements.length; j++) {
                sum += list.get(j);
                set.add(sum);
            }
        }

        return set.size();
    }
}
