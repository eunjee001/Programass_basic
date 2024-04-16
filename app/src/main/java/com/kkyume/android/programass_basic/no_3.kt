package com.kkyume.android.programass_basic

/**
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 */
class Solution3 {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        for (i in num_str.indices){
            answer += num_str.substring(i, i+1).toInt()
        }
        return answer
    }
}