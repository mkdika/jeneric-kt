package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class StringFunTests {

    fun lpadParams(): Array<Any> = arrayOf(
        arrayOf("123", 6, '0', "000123"),
        arrayOf("ABC", 3, '0', "ABC"),
        arrayOf("A", 10, 'X', "XXXXXXXXXA"),
        arrayOf("XYZ", 0, '0', "XYZ"),
        arrayOf("", 4, '0', "0000"),
        arrayOf("12345", 3, '0', "12345"),
        arrayOf("XYZ", -1, '0', "XYZ"),
        arrayOf("X", 1, '0', "X")
    )

    @Test
    @Parameters(method = "lpadParams")
    fun `exec LeftPadding with correct args then return expected result`(
        inputStr: String,
        padLen: Int,
        padChar: Char,
        expectedResult: String
    ) {
        val actualResult = inputStr.leftPadding(padLen, padChar)

        assertThat(actualResult)
            .isNotNull()
            .isNotEmpty()
            .isEqualTo(expectedResult)
    }

    fun rpadParams(): Array<Any> = arrayOf(
        arrayOf("123", 6, '0', "123000"),
        arrayOf("ABC", 3, '0', "ABC"),
        arrayOf("A", 10, 'X', "AXXXXXXXXX"),
        arrayOf("XYZ", 0, '0', "XYZ"),
        arrayOf("", 4, '0', "0000"),
        arrayOf("12345", 3, '0', "12345"),
        arrayOf("XYZ", -1, '0', "XYZ"),
        arrayOf("X", 1, '0', "X")
    )

    @Test
    @Parameters(method = "rpadParams")
    fun `exec RightPadding with correct args then return expected result`(
        inputStr: String,
        padLen: Int,
        padChar: Char,
        expectedResult: String
    ) {
        val actualResult = inputStr.rightPadding(padLen, padChar)

        assertThat(actualResult)
            .isNotNull()
            .isNotEmpty()
            .isEqualTo(expectedResult)
    }

    fun leftSubstringParams(): Array<Any> = arrayOf(
        arrayOf("apple", -1, ""),
        arrayOf("apple", 0, ""),
        arrayOf("apple", 1, "a"),
        arrayOf("apple", 3, "app"),
        arrayOf("apple", 5, "apple"),
        arrayOf("apple", 6, "apple"),
        arrayOf("apple", 10, "apple"),
        arrayOf("", -1, ""),
        arrayOf("", 0, ""),
        arrayOf("", 5, "")
    )

    @Test
    @Parameters(method = "leftSubstringParams")
    fun `exec leftSubstring with args then return expected result`(
        inputStr: String,
        subLen: Int,
        expectedResult: String
    ) {
        val actualResult = inputStr.leftSubstring(subLen = subLen)

        assertThat(actualResult)
            .isNotNull()
            .isEqualTo(expectedResult)
    }

    fun maskifyParams(): Array<Any> = arrayOf(
        arrayOf("apple & a", -1, "apple & a"),
        arrayOf("apple & a", 0, "apple & a"),
        arrayOf("apple & a", 1, "*pple & a"),
        arrayOf("apple & a", 3, "***le & a"),
        arrayOf("apple & a", 5, "***** & a"),
        arrayOf("apple & a", 6, "******& a"),
        arrayOf("apple & a", 10, "*********")
    )

    @Test
    @Parameters(method="maskifyParams")
    fun `maskify with negative length should throws IllegalArgumentException`(
        input: String,
        length: Int,
        expected: String
    ) {
        val actual = input.maskify(length)

        assertThat(actual)
            .isEqualTo(expected)
    }

    fun palindromeParams(): Array<Any> = arrayOf(
        arrayOf("able was I ere I saw elba", true),
        arrayOf("aa", true),
        arrayOf("a", true),
        arrayOf("", true),
        arrayOf("avid siva", false)
    )

    @Test
    @Parameters(method="palindromeParams")
    fun `isPalindrome should return expected values`(
        input: String,
        expected: Boolean
    ) {
        val actual = input.isPalindrome()

        assertThat(actual).isEqualTo(expected)
    }
}
