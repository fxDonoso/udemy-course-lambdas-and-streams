package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleConsumer {
    public static void main(String[] args) {
        Set<Integer> nums       = Set.of(1,2,3,4,5);
        List<Integer> cuadrados = new ArrayList<>();

        //Consumer, no retorna resultado
        nums.forEach(n -> cuadrados.add(n * n));

        System.out.println(nums);
        System.out.println(cuadrados);
        System.out.println(nums);

        // Contra ejemplo con BiConsumer
        Map<Boolean, String> map = Map.of(true,"Esto es verdad", false,"Esto es falso");
        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
