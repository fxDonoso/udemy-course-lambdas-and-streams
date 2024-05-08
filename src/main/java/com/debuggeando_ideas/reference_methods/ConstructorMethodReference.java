package com.debuggeando_ideas.reference_methods;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class ConstructorMethodReference {
    public static void main(String[] args) {

        //Instanciación normal:
//        Supplier<MyObjectInt> myObjectIntSupplier = ()-> new MyObjectInt();
        //Via referencia al constructor
        Supplier<MyObjectInt> myObjectIntSupplier = MyObjectInt::new;
        System.out.println(myObjectIntSupplier.get());

    }
}
@ToString
class MyObjectInt {
    private String string;
    private Integer num;

    public MyObjectInt() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }
}
