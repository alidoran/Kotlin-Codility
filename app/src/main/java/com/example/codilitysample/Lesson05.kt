package com.example.codilitysample

import android.text.TextUtils.substring
import java.lang.StringBuilder

class Lesson05 {

    /*
    PassingCars:
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
    CountDiv:
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
        return ((last - divisibleNum) / div) + 1
    }

    fun countDiv04(first: Int, last: Int, div: Int): Int {
        //100% Codility (Better than countDiv03)
        val dividableToLast = last / div
        val dividableToFirst: Int
        val result: Int
        if (first == 0) {
            dividableToFirst = first / div
            result = dividableToLast - dividableToFirst + 1
        } else {
            dividableToFirst = (first - 1) / div
            result = dividableToLast - dividableToFirst
        }
        return result
    }

    /*
    GenomicRangeQuery:
        A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence.
        Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
        You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
        The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters.
        There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers.
        The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

            For example, consider string S = CAGCCTA and arrays P, Q such that:
            P[0] = 2    Q[0] = 4
            P[1] = 5    Q[1] = 5
            P[2] = 0    Q[2] = 6
        The answers to these M = 3 queries are as follows:
        The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
        The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
        The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
        Write a function:

        fun solution(S: String, P: IntArray, Q: IntArray): IntArray
        that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers,
        returns an array consisting of M integers specifying the consecutive answers to all queries.
        Result array should be returned as an array of integers.

        For example, given the string S = CAGCCTA and arrays P, Q such that:

            P[0] = 2    Q[0] = 4
            P[1] = 5    Q[1] = 5
            P[2] = 0    Q[2] = 6
        the function should return the values [2, 4, 1], as explained above.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        M is an integer within the range [1..50,000];
        each element of arrays P and Q is an integer within the range [0..N - 1];
        P[K] ≤ Q[K], where 0 ≤ K < M;
        string S consists only of upper-case English letters A, C, G, T.
     */
    fun genomicRangeQuery01(
        inputDna: String,
        firstArray: IntArray,
        secondArray: IntArray
    ): IntArray {
        //codility 25%
        val result = ArrayList<Int>()
        var investigateString: String
        for (i in 0..firstArray.lastIndex) {
            investigateString = if (firstArray[i] == secondArray[i])
                inputDna[firstArray[i]].toString()
            else
                inputDna.substring(firstArray[i], secondArray[i])
            if (investigateString.contains('A'))
                result.add(1)
            else if (investigateString.contains('C'))
                result.add(2)
            else if (investigateString.contains('G'))
                result.add(3)
            else if (investigateString.contains('T'))
                result.add(4)
        }
        return result.toIntArray()
    }

    fun genomicRangeQuery02(
        //Codility doesn't understand minOf
        inputDna: String,
        firstArray: IntArray,
        secondArray: IntArray
    ): IntArray {
        val result = ArrayList<Int>()
        val inputDnaNum = StringBuilder()
        for (input in inputDna) {
            if (input == 'A')
                inputDnaNum.append(1)
            if (input == 'C')
                inputDnaNum.append(2)
            if (input == 'G')
                inputDnaNum.append(3)
            if (input == 'T')
                inputDnaNum.append(4)
        }
        for (i in 0..firstArray.lastIndex) {
            val mDna =
                if (firstArray[i] == secondArray[i])
                    charArrayOf(inputDnaNum[firstArray[i]])
                else
                    inputDnaNum.substring(firstArray[i], secondArray[i]).toCharArray()
            result.add(mDna.minOf { it.digitToInt() }.toInt())
        }
        return result.toIntArray()
    }
}

/*
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
 */

fun main() {
    val firstArray = arrayListOf<Int>(2, 5, 0).toIntArray()
    val secondArray = arrayListOf<Int>(4, 5, 6).toIntArray()
    Lesson05().genomicRangeQuery02("CAGCCTA", firstArray, secondArray)
}
