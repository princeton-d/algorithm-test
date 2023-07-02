package org.example.programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {

    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for (int priority : priorities) {
            pQueue.add(priority);
        }

        while (pQueue.size() != 0) {
            for (int i = 0; i < priorities.length; i++) {
                if (pQueue.peek() == priorities[i]) {
                    pQueue.remove();
                    count++;

                    if (i == location) {
                        return count;
                    }

                }
            }
        }

        return count;
    }

}
