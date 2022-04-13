package com.example.codilitysample

import kotlin.math.abs
import kotlin.math.ceil

fun main() {
    Lesson03().callTapeEquilibrium()
}

class Lesson03 {
    private fun frogJmp(x: Int, y: Int, d: Int): Int {
        //100% codility
        return ceil((y - x) / d.toDouble()).toInt()
    }

    fun callMissingElem() {
        var array: IntArray = intArrayOf(2, 3, 4, 5, 6)
        var b = permMissingElem02(array)
    }

    private fun permMissingElem01(array: IntArray): Int {
        //50% codility
        array.sort()
        array.forEachIndexed { index, i -> if (i - 1 != index) return index + 1 }
        return 0
    }

    private fun permMissingElem02(array: IntArray): Int {
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

    fun callTapeEquilibrium() {
        val inputArrList = ArrayList<Int>(arrayListOf(3, 1, 2, 4, 3))
        println(tapeEquilibrium03(inputArrList))
    }

    private fun tapeEquilibrium(inputList: ArrayList<Int>): Int {
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

    private fun tapeEquilibrium02(inputList: ArrayList<Int>): Int {
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

    private fun tapeEquilibrium03(inputList: ArrayList<Int>): Int {
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
}