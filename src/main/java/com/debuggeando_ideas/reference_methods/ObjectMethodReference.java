package com.debuggeando_ideas.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(10);
        IntStream repeticiones = IntStream.rangeClosed(1, 10);
//        repeticiones.forEach(i -> System.out.println(i));
        repeticiones.forEach(numeros::add);
        System.out.println(numeros);
    }
}
