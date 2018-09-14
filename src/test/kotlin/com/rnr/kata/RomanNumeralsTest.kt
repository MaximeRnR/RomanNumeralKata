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

    @Test
    internal fun `return II when Given 2`() {
        assertThat(romanNumeralTranslator of 2).isEqualTo("II")
    }
}
