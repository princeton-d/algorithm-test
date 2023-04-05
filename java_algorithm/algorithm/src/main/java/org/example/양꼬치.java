package org.example;

public class 양꼬치 {
    public int solution(int n, int k) {
        int SERVICE_CRITERIA = 10;
        int LAMB_SKEWERS_PRICE = 12000;
        int DRINK_PRICE = 2000;
        
        int lambSkewersCount = n;
        int drinkCount = k;
        int serviceCount = (int) Math.floor(lambSkewersCount / SERVICE_CRITERIA);
        int serviceMoney = serviceCount * DRINK_PRICE;
    
    
        int answer = LAMB_SKEWERS_PRICE * lambSkewersCount + DRINK_PRICE * drinkCount - serviceMoney;
        
        return answer;
    }
}
