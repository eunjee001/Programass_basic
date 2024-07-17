package com.kkyume.android.programass_basic

/**
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */
class no_40 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {

        // 아래 코드를 통해서 2차원배열이라는거 보여줌
        val answer = Array(arr1.size) { IntArray(arr1[0].size) }
        for (i in 0 until arr1.size){
            for (j in 0 until arr1[i].size){
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return answer
    }
}
