package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {
    public static void main(String[] args) {

        Printer<String> printString = string -> System.out.println(string);

        printString.print("Hello World");

        Printer<Product> printProduct = product -> System.out.println(product);

        printProduct.print(new Product());

        Product miProduct = new Product();
        miProduct.setId(1234L);
        miProduct.setName("Mi Product");
        miProduct.setPrice(20.0);
        printProduct.print(miProduct);
    }
}
