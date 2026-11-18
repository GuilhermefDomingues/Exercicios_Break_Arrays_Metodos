package com.gui;

public class Exercicio20 {
    public static void main(String[] args) {
        double[] salarios = {2600, 5100, 3200, 4000};
        double maior = salarios[0];
        for (double salario : salarios) {
            if (salario > maior) {
                maior = salario;
            }
        }
        System.out.println(maior);
    }
}
