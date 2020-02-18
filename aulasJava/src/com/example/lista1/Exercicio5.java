package com.example.lista1;

import java.util.Scanner;

public class Exercicio5 {


    public static void main (String [] args){

        Double salario, resultado , imposto;



        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto é o seu salario: ");
        salario= leitor.nextDouble();
        System.out.println("Quanto é o seu imposto (Digite só o número): ");
        imposto= leitor.nextDouble();

        resultado = (salario*imposto)/100;
        System.out.println("O seu imposto vai ser de:" + resultado);



    }
}
