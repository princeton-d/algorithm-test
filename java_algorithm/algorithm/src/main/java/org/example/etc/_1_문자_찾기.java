package org.example.etc;

import java.util.*;

public class _1_문자_찾기 {

    public int solution(String str, char t) {
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        _1_문자_찾기 T = new _1_문자_찾기();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }

}
