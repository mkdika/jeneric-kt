package com.github.mkdika.jenerickt.function

import java.lang.IllegalArgumentException
import java.math.BigDecimal

fun BigDecimal.toPercentOf(number: BigDecimal): BigDecimal =
    when (number) {
        BigDecimal.ZERO -> throw IllegalArgumentException("number should not 0.0")
        else -> this.divide(number).times(BigDecimal(100))
    }
