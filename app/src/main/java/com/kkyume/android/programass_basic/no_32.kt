package com.kkyume.android.programass_basic

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
class no_32 {
    fun solution(s: String): String {
        var answer = ""
        var middle = s.length/2
        if (s.length % 2 == 0){
            answer = s.substring(middle-1,middle+1)
        }else{
            answer = s.substring(middle, middle+1)
        }
        return answer
    }
}