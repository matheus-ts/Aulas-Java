package com.example.lista3;

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Integer number;
        Integer i;
        Integer sorteado;


        Random sorteador = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("teste sua sorte !");
        System.out.println("Digite um número de 0 a 10");
        number = leitor.nextInt();


        for (i = 0; i< 200; i++){
            sorteado= sorteador.nextInt(11);


            if (sorteado==number && i<=3) {
                System.out.println("O seu numero foi sorteado e você é bastante sortudo em " + i + "x");

                if (i % 2 == 1){
                    System.out.print("Estes foram nos numeros sorteados impares antes do seu " + i +" -");}
                if (i % 2 == 0){
                    System.out.print("Estes foram nos numeros sorteados pares antes do seu " + i +" -");
                }

                break;
            }else if (sorteado == number && i<=10){
                System.out.println("você é sortudo"  + i + "x");

                if (i % 2 == 1){
                    System.out.print("Estes foram nos numeros sorteados impares antes do seu " + i +" -");}
                else if (i % 2 == 0){
                    System.out.print("Estes foram nos numeros sorteados pares antes do seu " + i +" -");
                }

                break;
            }
            else if (sorteado == number && i > 10) {

                System.out.println("Mais sorte na proxima o seu número foi sorteado em " + i + "x tentativas");

                if (i % 2 == 1) {
                    System.out.print("Estes foram nos numeros sorteados impares antes do seu " + i + " -");
                }
               else if (i % 2 == 0) {
                    System.out.print("Estes foram nos numeros sorteados pares antes do seu " + i + " -");
                }

                break;

            }
        }

    }
    ;};

