package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class StringFunTests {

    fun lpadParam(): Array<Any> = arrayOf(
        arrayOf("123", 6, '0', "000123"),
        arrayOf("A", 10, 'X', "XXXXXXXXXA"),
        arrayOf("XYZ", 0, '0', "XYZ"),
        arrayOf("", 4, '0', "0000")
    )


    @Test
    @Parameters(method = "lpadParam")
    fun `given correct args when execute lpad then return correct result`(
        inputStr: String,
        padLen: Int,
        padChar: Char,
        expectedResult: String
    ) {
        val result = inputStr.leftPadding(padLen, padChar)

        assertThat(result).isEqualTo(expectedResult)
    }
}