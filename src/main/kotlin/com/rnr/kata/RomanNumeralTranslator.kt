package com.rnr.kata


class RomanNumeralTranslator {

    infix fun of(number: Int): String {
        if(number == 2 ){
            return "II"
        }
        return "I"
    }
}