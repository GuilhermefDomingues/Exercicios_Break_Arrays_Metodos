package com.gui;

public class Exercicio22 {
    public static void main(String[] args) {
        exibirStatus(true);
        exibirStatus(false);
    }

    static void exibirStatus(boolean ativo) {
        if (ativo) {
            System.out.println("ATIVO");
        } else {
            System.out.println("INATIVO");
        }
    }
}
