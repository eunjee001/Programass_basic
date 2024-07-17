package com.kkyume.android.programass_basic

/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

 [제한 사항]
  - 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
  - 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

 * isWhitespace는 Kotlin에서 문자가 공백 문자인지 여부를 확인하는 함수입니다.
 * 공백 문자는 스페이스(' '), 탭('\t'), 줄 바꿈('\n') 등 다양한 공백 문자들이 포함됩니다.
 * isWhitespace는 이러한 모든 공백 문자를 감지할 수 있습니다.


 */
class no_43 {
    fun solution(s: String): String {
        var answer = StringBuilder()
        var index = 0

        for (char in s) {
            if (char.isWhitespace()) {
                answer.append(char)
                index = 0 // 공백을 만나면 인덱스를 초기화
            } else {
                answer.append(if (index % 2 == 0) char.uppercase() else char.lowercase())
                index++
            }
        }

        return answer.toString()
    }
}
