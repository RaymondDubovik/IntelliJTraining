package com.example.service;

public class DatabaseEvaluator {

    public void evaluate() {
        /*
        1.
        Here we want to call a `performFullPerformanceEvaluation` method from DatabaseInsertPerformanceEvaluatorService.java like this:
        new DatabaseInsertPerformanceEvaluatorService().performFullPerformanceEvaluation();
        instead of typing whole thing, only first letters of the class name and method name can be typed in capitals.
        Type `DIPES` and it will suggest the class for you.
        Afterwards type `pFPE` to get a suggested method name.

        2.
        In the arguments, we need to provide the LocalDateTime argument. Same approach can be used to call `LocalDateTime.now()` method.
        Type: `LTD.n` and you will get a suggestion by IntelliJ.

        If you remember method name that you need, you can also type method name `now`
        By pressing `ctrl + space (x2)` (hold control and press space twice), IntelliJ will suggest you classes which have this static method

        This also works with abbreviations. E.g type `ctm`, press ` and see what will be offered to you :)

        Press `option + enter` to put the result in a variable.

        This technique is very useful in tests, when you use static imports (e.g assertThat(), is(), nullValue(), etc.)
        */
    }
}
