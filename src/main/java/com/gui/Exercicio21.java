package com.gui;

public class Exercicio21 {
    public static void main(String[] args) {
        int[] valores = {99, 100, 125, 40, 200};
        int quantidade = 0;
        for (int valor : valores) {
            if (valor >= 100) {
                quantidade++;
            }
        }
        System.out.println(quantidade);
    }
}
