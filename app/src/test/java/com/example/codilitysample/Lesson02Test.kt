package com.example.codilitysample

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertAll

class Lesson02Test {

    private lateinit var lesson02:Lesson02

    @Before
    fun setup(){
        lesson02 = Lesson02()
    }

    @Test
    fun cyclicRotationTest() {
        val inputArrayList = intArrayOf(3, 8, 9, 7, 6)
        val result = lesson02.cyclicRotation(inputArrayList, 3)
        val expectedResult = intArrayOf(9, 7, 6, 3, 8)
        assertArrayEquals(expectedResult, result)
    }

    @Test
    fun findUnpairedNumTest() {
        val inputArrayList = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        assertAll(
            { assertEquals(lesson02.oddOccurrencesInArray(inputArrayList), 7) },
            { assertEquals(lesson02.oddOccurrencesInArray2(inputArrayList), 7) },
            { assertEquals(lesson02.oddOccurrencesInArray3(inputArrayList), 7) })
    }
}