package com.example.codilitysample

import org.junit.Assert
import org.junit.Test

class Lesson04Test {
    @Test
    fun frogRiverOneTest(){
        val intArray = intArrayOf(1,3,1,4,2,3,5,4)
        Assert.assertEquals(frogRiverOne(5,intArray), 6)
    }
}