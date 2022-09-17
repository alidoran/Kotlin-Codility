package com.example.codilitysample

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.assertAll

class Lesson03Test {

    private lateinit var lesson03: Lesson03

    @Before
    fun setup(){
        lesson03 = Lesson03()
    }

    @Test
    fun frogJmpTest() {
        assertEquals(lesson03.frogJmp(10, 85, 30), 3)
    }

    @Test
    fun permMissingElemTest() {

        val array: IntArray = intArrayOf(2, 3, 1, 5)
        assertAll(
            { assertEquals(lesson03.permMissingElem01(array), 4) },
            { assertEquals(lesson03.permMissingElem02(array), 4) }
        )
    }

    @Test
    fun tapeEquilibrium() {
        val array: IntArray = intArrayOf(3, 1, 2, 4, 3)
        assertAll(
            { assertEquals(lesson03.tapeEquilibrium01(array), 1) },
            { assertEquals(lesson03.tapeEquilibrium02(array), 1) }
        )
    }
}