package com.example.codilitysample

import kotlin.math.abs
import kotlin.math.ceil

class Lesson03 {
    //region FrogJmp
/*
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

X = 10
Y = 85
D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
    fun frogJmp(x: Int, y: Int, d: Int): Int {
        //100% codility
        return ceil((y - x) / d.toDouble()).toInt()
    }
//endregion

    //region PermMissingElem
/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

A[0] = 2
A[1] = 3
A[2] = 1
A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
    fun permMissingElem01(array: IntArray): Int {
        //50% codility
        array.sort()
        array.forEachIndexed { index, i -> if (i - 1 != index) return index + 1 }
        return 0
    }

    fun permMissingElem02(array: IntArray): Int {
        //80% codility
        val sumArray = array.sum()
        var sum = 0
        var i = 0
        while (sumArray >= sum) {
            sum += (i + 1)
            i++
        }
        return sum - sumArray
    }
//endregion

    //region TapeEquilibrium
/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

A[0] = 3
A[1] = 1
A[2] = 2
A[3] = 4
A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

A[0] = 3
A[1] = 1
A[2] = 2
A[3] = 4
A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
    fun callTapeEquilibrium() {
        val inputArrList = intArrayOf(3, 1, 2, 4, 3)
        println(tapeEquilibrium03(inputArrList))
    }

    fun tapeEquilibrium01(inputList: IntArray): Int {
        //69% Codility
        var output = 0
        for (i in 0 until inputList.size - 1) {
            var preNum = 0
            var postNum = 0
            for (j in i downTo 0) {
                preNum += inputList[j]
            }
            for (j in i + 1 until inputList.size) {
                postNum += inputList[j]
            }
            val resultPart = Math.abs(preNum - postNum)
            if (i == 0) {
                output = resultPart
            } else {
                if (resultPart < output) {
                    output = resultPart
                }
            }
        }
        return output
    }

    fun tapeEquilibrium02(inputList: IntArray): Int {
        //69% codility
        var output = 0
        var preNum = 0
        for (i in 0 until inputList.size - 1) {
            var postNum = 0
            preNum += inputList[i]
            for (j in i + 1 until inputList.size) {
                postNum += inputList[j]
            }
            val resultPart = Math.abs(preNum - postNum)
            if (i == 0) {
                output = resultPart
            } else {
                if (resultPart < output) {
                    output = resultPart
                }
            }
        }
        return output
    }

    private fun tapeEquilibrium03(inputList: IntArray): Int {
        //100% codility
        var output = 0
        var leftSum = 0
        val sum = inputList.sum()
        for (i in 0 until inputList.size - 1) {
            leftSum += inputList[i]
            val resultPart = abs((sum - leftSum) - leftSum)
            if (i == 0) output = resultPart
            else if (resultPart < output) output = resultPart
        }
        return output
    }
//endregion
}