package com.github.mkdika.jenerickt.function

fun String.leftPadding(paddingLen: Int, paddingChar: Char): String {

    return when {
        paddingLen > -1 -> {
            val spad = StringBuilder()

            (this.length + 1..paddingLen).forEach { _ ->
                spad.append(paddingChar)
            }
            spad.append(this)
            return spad.toString()
        }
        else -> this
    }
}

fun String.rightPadding(paddingLen: Int, paddingChar: Char): String {

    return when {
        paddingLen > -1 -> {
            val spad = StringBuilder().append(this)

            (this.length + 1..paddingLen).forEach { _ ->
                spad.append(paddingChar)
            }
            return spad.toString()
        }
        else -> this
    }
}
