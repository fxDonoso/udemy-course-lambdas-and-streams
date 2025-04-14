package com.debuggeando_ideas.real_appplications;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/lambdas.txt");

        try(Stream<String> lineas = Files.lines(path).onClose(()-> System.out.println("cerrada"))){

            lineas.forEach(System.out::println);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
