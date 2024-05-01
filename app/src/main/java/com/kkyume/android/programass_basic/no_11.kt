package com.kkyume.android.programass_basic

class no_11 {
    /**
     * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
     * 12 ⊕ 3 = 123
     * 3 ⊕ 12 = 312
     * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
     *
     * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
     */
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val first = "$a$b".toInt()
        val second = 2 * a * b

        if (first >= second) {
            answer = first
        } else {
            answer = second
        }
        return answer
    }

}