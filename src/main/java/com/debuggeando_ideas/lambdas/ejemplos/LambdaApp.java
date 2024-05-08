package com.debuggeando_ideas.lambdas.ejemplos;

import com.debuggeando_ideas.lambdas.Math;

import java.util.List;

public class LambdaApp {

    public static void main(String[] args) {

//        Ejemplo de clase anonima que implementa una interfaz funcional
        Math substract = new Math() {
            @Override
            public Double excecute(Double a, Double b) {
                return a - b;
            }
        };

        System.out.println(substract.excecute(10.0,5.0));

//        Ejemplo de uso de lambdas
        Math multiply = (a, b) -> a * b;
        System.out.println(multiply.excecute(10.0,5.0));

        Math divide = (a, b) -> a / b;
        System.out.println(divide.excecute(10.0,5.0));

//Ciclo for en expreciones lambda
        List<String> paises = List.of("Chile", "China", "France", "Germany");

//        Ciclo for normal:
        System.out.println("for normal:");
        for (String pais : paises) {
            System.out.println(pais);
        }
        System.out.println("forEach en expreción lambda:");
        paises.forEach(System.out::println);

    }
}
