package com.kkyume.android.programass_basic

class no_14 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var i = 2
        var j = 1
        var even: Int

        //짝수 일때
        if(n % 2 == 0){
            while (i <= n){
                even = i * i
                i += 2
                answer += even
            }
        // 홀수 일때
        }else {
            while (j <= n){
                answer += j
                j += 2
            }
        }
        return answer
    }
}