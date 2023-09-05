package org.example.programmers.level2;

import java.util.Arrays;

public class 연속된_부분_수열의_합 {

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

    public int[] solution2(int[] sequence, int k) {
        int startPoint = sequence.length - 1;
        int endPoint = sequence.length - 1;
        int sum = 0;

        int[] result = new int[]{startPoint, endPoint};
        int resultLength = startPoint;

        while(startPoint >= 0) {
            sum += sequence[startPoint];

            if (sum == k && resultLength >= endPoint - startPoint) {
                resultLength = endPoint - startPoint;
                result[0] = startPoint;
                result[1] = endPoint;
                startPoint--;

                continue;
            }

            if (sum < k) {
                startPoint--;

                continue;
            }

            if (sum > k) {
                sum -= sequence[startPoint];
                sum -= sequence[endPoint];
                endPoint--;

                continue;
            }

            startPoint--;
        }

        return result;
    }
}
