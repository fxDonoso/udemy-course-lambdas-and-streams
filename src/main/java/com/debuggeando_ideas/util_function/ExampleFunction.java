package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction {

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> add = n -> n + 10;
    static Function<Integer, Integer> addThenMultiply = add.andThen(multiply);
    static Function<Integer, Integer> composeMultiply = add.compose(multiply);

    public static void main(String[] args) {
        System.out.println(multiply.apply(5));
        System.out.println(add.apply(50));
        System.out.println(addThenMultiply.apply(50));
        System.out.println(composeMultiply.apply(50));
    }
}
