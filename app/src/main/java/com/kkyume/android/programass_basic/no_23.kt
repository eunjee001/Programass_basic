package com.kkyume.android.programass_basic

import kotlin.math.sqrt

/**
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
class no_23 {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val sqrtValue = sqrt(n.toDouble())
        if (sqrtValue % 1.0 == 0.0){
            answer = ((sqrtValue + 1) * (sqrtValue + 1)).toLong()
        }else{
            answer = -1
        }

        return answer
    }
}