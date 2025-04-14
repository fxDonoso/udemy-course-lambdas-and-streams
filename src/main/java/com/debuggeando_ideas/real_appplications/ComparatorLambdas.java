package com.debuggeando_ideas.real_appplications;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public static void main(String[] args) {

        //Ejemplo
        List<Integer> numeros = Arrays.asList(1,5,2,7,2,8,4,8,9,3,5,6,1,3,10);
        numeros.sort((a,b)->a-b);
        numeros.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Max","Alex","Opal");
//        nombres.sort((a,b)->a.compareTo(b));
        //Lo mismo pero usando Mètodo Referencciado
        nombres.sort(String::compareTo);
        System.out.println(nombres);

        //Invertir el orden:
        nombres.sort(Comparator.reverseOrder());
        System.out.println(nombres);

        //Invertir listas de Objetos complejos:
        List<Person> persons = Arrays.asList(
                new Person("Max",40),
                new Person("Ben",50),
                new Person("Alex",50),
                new Person("Opal",30));
        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));

        System.out.println(persons);
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}
