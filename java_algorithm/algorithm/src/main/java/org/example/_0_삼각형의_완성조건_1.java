package org.example;

import java.util.Arrays;

public class _0_삼각형의_완성조건_1 {
    
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        return sides[2] >= sides[0] + sides[1] ? 2 : 1;
    }
}
