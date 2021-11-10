package com.example.service;

import java.util.Collection;
import java.util.List;

public class MethodHelper {

    private final LotsOfMethodsHere helper = new LotsOfMethodsHere();

    public void numbers() {
        Collection<Integer> integers = List.of(10, 15, 20);

        for (Integer integer : integers) {
            if (helper.isEven(integer)) {
                System.out.println("Integer " + integer + " is even!");
            } else {
                System.out.println("Integer " + integer + " is odd! Square + " + helper.square(integer));
            }
        }
    }
}
