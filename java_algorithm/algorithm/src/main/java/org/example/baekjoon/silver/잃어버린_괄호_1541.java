package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 잃어버린_괄호_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = br.readLine().split("-"); // -를 기준으로 배열을 잘라준다.
        int result = 0; // 반환할 결과를 담아두는 변수

        for (int i = 0; i < inputArr.length; i++) { // - 기준으로 자른 배열을 순회한다.
            int value = Arrays.stream(inputArr[i].split("\\+")) // 요소를 + 기준으로 잘라 배열로 만들어준다.
                    .mapToInt(Integer::parseInt) // Integer.parseInt를 통해 문자열을 숫자타입으로 바꿔준다.
                    .sum(); // 모든 숫자를 더해준다.

            if (i == 0) { // 첫 번째 연산만 실행됨. 첫 번째 수는 더하기를 해야하기 때문
                result += value;
                continue;
            }

            result -= value; // 첫번째 연산 이후로는 모든 숫자를 빼준다.
        }

        System.out.println(result); // 결과 출력
    }
}
