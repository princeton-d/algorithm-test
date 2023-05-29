package org.example.programmers.level2;

import java.util.*;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < people.length; i++) {
            list.add(people[i]);
        }

        while (list.size() != 0) {
            if (list.getFirst() + list.getLast() > limit || list.size() == 1) {
                list.removeLast();
                count++;
                continue;
            }

            list.removeFirst();
            list.removeLast();
            count++;
        }

        return count;
    }
}
