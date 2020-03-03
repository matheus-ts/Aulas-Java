package com.example.lista3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer number, i, sorteado;


        Random sorteador = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("teste sua sorte !");
        System.out.println("Digite um número de 0 a 10");
        number = leitor.nextInt();


        for (i = 0; i< 20; i++){
            sorteado= sorteador.nextInt(11);

                if (sorteado==number && i<=3){
                    System.out.println("O seu numero foi sorteado e você é bastante sortudo em " + i + "x");
                    break;
                }else if (sorteado == number && i<=10){
                    System.out.println("você é sortudo"  + i + "x");
                    break;
                } else if (sorteado == number && i > 10){
                    System.out.println("Mais sorte na proxima"  + i + "x");
                    break;
                }
        }

        }
        ;
    }

