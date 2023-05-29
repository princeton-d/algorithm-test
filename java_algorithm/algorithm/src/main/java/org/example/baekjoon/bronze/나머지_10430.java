package org.example.baekjoon.bronze;

public class 나머지_10430 {

    public static void main(String[] args) {
        String input = "5 8 4";
        String[] inputArr = input.split(" ");
        int A = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);
        int C = Integer.parseInt(inputArr[2]);

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
