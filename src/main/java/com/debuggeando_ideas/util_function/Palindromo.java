package com.debuggeando_ideas.util_function;

public class Palindromo {

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    // Función para encontrar un palíndromo dentro de una cadena
    public static String encontrarPalindromo(String cadena) {
        String palindromo = "";

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = i + 1; j <= cadena.length(); j++) {
                String subcadena = cadena.substring(i, j);
                if (esPalindromo(subcadena) && subcadena.length() > palindromo.length()) {
                    palindromo = subcadena;
                }
            }
        }

        return palindromo;
    }

    public static void main(String[] args) {
        String cadena = "anitalavalatina";
        String palindromoEncontrado = encontrarPalindromo(cadena);

        if (palindromoEncontrado.isEmpty()) {
            System.out.println("No se encontró ningún palíndromo en la cadena.");
        } else {
            System.out.println("Palíndromo encontrado: " + palindromoEncontrado);
        }
    }
}

