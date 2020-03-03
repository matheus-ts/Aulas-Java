package com.example.lista3;

import java.util.Scanner;

public class Exercicoo9 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        Integer B;
        Integer E;

        double funcao;

        System.out.println("Digite sua base :");
        B = leitor.nextInt();
        System.out.println("Digite o seu expoente");
        E = leitor.nextInt();

        System.out.println("Processando...");

      funcao = Math.pow(B, E);
            System.out.println("A base " + B + " Elevado a " + E + " é igual a " + funcao);

    }
}
