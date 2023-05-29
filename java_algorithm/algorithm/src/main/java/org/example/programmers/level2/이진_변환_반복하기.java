package org.example.programmers.level2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        while (s.length() != 1) {
            int oneCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }

                if (s.charAt(i) == '1') {
                    oneCount++;
                }
            }

            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(oneCount);
            count++;
        }

        answer[0] = count;
        answer[1] = zeroCount;

        return answer;
    }
}
