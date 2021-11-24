package com.example.codilitysample

fun factorial(inputNumbers: Int): Int {
    var i = 1
    for (num in inputNumbers downTo 1)
        i *= num
    return i
}

fun typeStar(starCount: Int) {
    for (star in 1..starCount) {
        for (starPrint in 1..star) {
            print('*')
        }
        print("\n")
    }
}

fun typeStarSymmetricalUpToDown(starCount: Int) {
    var spaceCount = 0
    for (star in starCount downTo 1 step 2) {
        for (space in 0..spaceCount)
            print(' ')
        for (starPrint in 1..star)
            print('*')
        spaceCount++
        print("\n")
    }
}

fun fibonacci(limitedNumber: Int) {
    var a = 0
    var b = 1
    while (b < limitedNumber) {
        print("$b ")
        b += a
        a = b - a
    }
}

fun printWeekDays() {
    var days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in days)
        println(day)
}

class BinaryGap {

    private fun numToBinary(num: Double): String {
        var inputNum = num
        var binaryNum = ""
        while (inputNum > 1) {
            binaryNum += inputNum % 2
            inputNum /= 2
        }
        binaryNum += inputNum
        return binaryNum.reversed()
    }

    fun binaryGapCount(num: Int): Int {
        var binaryNum = Integer.toBinaryString(num)
        val regex = "(?<=1)(0+)(?=1)".toRegex()
        val c = regex.findAll(binaryNum).count()
        return c
    }

    fun binaryGapMax(num: Int): Int {
        var binaryNum = Integer.toBinaryString(num)
        val regex = "(?<=1)(0+)(?=1)".toRegex()
        val d = regex.findAll(binaryNum).toList()

        var max = 0
        for (list in d) {
            var size = list.value.length
            if (size > max)
                max = size
        }
        return max
    }

    fun binaryGapMaxConcise(num: Int){
        num.toString(2)
            .trimEnd { it == '0' }
            .split("1")
            .map { it.length }
            .maxOrNull() ?:0
    }
}