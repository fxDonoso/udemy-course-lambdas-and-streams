package com.debuggeando_ideas.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {
    public static void main(String[] args) {
        BiFunction<String,String,String> normalizerFunc = (a,b)-> a.toUpperCase().concat(b.toLowerCase());
        System.out.println(normalizerFunc.apply("HOLA","Mundo"));

        //En lugar de utilizar una BiFunction con 3 String:
        BinaryOperator<String> normalizer = (a,b)-> a.toUpperCase().concat(b.toLowerCase());

        System.out.println(normalizer.apply("HOLA","Mundo"));
    }
}
