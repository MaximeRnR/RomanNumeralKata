package com.rnr.kata

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AcceptanceTest{

    @Test
    internal fun `return MCMLXXXIX when given 1989`() {
        Assertions.assertThat(1989.toRoman()).isEqualTo("MCMLXXXIX")
    }
}