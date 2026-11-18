package com.gui;

public class Exercicio15 {
    public static void main(String[] args) {
        int nota = 8;
        if (nota >= 7) {
            // situacao só existe dentro deste bloco.
            String situacao = "Aprovado";
            System.out.println(situacao);
        }
        // nota foi declarada no main e pode ser usada dentro e depois do if.
        System.out.println("Nota: " + nota);
    }
}
