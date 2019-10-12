package com.github.mkdika.jenerickt.function

fun <T> List<T>.chunkList(chunkSize: Int): List<List<T>> =
    when {
        chunkSize <= 0 -> listOf(this)
        chunkSize >= this.size -> listOf(this)
        else -> {
            val chunks = mutableListOf<List<T>>()
            val chunkCount = this.size/chunkSize
            val leftOver = this.size - (chunkCount * chunkSize)
            for (i in 0 until chunkCount) {
                val from = i * chunkSize
                val to = from + chunkSize
                val items = this.subList(from, to)
                chunks.add(items)
            }
            if (leftOver > 0) {
                chunks.add(this.subList(this.size-leftOver, this.size))
            }
            chunks.toList()
        }
    }
