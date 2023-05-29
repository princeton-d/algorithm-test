package org.example.programmers.level0;

public class 짝수_홀수_개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for (int number : num_list) {
            int num = number % 2 == 0 ? 0 : 1;
            answer[num] = answer[num] + 1;
        }
        
        return answer;
    }
}
