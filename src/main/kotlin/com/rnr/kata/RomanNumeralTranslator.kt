package com.rnr.kata

import kotlin.math.abs


class RomanNumeralTranslator {

    private val ONE_SYMBOL = "I"
    private val FIVE_SYMBOL = "V"
    private val TEN_SYMBOL = "X"

    private val LIMIT_SUBSTRACT_TIMES = 2

    private val LIMIT_REPEAT_TIME = 3

    infix fun of(number: Int): String {
        var result = ""
        var numberToProcess = number
        if (number > 20 - LIMIT_SUBSTRACT_TIMES) {
            result = "X".repeat(numberToProcess / 10)
            numberToProcess -= (numberToProcess / 10) * 10
        }
        var delta: Int
        if (numberToProcess > LIMIT_REPEAT_TIME) {
            if (number >= 10 - LIMIT_SUBSTRACT_TIMES) {
                delta = numberToProcess - 10
                if (delta == -1) {
                    return result + concatOneSymbol(abs(delta)).plus(TEN_SYMBOL)
                }
                if (delta >= 5) {
                    return result + TEN_SYMBOL.plus(oneAfterFive(delta))
                }
                return result + TEN_SYMBOL.plus(concatOneSymbol(delta))
            }

            if (numberToProcess < 10 && numberToProcess >= 5 - LIMIT_SUBSTRACT_TIMES) {
                delta = numberToProcess - 5
                if (delta == -1) {
                    return result + concatOneSymbol(abs(delta)).plus(FIVE_SYMBOL)
                }
                return result + FIVE_SYMBOL.plus(concatOneSymbol(delta))
            }
        }
        return result + concatOneSymbol(numberToProcess)
    }

    private fun oneAfterFive(number: Int): String {
        val delta = number - 5
        return FIVE_SYMBOL.plus(concatOneSymbol(delta))
    }

    private fun concatOneSymbol(numberToProcess: Int) = ONE_SYMBOL.repeat(numberToProcess)

}