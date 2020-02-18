package com.example.lista1;

import java.util.Scanner;

public class Exercicio1 {
        public static void main (String [] args){
            Double limite,p1,p2,p3;
            Integer quantidade;


            Scanner leitor = new Scanner(System.in);

            System.out.println("Qual o limite de pessoas permitido: ");
            quantidade= leitor.nextInt();

            System.out.println("Qual o peso limite do elevador: ");
            limite= leitor.nextDouble();

            System.out.println("Qual o peso da primeira pessoa: ");
            p1= leitor.nextDouble();

            System.out.println("Qual o peso da segunda pessoa: ");
            p2= leitor.nextDouble();

            System.out.println("Qual o peso da terceira pessoa: ");
            p3= leitor.nextDouble();

            System.out.println(
                    "Entraram 3 pessoas no elevador que suporta: " + limite + " kg"+ "o peso adequado para que todas pessoas possam pegar esse elevador no limite é :" +
                            quantidade +". No entanto as três pessoas juntas tem: " + (p1+p2+p3) );


    }
}
