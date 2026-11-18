package com.gui;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] valores = {10, -3, 0, 5, -8, 2};
        int soma = 0;
        for (int valor : valores) {
            if (valor < 0) {
                continue;
            }
            soma += valor;
        }
        System.out.println(soma);
    }
}
