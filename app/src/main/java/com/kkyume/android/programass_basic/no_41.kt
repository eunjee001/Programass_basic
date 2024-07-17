package com.kkyume.android.programass_basic

/**
 * 별찍기
 */
class no_41 {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        for (i in 0..b-1){
            for (j in 0..a-1){
                print("*")
            }
            println("")
        }
    }
}
