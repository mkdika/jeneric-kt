package com.github.mkdika.jenerickt.function

import java.lang.IllegalArgumentException
import java.time.LocalDateTime

class DateRange(from: LocalDateTime, to: LocalDateTime) {
    val from = from
    val to = to
    init {
        if (from > to) {
            throw IllegalArgumentException("from date must be <= to date")
        }
    }
    fun isOverlapsWith(date: DateRange): Boolean =
        (this.from >= date.from && this.from <= date.to) || (this.to >= date.from && this.to <= date.to)
}
