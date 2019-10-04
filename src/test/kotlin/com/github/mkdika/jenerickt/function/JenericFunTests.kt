package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.Test
import org.junit.runner.RunWith
import java.time.LocalDateTime
import java.util.*

@RunWith(JUnitParamsRunner::class)
class JenericFunTests {
    fun dateRangeOverlapsParams(): Array<Any> = arrayOf(
        arrayOf(DateRange(LocalDateTime.of(2018,1, 9, 10, 30, 45),
            LocalDateTime.of(2018, 1, 10, 10, 30, 45)),
            DateRange(LocalDateTime.of(2018, 1, 10, 10, 30, 45),
                LocalDateTime.of(2018, 1, 20, 10, 30, 45)),
            true)
    )

    @Test
    @Parameters(method="dateRangeOverlapsParams")
    fun `exec isOverlapsWith should return expected value`(range1: DateRange, range2: DateRange, expected: Boolean) {
        val actual = range1.isOverlapsWith(range2)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `exec initialization should throws IllegalArgumentException`() {
        assertThatIllegalArgumentException().isThrownBy {
            DateRange(
                LocalDateTime.of(2018, 1, 10, 10, 30, 45),
                LocalDateTime.of(2018, 1, 9, 10, 30, 45)
            )
        }
    }
}

