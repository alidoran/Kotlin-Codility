package com.example.codilitysample

import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.assertAll

class Lesson04Test {
    @Test
    fun frogRiverOneTest() {
        val intArray = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)
        Assert.assertEquals(frogRiverOne(5, intArray), 6)
    }

    @Test
    fun permCheckTest() {
        val arrayList01 = intArrayOf(4, 1, 3, 2)
        val arrayList02 = intArrayOf(4, 1, 3)
        assertAll()
        assertAll(
            { Assert.assertEquals(permCheck01(arrayList01), 1) },
            { Assert.assertEquals(permCheck02(arrayList01), 1) },
            { Assert.assertEquals(permCheck01(arrayList02), 0) },
            { Assert.assertEquals(permCheck02(arrayList02), 0) }
        )
    }

    @Test
    fun maxCounterTest() {
        val inputArray = intArrayOf(3, 4, 4, 6, 1, 4, 4)
        Assert.assertArrayEquals(maxCounter(5, inputArray), intArrayOf(3, 2, 2, 4, 2))
    }

    @Test
    fun missingIntegerTest() {
        val arrayList01 = intArrayOf(4, 1, 3, 2)
        val arrayList02 = intArrayOf(1, 2, 3)
        val arrayList03 = intArrayOf(-1, -3)
        assertAll(
            { Assert.assertEquals(missingInteger01(arrayList01), 5) },
            { Assert.assertEquals(missingInteger02(arrayList01), 5) },
            { Assert.assertEquals(missingInteger01(arrayList02), 4) },
            { Assert.assertEquals(missingInteger02(arrayList02), 4) },
            { Assert.assertEquals(missingInteger01(arrayList03), 1) },
            { Assert.assertEquals(missingInteger02(arrayList03), 1) }
        )
    }
}