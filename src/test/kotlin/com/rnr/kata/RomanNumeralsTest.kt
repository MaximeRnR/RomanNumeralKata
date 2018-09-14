package com.rnr.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RomanNumeralsTest {
    private lateinit var romanNumeralTranslator: RomanNumeralTranslator

    @BeforeEach
    fun init(){
        romanNumeralTranslator = RomanNumeralTranslator()
    }

    @Test
    internal fun `return I when Given 1`() {
        assertThat(romanNumeralTranslator of 1).isEqualTo("I")
    }
}
