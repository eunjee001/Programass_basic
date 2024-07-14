package com.kkyume.android.programass_basic

/**
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */

class no_25 {
    fun solution(arr: IntArray): Double {
        var answer :Double = 0.0
        var sum = arr.sum().toDouble()
        answer = (sum / arr.size)
        return answer
    }
}