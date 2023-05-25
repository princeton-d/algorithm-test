package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 4, 2, 74, 25, 21, 13};
        List<Integer> lists = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
        LinkedList<Integer> list = new LinkedList<>(lists);
        System.out.println(list.getLast());
    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : tangerine) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i);
            count++;

            if (answer >= k) {
                return count;
            }
        }

        return count;
    }
}
