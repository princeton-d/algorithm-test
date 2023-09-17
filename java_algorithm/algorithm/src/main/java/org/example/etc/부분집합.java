package org.example.etc;

public class 부분집합 {

    public static void main(String[] args) {
        solution(3);
    }

    public static void solution(int number) {
        int[] arr = new int[number + 1];
        dfs(1, number + 1, arr);
    }

    public static void dfs(int number, int lastNumber, int[] arr) {
        if (number == lastNumber) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    result += i;
                }
            }
            System.out.println(result);
            return;
        }

        arr[number] = 1;
        dfs(number + 1, lastNumber, arr);
        arr[number] = 0;
        dfs(number + 1, lastNumber, arr);
    }

}
