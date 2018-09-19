package com.rnr.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RomanNumeralsTest {


    @Test
    internal fun `return I when Given 1`() {
        assertThat(1.toRoman()).isEqualTo("I")
    }

    @Test
    internal fun `return II when Given 2`() {
        assertThat(2.toRoman()).isEqualTo("II")
    }

    @Test
    internal fun `return III when Given 3`() {
        assertThat((3).toRoman()).isEqualTo("III")
    }

    @Test
    internal fun `return V when Given 5`() {
        assertThat((5).toRoman()).isEqualTo("V")
    }

    @Test
    internal fun `return IV when Given 4`() {
        assertThat((4).toRoman()).isEqualTo("IV")
    }

    @Test
    internal fun `return IX when Given 9`() {
        assertThat((9).toRoman()).isEqualTo("IX")
    }

    @Test
    internal fun `return X when Given 10`() {
        assertThat((10).toRoman()).isEqualTo("X")
    }

    @Test
    internal fun `return VII when Given 7`() {
        assertThat((7).toRoman()).isEqualTo("VII")
    }

    @Test
    internal fun `return VIII when Given 8`() {
        assertThat((8).toRoman()).isEqualTo("VIII")
    }



    @Test
    internal fun `return XI when Given 11`() {
        assertThat((11).toRoman()).isEqualTo("XI")
    }

    @Test
    internal fun `return XII when Given 12`() {
        assertThat((12).toRoman()).isEqualTo("XII")
    }

    @Test
    internal fun `return XV when Given 15`() {
        assertThat((15).toRoman()).isEqualTo("XV")
    }

    @Test
    internal fun `return XVI when Given 16`() {
        assertThat((16).toRoman()).isEqualTo("XVI")
    }

    @Test
    internal fun `return XIX when Given 19`() {
        assertThat((19).toRoman()).isEqualTo("XIX")
    }

    @Test
    internal fun `return XXIX when Given 29`() {
        assertThat((29).toRoman()).isEqualTo("XXIX")
    }

//    @Test
//    internal fun `return XXXV when Given 35`() {
//        assertThat(romanNumeralTranslator of 35).isEqualTo("XXXV")
//    }
}
