package com.example.codilitysample

fun add5ByMinimumForm(inputNumber: Int): Int {
    //Add 5 to input number such that new number be the minimum number
    var text = inputNumber.toString()
    var isPositive = inputNumber >= 0
    if (!isPositive)
        text = Math.abs(inputNumber).toString();
    for (i in 0..text.length - 1) {
        if ((isPositive && text.get(i).toString().toInt() <= 5) || (!isPositive && text.get(i)
                .toInt() >= 5)
        ) {
            return ((if (isPositive) "" else "-") + text.substring(
                0,
                i
            ) + "5" + text.substring(i)).toInt()
        }
    }
    return (inputNumber.toString() + "5").toInt();
}

fun zeroSequence(A: IntArray): Int {
    //sequence with 0 sum
    var result = 0
    for (i in 0..A.size - 1) {
        var sum = 0
        for (j in i..A.size - 1) {
            sum += A.get(j)
            if (sum == 0) {
                result++
                if (result > 1000000000)
                    return -1
            }
        }
    }
    return result
}
