package com.kkyume.android.programass_basic

/**
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */

class no_30 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                answer += arr[i]
            }
        }

        if (answer.isEmpty()) {
            return intArrayOf(-1)
        }

        answer.sort()
        return answer
    }
}