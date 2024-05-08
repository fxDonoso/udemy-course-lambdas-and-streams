package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    static Predicate<Integer> isGreaterThan100 = n -> n > 100;
    static Predicate<Integer> isLessThan10 = n -> n < 10;
    static Predicate<Integer> isBetween10and100 =  isGreaterThan100.or(isLessThan10);

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,40,50,60,700,800,900));

//        numeros.removeIf(n -> n > 100);
        numeros.removeIf(isBetween10and100.negate());
        System.out.println(numeros);
    }
}
