package com.gui;

public class Exercicio23 {
    public static void main(String[] args) {
        System.out.printf("Subtotal: R$ %.2f%n", calcularSubtotal(12.50, 3));
    }

    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }
}
