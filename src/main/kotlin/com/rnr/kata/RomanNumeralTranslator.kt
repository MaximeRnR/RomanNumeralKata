package com.rnr.kata


val symbols = mapOf(
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I"))

fun Int.toRoman(): String {
    return symbols
            .filter { this >= it.key }
            .map { it.value + (this - it.key).toRoman()  }
            .firstOrNull()
            ?: ""
}
