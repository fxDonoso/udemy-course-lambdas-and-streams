package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

    static Function<Persona, ByteArrayOutputStream> serializable = persona -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(inMemoryBytes)) {
            objectOutputStream.writeObject(persona);
            objectOutputStream.flush();

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Persona> deserializer =  bais -> {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {
            return (Persona) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream objSerialized = serializable.apply(new Persona("Pedro", 33));
        System.out.println(Arrays.toString(objSerialized.toByteArray()));

        Persona objDeserializado = deserializer.apply(new ByteArrayInputStream(objSerialized.toByteArray()));
        System.out.println(objDeserializado);
    }

}
@ToString
class Persona implements Serializable{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
