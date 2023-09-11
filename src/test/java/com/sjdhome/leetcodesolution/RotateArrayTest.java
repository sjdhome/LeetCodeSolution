package com.sjdhome.leetcodesolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class RotateArrayTest {
    static RotateArray rotateArray;

    @BeforeAll
    static void init() {
        rotateArray = new RotateArray();
    }

    @ParameterizedTest
    @MethodSource
    void test(int[] input, int k, int[] result) {
        rotateArray.rotate(input, k);
        Assertions.assertArrayEquals(input, result);
    }

    static List<Arguments> test() {
        return List.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                Arguments.of(new int[]{1}, 0, new int[]{1}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{2, 1})
        );
    }
}
