package org.example;

public class _0_가위_바위_보 {
    public String solution(String rsp) {
        String answer = "";
        String[] splitRsp = rsp.split("");
        
        for (String str : splitRsp) {
            if (str.equals("0")) {
                answer += "5";
                continue;
            }
            answer += str.equals("2") ? "0" : "2";
        }
        
        return answer;
    }
}
