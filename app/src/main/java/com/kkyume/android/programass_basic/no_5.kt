package com.kkyume.android.programass_basic


class Solution5 {
    fun solution(num_list: IntArray): IntArray
            = num_list.sorted().slice(5 .. num_list.size-1).toIntArray()
}