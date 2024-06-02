package com.kkyume.android.programass_basic;


import java.util.*;

public class no_15 {
    /**
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
     * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        int[] arrNum = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++){
            // strNum.charAt(i) - '0'; --> int형
            arrNum[i] = strNum.charAt(i) - '0';
        }
        //Arrays.stream(배열).sum() 은 배열에 저장된 데이터 총 합계를 구하는 메소드
        answer = Arrays.stream(arrNum).sum();
        return answer;
    }
}
