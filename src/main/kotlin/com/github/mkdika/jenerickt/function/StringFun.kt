package com.github.mkdika.jenerickt.function


fun String.leftPadding(paddingLen: Int, paddingChar: Char): String {
    val spad = StringBuilder()

    (this.length + 1..paddingLen).forEach {
        spad.append(paddingChar)
    }

    spad.append(this)
    return spad.toString()
}
