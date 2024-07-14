package com.kkyume.android.programass_basic

class no_22 {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if (a<b){
            for (i in a+1..b){
                answer = (a+i).toLong()
            }
        }else if (a>b){
            for (i in b+1..a){
                answer += i
            }
        }else{
            answer = a.toLong()
        }
        return answer
    }
}