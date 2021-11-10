package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BadCodeNeedsRefactor {

    /*
    1. Format the code using `option + cmd + L`. You can also configure to automatically reformat code on commit in IntelliJ commit dialog
    If import auto format on the fly is not set in intelliJ, you can format only imports using `ctrl + option + o`

    2. Rename field `integers` to `elements` in the IntWrapper class. Press `shift + F6`
    Note, that IntelliJ also offers to rename accessors. This also happens with Lombok!

    3. Go to IntWrapper constructor, highlight the `elements.collect(Collectors.toList())` and press `option + cmd + v` and replace both occurrences

    4. Highlight 0.05, use `option + cmd + c` to extract constant and choose `Replace all occurences`

    5. Highlight `int square = integer * integer;` line and press `option + cmd + m` and name method `square`

    6. In method create put cursor on the definition of stream and press `option + cmd + n` to inline the variable.

    7. Notice, how in point 4 word `occurrences` is misspelled, put a cursor on it and press `option + enter` to correct it :)

    Bonus: press `option + enter` on if statement and see offered options.
     */

    public Collection<Double> setup() {
        IntWrapper<Integer> wrapper = create();
        Collection<Double> newNumbers = new ArrayList<>();

        for (Integer integer : wrapper.getIntegers()) {
            double newNumber = 0;
            if (integer % 2 == 0) {
                int square = integer * integer;
                newNumber = 0.05 * square / 2;
            } else if (integer%3 == 0) {
                int square = integer*integer;
                newNumber =  0.05 * square / 3;
            } else if (integer%5==0) {
                int square = integer  *  integer;
                newNumber = 0.05* square /5 ;
            }

            newNumbers.add(newNumber);
        }

        return newNumbers;
    }

    private IntWrapper<Integer> create() {
        Stream<Integer> stream = IntStream.range(0, 10).boxed();
        return new IntWrapper<>(stream);
    }

    private static class IntWrapper<T> {

        private final Collection<T> integers;
        private final int elementCount;

        public IntWrapper(Stream<T> elements) {
            this.integers = elements.collect(Collectors.toList());
            elementCount = elements.collect(Collectors.toList()).size();
        }

        public Collection<T> getIntegers() {
            return integers;
        }

        public int getElementCount() {
            return elementCount;
        }
    }
}
