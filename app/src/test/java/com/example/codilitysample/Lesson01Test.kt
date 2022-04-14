package com.example.codilitysample

import org.junit.Assert
import org.junit.Test

class Lesson01Test {
@Test
fun binaryGapCountTest(){
    var methodResult = binaryGapCount(1041)
    Assert.assertEquals(methodResult,5)
    methodResult = binaryGapCount(1)
    Assert.assertEquals(methodResult,0)
}
}