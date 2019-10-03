package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.*
import org.junit.Test
import org.junit.runner.RunWith

import java.math.BigDecimal

@RunWith(JUnitParamsRunner::class)
class BigDecimalFunTests {
    fun percentOfParams(): Array<Any> = arrayOf(
        arrayOf(BigDecimal(100), BigDecimal(1000), BigDecimal(10.0)),
        arrayOf(BigDecimal(250), BigDecimal(5000), BigDecimal(5.0)),
        arrayOf(BigDecimal(-10), BigDecimal(100), BigDecimal(-10.0))
    )

    @Test
    @Parameters(method="percentOfParams")
    fun `toPercentOf should return expected value`(
        number: BigDecimal,
        input: BigDecimal,
        expected: BigDecimal
    ) {
        val actual = number.toPercentOf(input)
        assertThat(actual).isEqualByComparingTo(expected)
    }

    @Test
    @Parameters(method="percentOfParams")
    fun `toPercentOf should throws IllegalArgumentException`(
        number: BigDecimal,
        input: BigDecimal,
        expected: BigDecimal
    ) {
        assertThatIllegalArgumentException().isThrownBy {
            number.toPercentOf(BigDecimal.ZERO)
        }
    }
}

