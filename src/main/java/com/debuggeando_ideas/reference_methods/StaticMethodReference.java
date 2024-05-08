package com.debuggeando_ideas.reference_methods;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReference {

    public static void main(String[] args) {
        //Uso directo
        System.out.println(UUID.randomUUID());

        //Exprecion Lambda
//        Supplier<UUID> getToken = () -> UUID.randomUUID();
        //Metodo referenciado
        Supplier<UUID> getToken = UUID::randomUUID;
        System.out.println(getToken.get());
    }
}
