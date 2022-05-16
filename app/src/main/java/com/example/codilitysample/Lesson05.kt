package com.example.codilitysample

class Lesson05 {

    /*
    A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

Array A contains only 0s and/or 1s:

0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

Write a function:

fun solution(A: IntArray): Int

that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
     */
    fun passingCars(inputArray: IntArray): Int {
        //100% Codility
        var result = 0
        var oneCount = inputArray.count { i: Int -> i == 1 }
        for (i in inputArray) {
            if (i == 0)
                result += oneCount
            else if (i == 1)
                oneCount--
            if (result > 1000000000)
                return -1
        }
        return result
    }

    /*
            Write a function:

        fun solution(A: Int, B: Int, K: Int): Int

        that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

        { i : A ≤ i ≤ B, i mod K = 0 }

        For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

        Write an efficient algorithm for the following assumptions:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.
        Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
     */
    fun countDiv01(first: Int, last: Int, div: Int): Int {
        //Codility 50%
        var result = 0
        for (i in first..last) {
            if (i % div == 0)
                result++
        }
        return result
    }

    fun countDiv02(first: Int, last: Int, div: Int): Int {
        //75% Codility
        var result = 0
        var divisibleNum = -1
        for (i in first..last) {
            if (i % div == 0) {
                divisibleNum = i
                break
            }
        }
        if (divisibleNum == -1) return 0
        while (divisibleNum <= last) {
            result++
            divisibleNum += div
        }
        return result
    }

    fun countDiv03(first: Int, last: Int, div: Int): Int {
        //100% Codility
        var divisibleNum = -1
        for (i in first..last) {
            if (i % div == 0) {
                divisibleNum = i
                break
            }
        }
        if (divisibleNum == -1) return 0
        return ((last-divisibleNum)/div)+1
    }
}

fun main() {
    Lesson05().countDiv03(6, 11, 2)
}