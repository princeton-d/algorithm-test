package org.example;

import java.util.Arrays;

public class _2_연속된_부분_수열의_합 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        String string = Arrays.toString(solution(arr, 7));
        System.out.println(string);
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int sumLength = Integer.MAX_VALUE;
        int maxLength = sequence.length - 1;

        while (leftPointer <= maxLength) {

            sum += sequence[rightPointer];

            if (leftPointer == rightPointer) {
                sum = sequence[leftPointer];

                if (sum == k) {
                    answer[0] = leftPointer;
                    answer[1] = rightPointer;
                    break;
                }
            }

            if (sum == k) {
                int thisLength = rightPointer - leftPointer;

                if (thisLength < sumLength) {
                    answer[0] = leftPointer;
                    answer[1] = rightPointer;
                    sumLength = thisLength;
                }

                leftPointer++;
                rightPointer = leftPointer;
                continue;
            }

            if (sum > k || rightPointer == maxLength) {
                leftPointer++;
                rightPointer = leftPointer;
                continue;
            }

            rightPointer++;
        }

        return answer;
    }
}
