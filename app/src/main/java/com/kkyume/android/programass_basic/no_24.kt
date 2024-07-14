package com.kkyume.android.programass_basic


class no_24 {
    fun solution(num: Int): String {
        var answer = ""
        answer = if (num % 2 == 0){
            "Even"
        }else{
            "Odd"
        }
        return answer
    }
}