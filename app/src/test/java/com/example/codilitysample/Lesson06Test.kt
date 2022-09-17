package com.example.codilitysample

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Lesson06Test {

    private lateinit var lesson06:Lesson06

    @Before
    fun setup(){
        lesson06 = Lesson06()
    }

    @Test
    fun `distinct 01 test`() {
        val list = intArrayOf(2, 1, 1, 2, 3, 1)
        val result = lesson06.distinct(list)
        assertEquals(3 , result)
    }

    @Test
    fun `maxProductOfThree test`(){
        val list = intArrayOf(-3, 1, 2, -2, 5, 6)
        val result = lesson06.maxProductOfThree(list)
        assertEquals(60, result)
    }

    @Test
    fun `maxProductOfThree three number inputtest`(){
        val list = intArrayOf(-10, -2, -4)
        val result = lesson06.maxProductOfThree(list)
        assertEquals(-80, result)
    }
}