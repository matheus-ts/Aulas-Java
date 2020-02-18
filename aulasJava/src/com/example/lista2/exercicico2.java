package com.example.lista2;


import java.util.Scanner;

public class exercicico2 {




    public static void main(String[] args) {

        Scanner leitor =  new Scanner(System.in);
        Integer lugar;
        System.out.println("Digite uma opção: " +
                "\n 1) Casquinha " +
                "\n 2) Sundae"+
                "\n 3) Milkshake");

        lugar=leitor.nextInt();
        System.out.println("Tabela de preços: \n Casquinha : R$ 2.00 \n Sundae: R$ 5.00 \n Milkshake: R$ 7.00 : ");

        switch (lugar) {
           case 1:
                System.out.print(" Você escolheu uma Casquinha ");
                break;
            case 2 :
                System.out.print("Você escolheu Um Sundae ");
                break;
            case 3 :
                System.out.println("Você escolheu um Milkshake ");
                break;
            default:
                System.out.println("Tente novamente");
                break;
        }
    }
}
