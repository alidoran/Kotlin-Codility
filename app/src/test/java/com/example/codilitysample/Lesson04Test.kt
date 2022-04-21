package com.example.codilitysample

import org.junit.Assert
import org.junit.Test

class Lesson04Test {
    @Test
    fun frogRiverOneTest(){
        val intArray = intArrayOf(1,3,1,4,2,3,5,4)
        Assert.assertEquals(frogRiverOne(5,intArray), 6)
    }

    @Test
    fun permCheckTest(){
        var arrayList = intArrayOf(4,1,3,2)
        Assert.assertEquals(permCheck01(arrayList),1)
        Assert.assertEquals(permCheck02(arrayList),1)
        arrayList = intArrayOf(4,1,3)
        Assert.assertEquals(permCheck01(arrayList),0)
        Assert.assertEquals(permCheck02(arrayList),0)
    }

    @Test
    fun maxCounterTest(){
        val inputArray = intArrayOf(3,4,4,6,1,4,4)
        Assert.assertArrayEquals(maxCounter(5, inputArray), intArrayOf(3,2,2,4,2))
    }
}