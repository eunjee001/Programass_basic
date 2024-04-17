package com.kkyume.android.programass_basic

/**
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * slice
 * slice는 리스트의 특정 범위를 추출하여 새로운 리스트를 만드는 메서드입니다.
 * subList와는 다르게 인자로 IntRange를 받으며, IntRange에 해당하는 범위의 리스트를 추출하여 새로운 리스트로 생성합니다.
 * 또한 subList가 인자로 받는 범위에서는 끝 인덱스가 포함되지 않지만, slice에서는 IntRange를 받기에 range의 끝에 해당하는 범위가 포함된 리스트가 반환됩니다.
 */
class Solution5 {
    fun solution(num_list: IntArray): IntArray
            = num_list.sorted().slice(5 .. num_list.size-1).toIntArray()

    // slice 예시
    val list = listOf(1, 2, 3, 4, 5)
    val sliced = list.slice(1..4) // [2, 3, 4, 5]
}