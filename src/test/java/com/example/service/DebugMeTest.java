package com.example.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class DebugMeTest {

    private final DebugMe debugMe = new DebugMe();

    @Test
    void test() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
        debugMe.debugMe(numbers);
    }

}
