package com.kkyume.android.programass_basic

class no_20 {
    fun solution(s: String): String {
        var answer = ""
        var sList = s.split(" ")
        val numlist = arrayListOf<Int>()
        for (i in sList.indices){
            numlist.add(sList[i].toInt())
        }
        var list = numlist.sorted()
        answer = list.first().toString() +" "+list.last()
        return answer
    }
}