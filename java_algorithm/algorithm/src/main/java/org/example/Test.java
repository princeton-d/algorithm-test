package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(solution(k, dungeons));
    }

    public static boolean[] visited;
    public static int answer = -1;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, int count){
        answer = Math.max(answer, count);
        for(int i=0; i<dungeons.length; i++){
            if(visited[i] == false && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, count+1);
                visited[i] = false;
            }
        }
    }
}