package com.example.lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer numero ;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Tabuada pratíca");
        System.out.println("Digite um número:");
        numero = leitor.nextInt();


        for(Integer i =1; i <= 10;  i++ ){
           System.out.println( i + "x" + numero + "+" + i * numero  );
       };
    }
}
