package com.debuggeando_ideas.reference_methods;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {
    public static void main(String[] args) {
//        BiPredicate<String,String> equals = (s1,s2) -> s1.equals(s2);
        BiPredicate<String,String> equals = String::equals;

        boolean test = equals.test("hello","world");
        System.out.println(test);

        test = equals.test("hello","hello");
        System.out.println(test);
    }
}
