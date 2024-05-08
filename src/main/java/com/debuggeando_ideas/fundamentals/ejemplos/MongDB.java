package com.debuggeando_ideas.fundamentals.ejemplos;

import com.debuggeando_ideas.fundamentals.DatabaseService;

import java.util.List;

public class MongDB implements DatabaseService{


    @Override
    public String getById(Long id) {
        return "Retornando getById desde MongoDB con id:" + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hola desde MongoDB");
    }
}
