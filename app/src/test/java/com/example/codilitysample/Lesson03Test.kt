package com.example.codilitysample

import org.junit.Assert
import org.junit.Test

class Lesson03Test {

    @Test
    fun frogJmpTest() {
        Assert.assertEquals(frogJmp(10, 85, 30), 3)
    }

    @Test
    fun permMissingElemTest() {
        val array: IntArray = intArrayOf(2, 3, 1, 5)
        Assert.assertEquals(permMissingElem01(array), 4)
        Assert.assertEquals(permMissingElem02(array), 4)
    }

    @Test
    fun tapeEquilibrium() {
        val array: IntArray = intArrayOf(3, 1, 2, 4, 3)
        Assert.assertEquals(tapeEquilibrium01(array), 1)
        Assert.assertEquals(tapeEquilibrium02(array), 1)
    }
}