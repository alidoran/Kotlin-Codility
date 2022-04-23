package com.example.codilitysample

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.assertAll

class Lesson03Test {

    @Test
    fun frogJmpTest() {
        assertEquals(frogJmp(10, 85, 30), 3)
    }

    @Test
    fun permMissingElemTest() {

        val array: IntArray = intArrayOf(2, 3, 1, 5)
        assertAll(
            { assertEquals(permMissingElem01(array), 4) },
            { assertEquals(permMissingElem02(array), 4) }
        )
    }

    @Test
    fun tapeEquilibrium() {
        val array: IntArray = intArrayOf(3, 1, 2, 4, 3)
        assertAll(
            { assertEquals(tapeEquilibrium01(array), 1) },
            { assertEquals(tapeEquilibrium02(array), 1) }
        )
    }
}