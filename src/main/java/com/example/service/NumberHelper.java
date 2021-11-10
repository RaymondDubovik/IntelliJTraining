package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberHelper {

    /*
    1. Lets write a good old for loop which iterates over number collection and puts even numbers into evenNumbers collection
    Type `numbers.for` and press enter
    Type `evenNumbers.add(number);`
    Position cursor over the evenNumbers.add(number) line and press `option + cmd + T` and choose to surround with if
    Delete the if statement and type `number % 2 == 0.if` and press enter.

    Modify your code to insert square of a number instead a number itself in the collection.

    Place your cursor over for loop. Press `ctrl + enter` and change the loop to functional style.

    2. Position cursor over `Integer.parseInt` method in `parseInt` method.
    Press `option + cmd + T` and choose to surround with try/catch

    Useful live templates and posfix completion (Settings -> Live templates):
    - ifn = if (variable == null)
    - inn = if (variable != null)
    - for = for (Integer number : numbers)
    - fori = for (int i = 0; i < numbers.size(); i++) {
    - if
    */

    public void setup() {
        Collection<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Collection<Integer> evenNumbers = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(evenNumbers);
    }

    public int parseInt() {
        return Integer.parseInt("abc");
    }

}
