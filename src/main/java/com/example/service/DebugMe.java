package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DebugMe {

    /*
    Put a breakpoint on the first line of the for loop
    By pressing `option + F8` you can call a console where you can execute arbitrary code.
    For example, you can modify value of `i`

    */

    public Collection<Integer> debugMe(List<Integer> numbers) {
        Collection<Integer> squaredNumbers = new ArrayList<>(10000);

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            number = add(i, number);
            squaredNumbers.add(number * number);
        }

        return squaredNumbers;
    }


    private int add(int i, Integer number) {
        if (number == 100) { // imagine that this is way more complex (e.g many internal spring calls)
            throw new IllegalArgumentException("I crash on index " + i + " with a runtime exception :(");
        }

        return i + number;
    }
}
