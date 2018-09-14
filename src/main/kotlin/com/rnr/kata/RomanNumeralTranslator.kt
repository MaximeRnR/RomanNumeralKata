package com.rnr.kata


class RomanNumeralTranslator {

    private val ONE_SYMBOL = "I"
    private val FIVE_SYMBOL = "V"
    private val TEN_SYMBOL = "X"

    private val LIMIT_SUBSTRACT_TIMES = 2

    private val LIMIT_REPEAT_TIME = 3

    infix fun of(number: Int): String {
        if (number > LIMIT_REPEAT_TIME) {
            if(number > 5){
                if(number <= 10 - LIMIT_SUBSTRACT_TIMES){
                    val delta = number - 5
                    return FIVE_SYMBOL.plus(ONE_SYMBOL.repeat(delta))
                }
                val delta = 10 - number
                return ONE_SYMBOL.repeat(delta).plus(TEN_SYMBOL)
            }
            val delta = 5 - number;
            return ONE_SYMBOL.repeat(delta).plus(FIVE_SYMBOL)
        }
        return ONE_SYMBOL.repeat(number);
    }

}