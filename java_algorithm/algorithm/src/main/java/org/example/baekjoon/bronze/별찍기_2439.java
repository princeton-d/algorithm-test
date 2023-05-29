package org.example.baekjoon.bronze;

public class 별찍기_2439 {

    public static void main(String[] args) {
        int input = 5;

        for (int i = 1; i <= input; i++) {
            System.out.println(" ".repeat(input - i) + "*".repeat(i));
        }
    }
}
