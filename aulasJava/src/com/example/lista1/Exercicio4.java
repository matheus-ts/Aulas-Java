package com.example.lista1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main (String [] args){

        Double produto , pago;
        Integer quantidade;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Qual o preço do produto: ");
        produto= leitor.nextDouble();
        System.out.println("Qual a quantidade comprada: ");
        quantidade= leitor.nextInt();
        System.out.println("Qual o valor pago: ");
        pago= leitor.nextDouble();

        System.out.println("O preço total do produto é " + (produto * quantidade) + " E o valor pago foi de: "
                + pago + " E o troco que ele deve receber é: " + ((produto * quantidade)-pago));

    }
}
