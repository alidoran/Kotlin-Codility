package com.example.codilitysample

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Lesson01Test {

    private lateinit var lesson01:Lesson01

    @Before
    fun setup(){
        lesson01 = Lesson01()
    }

@Test
fun binaryGapCountTest(){
    var methodResult = lesson01.binaryGapCount(1041)
    Assert.assertEquals(methodResult,5)
    methodResult = lesson01.binaryGapCount(1)
    Assert.assertEquals(methodResult,0)
}
}