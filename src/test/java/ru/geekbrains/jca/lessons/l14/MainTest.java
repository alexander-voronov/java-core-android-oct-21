package ru.geekbrains.jca.lessons.l14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainTest {
    @ParameterizedTest
    @MethodSource("fillFourArray")
    void fourArray(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, Main.fourArray(in));
    }

    static Stream<Arguments> fillFourArray() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}));
        list.add(Arguments.arguments(new int[]{4}, new int[]{}));
        return list.stream();
    }

    @Test
    void fourArray() {
        Assertions.assertThrows(RuntimeException.class, () -> Main.fourArray(new int[]{1, 2, 54, 5}));
    }

    @Test
    void checkArray() {
        Assertions.assertTrue(Main.checkArray(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
        Assertions.assertFalse(Main.checkArray(new int[]{1, 1, 1, 1, 1, 1}));
        Assertions.assertFalse(Main.checkArray(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}