package com.example.codilitysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.ceil
import kotlin.time.Duration.Companion.seconds

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DeleteMeTwo.main()
    }

    object TestPart {
        @JvmStatic
        fun main(args: Array<String>) {
            var array: IntArray = intArrayOf(2,3,4,5,6)
            var b = permMissingElem02(array)
        }
    }
}


fun frogJmp(x: Int, y: Int, d: Int): Int {
    //100% codility
    return ceil((y - x) / d.toDouble()).toInt()
}

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