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

    @Test
    internal fun `return III when Given 3`() {
        assertThat(romanNumeralTranslator of 3).isEqualTo("III")
    }

    @Test
    internal fun `return V when Given 5`() {
        assertThat(romanNumeralTranslator of 5).isEqualTo("V")
    }

    @Test
    internal fun `return IV when Given 4`() {
        assertThat(romanNumeralTranslator of 4).isEqualTo("IV")
    }
}
