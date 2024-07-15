package com.kkyume.android.programass_basic

/**
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
 */

class no_29 {
    fun solution(num: Int): Int {
        var cnt = 0
        var n = num.toLong()

        while (n > 1) {
            if (n % 2 == 0L) {
                n /= 2
            }
            else {
                n = n * 3 + 1
            }
            cnt++

            if (cnt > 500) break;
        }

        return if (cnt < 501) cnt else -1
    }
}