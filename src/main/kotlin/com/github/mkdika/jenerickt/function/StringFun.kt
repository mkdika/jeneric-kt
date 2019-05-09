package com.github.mkdika.jenerickt.function

import java.math.BigDecimal

fun String.leftPadding(paddingLen: Int, paddingChar: Char): String {

    return when {
        paddingLen < 0 -> this
        else -> {
            val spad = StringBuilder()

            (this.length + 1..paddingLen).forEach { _ ->
                spad.append(paddingChar)
            }
            spad.append(this)
            spad.toString()
        }
    }
}

fun String.rightPadding(paddingLen: Int, paddingChar: Char): String {

    return when {
        paddingLen < 0 -> this
        else -> {
            val spad = StringBuilder().append(this)

            (this.length + 1..paddingLen).forEach { _ ->
                spad.append(paddingChar)
            }
            spad.toString()
        }
    }
}

fun String.leftSubstring(subLen: Int): String {

    return when {
        subLen < 1 -> ""
        subLen > this.length -> this
        else -> {
            this.substring(0, subLen)
        }
    }
}

fun String.maskify(length: Int, char: Char='*'): String =
    when {
        length >= 0 -> this.take(length).map{ char }.joinToString(separator="") + this.drop(length)
        else -> this
    }
