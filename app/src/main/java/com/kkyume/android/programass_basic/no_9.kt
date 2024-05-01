package com.kkyume.android.programass_basic

class no_9 {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        for (i in 0 until k){
            answer += my_string
        }

        return answer
    }
}