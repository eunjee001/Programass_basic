package com.kkyume.android.programass_basic

/**
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
class no_39 {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length == 4 || s.length == 6){
            for (i in s){
                if (i.isLetter()){
                    answer = false
                    break
                }else{
                    answer =true
                }
            }
        }else {
            answer = false
        }
        return answer
    }
}