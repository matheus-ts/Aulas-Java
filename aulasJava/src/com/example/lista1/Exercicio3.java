package com.example.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args){


        String nome;
        Integer ano;

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite o seu ano de nascimento:");
        ano = leitor.nextInt();
        System.out.println("Olá " + nome + ", Em 2030 você terá " + (2030- ano));

        //Exercicio 2 concluido
    }
}
