package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class DoubleFunTests {
    fun hasFractionalPartParams(): Array<Any> = arrayOf(
        arrayOf(15.7, true),
        arrayOf(15.0000007, true),
        arrayOf(15.0, false)
    )

    @Test
    @Parameters(method="hasFractionalPartParams")
    fun `exec hasFractionalPart will return correct result`(input: Double, expected: Boolean) {
        val actual = input.hasFractionalPart()
        assertThat(actual).isEqualTo(expected)
    }
}

