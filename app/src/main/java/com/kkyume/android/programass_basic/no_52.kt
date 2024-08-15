package com.kkyume.android.programass_basic

import androidx.core.graphics.component1
import androidx.core.graphics.component2
import java.util.Collections
import java.util.PriorityQueue


/**
 * 경화는 과수원에서 귤을 수확했습니다. 경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다.
 * 그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.

예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다.
경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면,
귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.

경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다.
경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 */

class no_52 {
    fun main() {
        val keyMapping = mapOf(
            'o' to 1 to 1, 'l' to 1 to 2, 'd' to 1 to 3,
            'h' to 2 to 1, 'c' to 2 to 2, 'a' to 2 to 3,
            'u' to 3 to 1, 'g' to 3 to 2, 'n' to 3 to 3,
            's' to 4 to 1, 'i' to 4 to 2, 'j' to 4 to 3,
            'e' to 5 to 1, 'k' to 5 to 2, 'b' to 5 to 3,
            'm' to 6 to 1, 'f' to 6 to 2, 'p' to 6 to 3,
            'q' to 7 to 1, 'r' to 7 to 2, 'z' to 7 to 3,
            'v' to 8 to 1, 'x' to 8 to 2,
            'y' to 9 to 1, 'w' to 9 to 2, 't' to 9 to 3
        )

        val s = "abcdefghijkl" // 입력 문자열

        val totalKeyPresses = s.sumBy { char ->
            val (key, presses) = keyMapping[char] ?: throw IllegalArgumentException("Invalid character in input string")
            presses
        }

        println("Total key presses required: $totalKeyPresses")
    }



}
