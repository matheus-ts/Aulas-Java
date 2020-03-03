package com.example.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Integer num, soma = 0;
        int cont = 0;

        do{
            System.out.println("Digite um número");
            num = ent.nextInt(); // usuario digita um número

            if(num >= 0){ // se o número digitado for MAIOR que zero, executa a conta
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
                cont++; // conta quantas vezes o usuário digitou um número
            }
        } while(num >= 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente

        System.out.println("A soma é " + soma); // soma
        System.out.println("A quantidade de números digitados foi " + cont);
    }
}
