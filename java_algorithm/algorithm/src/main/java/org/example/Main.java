package org.example;

public class Main {
    public void solution(int[][] arr1) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                boolean left = j > 0 ? arr1[i][j] > arr1[i][j - 1] : true;
                boolean right = j < 4 ? arr1[i][j] > arr1[i][j + 1] : true;
                boolean top = i > 0 ? arr1[i][j] > arr1[i - 1][j] : true;
                boolean bottom = i < 4 ? arr1[i][j] > arr1[i + 1][j] : true;

                if (left && right && top && bottom) {
                    sb.append("*");
                } else {
                    sb.append(arr1[i][j]);
                }

                if (j != 4) {
                    sb.append(" ");
                }

            }

            if (i != 4) {
                sb.append("\n");
            }

        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

        method.solution(arr1);
    }
}