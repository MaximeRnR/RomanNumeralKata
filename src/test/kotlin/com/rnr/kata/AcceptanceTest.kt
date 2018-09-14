package com.rnr.kata

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AcceptanceTest{

    @Test
    internal fun `return MCMLXXXIX when given 1989`() {
        val romanNumeral = RomanNumeralTranslator()
        Assertions.assertThat(romanNumeral of 1989).isEqualTo("MCMLXXXIX")
    }
}