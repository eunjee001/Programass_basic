package com.kkyume.android.programass_basic;

import java.util.*;

public class no_17 {
    public long solution(long n) {
        long answer = 0;
        int StringValue = String.valueOf(n).length();
        String strAnswer = "";

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<StringValue; i++){
            list.add(Integer.parseInt(String.valueOf(n).substring(i, i+1)));
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i<StringValue; i++){
            strAnswer = strAnswer + list.get(i);
        }
        answer = Long.parseLong(strAnswer);

        return answer;
    }
}
