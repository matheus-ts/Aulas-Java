package com.example.lista1;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {

        Double n1,n2, meedia;

        Scanner leitor = new Scanner (System.in);

        System.out.println("Olá Digite a sua primeira nota");
        n1 = leitor.nextDouble();
        System.out.println("Olá Digite a sua segunda nota");
        n2 = leitor.nextDouble();

        meedia = (n1+n2)/2;

        if (meedia >= 5){
            System.out.println("Parabéns você está aprovado" );
        } else {
            System.out.println("Sinto muito mas você reprovou");
        }
        System.out.println(String.format("Sua média foi %.2f", meedia));

    }
}
