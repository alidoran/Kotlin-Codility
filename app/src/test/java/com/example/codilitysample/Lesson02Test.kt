package com.example.codilitysample

import org.junit.Assert
import org.junit.Test

class Lesson02Test {
    @Test
    fun cyclicRotationTest(){
        val inputArrayList = intArrayOf(3, 8, 9, 7, 6)
        val result = cyclicRotation(inputArrayList, 3)
        val expectedResult =  ArrayList(arrayListOf(9, 7, 6, 3, 8))
        Assert.assertEquals(result ,expectedResult)
    }

    @Test
    fun findUnpairedNumTest(){
        val inputArrayList = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        Assert.assertEquals(oddOccurrencesInArray(inputArrayList), 7)
        Assert.assertEquals(oddOccurrencesInArray2(inputArrayList) , 7)
        Assert.assertEquals(oddOccurrencesInArray3(inputArrayList) , 7)

    }
}