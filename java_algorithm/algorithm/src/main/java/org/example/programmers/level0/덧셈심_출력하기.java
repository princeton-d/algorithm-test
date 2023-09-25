package org.example.programmers.level0;

import java.util.Scanner;

public class 덧셈심_출력하기 {

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;

            System.out.println(a + " + " + b + " = " + result);
        }
    }

}
