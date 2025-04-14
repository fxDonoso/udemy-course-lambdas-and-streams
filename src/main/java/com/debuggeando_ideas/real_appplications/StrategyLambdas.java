package com.debuggeando_ideas.real_appplications;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public class StrategyLambdas {

    public static void main(String[] args) {
        var product1 = Producto.builder().id(1L).name("Beer").price(150.0).userType("BASIC").build();
        var product2 = Producto.builder().id(2L).name("Beer").price(150.0).userType("PLUS").build();
        var product3 = Producto.builder().id(3L).name("Beer").price(150.0).userType("PRIME").build();
        var products = List.of(product1,product2,product3);
        products.forEach(producto -> {
            switch (producto.getUserType()){
                case "BASIC":
                    producto.setDiscountStrategy(Strategies.basicDiscount); break;
                case "PLUS":
                    producto.setDiscountStrategy(Strategies.plusDiscount); break;
                case "PRIME":
                    producto.setDiscountStrategy(Strategies.primeDiscount); break;
            }
        });

        products.forEach(p ->{
            System.out.println("Price: " + p.getPrice()
                    + " - User Type: " + p.getUserType()
                    + " - Discount Strategy: " + p.getDiscountStrategy().get(p.getPrice()));

        });
    }



}

@FunctionalInterface
interface ApplyDiscountStrategy {
    Double get(Double discount);

}

class Strategies{
    static ApplyDiscountStrategy basicDiscount = p -> p * 0.2;
    static ApplyDiscountStrategy plusDiscount = p -> p * 0.5;
    static ApplyDiscountStrategy primeDiscount = p -> p * 0.7;
}

@Data
@ToString
@Builder
class Producto{
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private Double discount;
    private ApplyDiscountStrategy discountStrategy;

}
