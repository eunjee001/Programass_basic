package com.kkyume.android.programass_basic

/**
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 *
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 *
 *
 *
 * 해설
 * toCharArray()를 사용하여 문자열을 문자 배열로 변환합니다.
 * sortedArrayDescending()를 사용하여 문자 배열을 내림차순으로 정렬합니다.
 * concatToString()을 사용하여 정렬된 문자 배열을 다시 문자열로 변환합니다.
 *
 *
 * filter 함수를 사용하여 문자열의 각 문자를 검사합니다.
 * it.isUpperCase() 조건을 사용하여 문자가 대문자인지 확인합니다.
 * filter 함수는 조건을 만족하는 문자들로 이루어진 새로운 문자열을 반환합니다.
 */
class no_35 {
        fun solution(s: String): String {
            val upperCase = s.filter { it.isUpperCase() }
            val lowerCase = s.filter { !it.isUpperCase() }
            val sortedString = lowerCase.toCharArray().sortedArrayDescending().concatToString()
            return sortedString + upperCase
    }
}