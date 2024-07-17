package com.kkyume.android.programass_basic

/**
 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
class no_36 {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var num =0
        for (i in left..right){
            for (j in 1..i){
                if (i % j == 0){
                    num ++
                }
            }
            if (num % 2 == 0){
                answer += i
            }else{
                answer -= i
            }
            num = 0
        }
        return answer
    }
}