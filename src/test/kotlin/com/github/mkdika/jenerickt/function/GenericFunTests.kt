package com.github.mkdika.jenerickt.function

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class GenericFunTests {
    fun chunkListParams(): Array<Any> = arrayOf(
        arrayOf((1..10).toList(), 3, listOf((1..3).toList(), (4..6).toList(), (7..9).toList(), (10..10).toList())),
        arrayOf(listOf<Int>(), 0, listOf(listOf<Int>())),
        arrayOf((1..10).toList(), 0, listOf((1..10).toList())),
        arrayOf(listOf<Int>(), -1, listOf(listOf<Int>())),
        arrayOf((1..10).toList(), -1, listOf((1..10).toList())),
        arrayOf((1..10).toList(), 11, listOf((1..10).toList())),
        arrayOf((1..10).toList(), 10, listOf((1..10).toList())),
        arrayOf((1..10).toList(), 9, listOf((1..9).toList(), (10..10).toList())),
        arrayOf((1..3).toList(), 1, listOf((1..1).toList(), (2..2).toList(), (3..3).toList())),
        arrayOf(listOf("a", "b", "c"), 1, listOf(listOf("a"), listOf("b"), listOf("c")))
    )

    @Test
    @Parameters(method="chunkListParams")
    fun <T> `exec chunkList with parameters should return expected result`(
        input: List<T>,
        chunkSize: Int,
        expected: List<List<T>>
    ) {
        val actual = input.chunkList(chunkSize)
        assertThat(actual).isEqualTo(expected)
    }
}

