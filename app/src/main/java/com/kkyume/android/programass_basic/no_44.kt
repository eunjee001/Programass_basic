package com.kkyume.android.programass_basic

/**
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 */
class no_44 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var stringBuilder = StringBuilder()
        var number = n
        while (number > 0){
            stringBuilder.append(number % 3)
            number /= 3
        }
        val reverseString = stringBuilder.reverse().toString()
        for (i in reverseString.indices){
            answer = reverseString[i].toString().toInt() * Math.pow(3.0, i.toDouble()).toInt()
        }
        return answer
    }
}
