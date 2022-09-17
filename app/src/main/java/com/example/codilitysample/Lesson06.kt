package com.example.codilitysample

class Lesson06 {
/*
Distinct
Write a function

fun solution(A: IntArray): Int

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

    fun distinct(inputArray: IntArray): Int {
        //codility 100%
        return inputArray.groupBy { it }.size
    }

    /*
MaxProductOfThree
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

fun solution(A: IntArray): Int

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */
    fun maxProductOfThree(inputArray: IntArray): Int {
        // codility 44٪
        var maxMultiple: Int? = null
        for (i in 0..inputArray.lastIndex - 2)
            for (j in i + 1..inputArray.size)
                for (k in j + 1..inputArray.lastIndex) {
                    val multiple = inputArray[i] *
                            inputArray[j] *
                            inputArray[k]
                    if (
                        maxMultiple == null ||
                        maxMultiple < multiple
                    )
                        maxMultiple = multiple
                }
        return maxMultiple ?: 0
    }
}