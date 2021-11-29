package com.example.codilitysample

import java.util.*

fun findUnpairedNum(intArray: IntArray): Int {
    //result 55%
    intArray.sort()
    intArray[0]
    for (i in 0..intArray.size step 2)
        if (intArray[i] != intArray[i + 1])
            return intArray[i]
    return 0
}

fun findUnpairedNum2(inputArray: IntArray): Int {
    //result 66%
    val intArray = inputArray.toMutableList()
    while (intArray.size > 0) {
        if (intArray.size == 1)
            return intArray[0]
        val maxIndex = intArray.size - 1
        val mainNum = intArray[0]
        for (searchNumIndex in 1..maxIndex) {
            if (mainNum == intArray[searchNumIndex]) {
                intArray.removeAt(0)
                intArray.removeAt(searchNumIndex - 1)
                break
            }
            if (searchNumIndex == maxIndex)
                return mainNum
        }
    }
    return 0
}

fun findUnpairedNum3(inputArray: IntArray): Int{
    //result 66%
    val intArray = inputArray.toMutableList()
    var a =intArray.groupingBy { i -> i }.eachCount().filter { i -> i.value == 1 }.toList()
    return a.get(0).first
}


fun <T> listRotation(list: Array<T>, rotateNum: Int) {
    val rotateByExtension = list.rotate(rotateNum)
    val directRotate = list.toList().also { Collections.rotate(it, rotateNum) }
}

fun cyclicRotation(A: IntArray, K: Int): IntArray {
    val list = A.toList().also { Collections.rotate(it, K) }
    return list.toIntArray()
}

//Extension
fun <T> Array<T>.rotate(distance: Int) =
    toList().also { // toList() is a deep copy to avoid changing the original array.
        Collections.rotate(it, distance)
    }