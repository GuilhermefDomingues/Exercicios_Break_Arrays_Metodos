package com.gui;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] valores = {12, 25, 30, 44, 58};
        for (int valor : valores) {
            if (valor == 44) {
                System.out.println("Encontrado: " + valor);
                break;
            }
        }
    }
}
