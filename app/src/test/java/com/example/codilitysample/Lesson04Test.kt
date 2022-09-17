package com.example.codilitysample

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.assertAll

class Lesson04Test {

    private lateinit var lesson04:Lesson04

    @Before
    fun setup(){
        lesson04 = Lesson04()
    }

    @Test
    fun frogRiverOneTest() {
        val intArray = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)
        Assert.assertEquals(lesson04.frogRiverOne(5, intArray), 6)
    }

    @Test
    fun permCheckTest() {
        val arrayList01 = intArrayOf(4, 1, 3, 2)
        val arrayList02 = intArrayOf(4, 1, 3)
        assertAll()
        assertAll(
            { Assert.assertEquals(lesson04.permCheck01(arrayList01), 1) },
            { Assert.assertEquals(lesson04.permCheck02(arrayList01), 1) },
            { Assert.assertEquals(lesson04.permCheck01(arrayList02), 0) },
            { Assert.assertEquals(lesson04.permCheck02(arrayList02), 0) }
        )
    }

    @Test
    fun maxCounterTest() {
        val inputArray = intArrayOf(3, 4, 4, 6, 1, 4, 4)
        Assert.assertArrayEquals(lesson04.maxCounter(5, inputArray), intArrayOf(3, 2, 2, 4, 2))
    }

    @Test
    fun missingIntegerTest() {
        val arrayList01 = intArrayOf(4, 1, 3, 2)
        val arrayList02 = intArrayOf(1, 2, 3)
        val arrayList03 = intArrayOf(-1, -3)
        assertAll(
            { Assert.assertEquals(lesson04.missingInteger01(arrayList01), 5) },
            { Assert.assertEquals(lesson04.missingInteger02(arrayList01), 5) },
            { Assert.assertEquals(lesson04.missingInteger01(arrayList02), 4) },
            { Assert.assertEquals(lesson04.missingInteger02(arrayList02), 4) },
            { Assert.assertEquals(lesson04.missingInteger01(arrayList03), 1) },
            { Assert.assertEquals(lesson04.missingInteger02(arrayList03), 1) }
        )
    }
}