package com.rnr.kata


class RomanNumeralTranslator {

    infix fun of(number: Int): String {
        if (number > 3) {
            val delta = 5 - number;
            return "I".repeat(delta).plus("V")
        }
        return "I".repeat(number);
    }
}