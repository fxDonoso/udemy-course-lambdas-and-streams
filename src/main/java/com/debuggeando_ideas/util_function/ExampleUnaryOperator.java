package com.debuggeando_ideas.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {
//    static Function<String,String> funUpper = s -> s.toUpperCase();
    static Function<String,String> funUpper = String::toUpperCase;

    static UnaryOperator<String> unaryToUpper = String::toUpperCase;

    static UnaryOperator<Integer> int1 = n -> n * n;
    static IntUnaryOperator int2 = n -> n * n;

    public static void main(String[] args) {
        String arg = "lanbda";
        System.out.println(funUpper.apply(arg));
        System.out.println(unaryToUpper.apply(arg));

        System.out.println(int1.apply(2));
        System.out.println(int2.applyAsInt(5));
    }
}
