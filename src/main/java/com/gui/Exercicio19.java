package com.gui;

public class Exercicio19 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8, 9, 6.5, 10};
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        System.out.println(total / notas.length);
    }
}
