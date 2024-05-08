package com.debuggeando_ideas.fundamentals;

import com.debuggeando_ideas.fundamentals.ejemplos.MongDB;

import javax.management.PersistentMBean;

public class App {

    public static void main(String[] args) {
        DatabaseService mongo = new MongDB();

        System.out.println(mongo.getById(20L));

        ProductDB pDB = new ProductDB();
        EmployeeDB eDB = new EmployeeDB();

        System.out.println(pDB.getById(2L));
        System.out.println(eDB.getById(1L));
    }

}
