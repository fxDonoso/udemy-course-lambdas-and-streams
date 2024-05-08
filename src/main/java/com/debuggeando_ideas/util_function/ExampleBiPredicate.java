package com.debuggeando_ideas.util_function;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {

    static BiPredicate<String, String> myEquals = String::equals;
    static BiPredicate<String, String> myEquals2 = (a, b) -> a.concat(b).equals("HolaMundo");

    public static void main(String[] args) {
        String a = "Hola";
        String b = "Mundo";
        System.out.println(myEquals.test(a, b));
        System.out.println(myEquals2.test(a, b));
    }
}
