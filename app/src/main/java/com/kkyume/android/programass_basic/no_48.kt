package com.kkyume.android.programass_basic

/**
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
 *
 * 예를들어
 *
 * F(2) = F(0) + F(1) = 0 + 1 = 1
 * F(3) = F(1) + F(2) = 1 + 1 = 2
 * F(4) = F(2) + F(3) = 1 + 2 = 3
 * F(5) = F(3) + F(4) = 2 + 3 = 5
 * 와 같이 이어집니다.
 *
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 *
 *


 */
class no_48 {
    fun solution(n: Int): Int = search(arrayListOf<Int>(0, 1), n, 2)


    fun search( f : ArrayList<Int>, target : Int, now : Int) : Int = if( now != target) {
        f.add((f[now-2]%1234567+f[now-1]%1234567)%1234567)
        search(f, target, now+1)
    }
    else{
        f.add((f[now-2]%1234567+f[now-1]%1234567)%1234567)
        f.last()
    }
}
