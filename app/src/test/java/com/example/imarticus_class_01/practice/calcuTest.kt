package com.example.imarticus_class_01.practice

import junit.framework.TestCase

class calcuTest : TestCase() {
lateinit var og:Calcu
    override fun setUp() {
        super.setUp()
        og=Calcu(0 , 2)
    }

    fun testAdd() {
        val a=312f
        val b=og.add(300,12)
        assertEquals(a,b)
    }
    fun testMultiply(){
        val a=60
        val b=og.multiply(30,2)
        assertEquals(a,b)
    }
    override fun tearDown() {
        super.tearDown()
    }
}