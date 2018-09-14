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

    @Test
    internal fun `return IX when Given 9`() {
        assertThat(romanNumeralTranslator of 9).isEqualTo("IX")
    }

    @Test
    internal fun `return X when Given 10`() {
        assertThat(romanNumeralTranslator of 10).isEqualTo("X")
    }

    @Test
    internal fun `return VII when Given 7`() {
        assertThat(romanNumeralTranslator of 7).isEqualTo("VII")
    }

    @Test
    internal fun `return XI when Given 11`() {
        assertThat(romanNumeralTranslator of 11).isEqualTo("XI")
    }

    @Test
    internal fun `return XII when Given 12`() {
        assertThat(romanNumeralTranslator of 12).isEqualTo("XII")
    }

    @Test
    internal fun `return XV when Given 15`() {
        assertThat(romanNumeralTranslator of 15).isEqualTo("XV")
    }

    @Test
    internal fun `return XVI when Given 16`() {
        assertThat(romanNumeralTranslator of 16).isEqualTo("XVI")
    }

    @Test
    internal fun `return XIX when Given 19`() {
        assertThat(romanNumeralTranslator of 19).isEqualTo("XIX")
    }

    @Test
    internal fun `return XXIX when Given 29`() {
        assertThat(romanNumeralTranslator of 29).isEqualTo("XXIX")
    }

//    @Test
//    internal fun `return XXXV when Given 35`() {
//        assertThat(romanNumeralTranslator of 35).isEqualTo("XXXV")
//    }
}
