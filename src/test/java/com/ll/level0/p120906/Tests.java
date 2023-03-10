package com.ll.level0.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("1234=>10")
    void t1(){
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }
}
