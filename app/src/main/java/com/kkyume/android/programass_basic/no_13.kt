package com.kkyume.android.programass_basic

class no_13 {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        if (number % n == 0 && number % m == 0){
            answer = 1
        }else {
            answer = 0
        }
        return answer
    }
}