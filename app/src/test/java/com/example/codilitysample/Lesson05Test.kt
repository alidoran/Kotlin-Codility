package com.example.codilitysample

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertAll

class Lesson05Test {

    private lateinit var lesson05 : Lesson05

    @Before
    fun setup(){
        lesson05 = Lesson05()
    }

    @Test
    fun `passingCars test`() {
        val list = intArrayOf(0, 1, 0, 1, 1)
        val result = lesson05.passingCars(list)
        assertEquals(5, result)
    }

    @Test
    fun `count divs01 test`() {
        val a = 6
        val b = 11
        val k = 2
        val result01 = lesson05.countDiv01(a, b, k)
        val result02 = lesson05.countDiv02(a, b, k)
        val result03 = lesson05.countDiv03(a, b, k)
        val result04 = lesson05.countDiv04(a, b, k)
        assertAll("Count Dives",
        { assertEquals(3, result01)},
        { assertEquals(3, result02)},
        { assertEquals(3, result03)},
        { assertEquals(3, result04)},
        )
    }

    @Test
    fun `genomic range query test`(){
        val inputString= "CAGCCTA"
        val list01 = intArrayOf(2,5,0)
        val list02 = intArrayOf(4,5,6)
        val expectedResult = intArrayOf(2,4,1)
        val result01 = lesson05.genomicRangeQuery01(inputString, list01, list02)
        val result02 = lesson05.genomicRangeQuery02(inputString, list01, list02)
        val result03 = lesson05.genomicRangeQuery03(inputString, list01, list02)
        val result04 = lesson05.genomicRangeQuery04(inputString, list01, list02)
        assertAll("GenomicRangeQuery",
        { assertArrayEquals(expectedResult, result01) },
        { assertArrayEquals(expectedResult, result02)},
        { assertArrayEquals(expectedResult, result03)},
        { assertArrayEquals(expectedResult, result04)},
        )
    }

    @Test
    fun `min avg two slice test`(){
        val list = intArrayOf(4,2,2,5,1,5,8)
        val result = lesson05.minAvgTwoSlice(list)
        assertEquals(1, result)
    }
}