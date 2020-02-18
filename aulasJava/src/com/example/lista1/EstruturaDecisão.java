package com.example.lista1;

import java.util.Random;
import java.util.Scanner;

public class EstruturaDecisão {

    public static void main(String[] args) {
        Integer idade, numero, chute, diaSemana, lugar;
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);


//        System.out.println("Digite a sua idade: ");
//        idade= leitor.nextInt();
//        if (idade >= 18){
//            System.out.println("Já pode tirar a carteira de habilitação !");
//        } else {
//            System.out.println("Você ainda não tem a idade para tirar a habilitação");
//        };
//
//        System.out.println("Digite um numero inteiro: ");
//        numero= leitor.nextInt();
//
//        if (numero % 2 == 0){
//            System.out.println("Este número é " + numero + " par !");
//        } else{
//            System.out.println("Este número: " + numero + " não é um número par !");
//        }
//
//       System.out.println("Qual o nome da sua faculdade: ");
//      String nomefacul = leitor.nextLine();
//       if (nomefacul.equals("bandtec")){ //. equals oara string
//           System.out.println("Sucesso");
//       }

//        int valorDado = aleatorio.nextInt(6)+1;
//        System.out.println("Tente descobrir o valor do dado: ");
//
//        chute = leitor.nextInt();
//        if (valorDado == chute){
//            System.out.println("Parabens você sorteou o numero da sorte");
//        } else{
//            System.out.println("O valor do dado é " + valorDado);
//
//        }
//
//        System.out.println("\n Digite um numero de 1 a 7:");
//        diaSemana = leitor.nextInt();
//        switch (diaSemana) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda-Feira");
//                break;
//            case 3:
//                System.out.println("Terça-Feira");
//                break;
//            case 4:
//                System.out.println("Quarta-Feira");
//                break;
//            case 5:
//                System.out.println("Quinta Feira");
//                break;
//            case 6:
//                System.out.println("Sexta-Feira");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Número invalido!");
//                break;
//        }

        System.out.println("Digite a posição: " +
                                "\n Primeiro Lugar - 1 Iphone, Ipad e Ipod " +
                                "\n Segundo Lugar - Ipad e Ipod"+
                                "\n Terceiro Lugar - Ipod");
        lugar=leitor.nextInt();

        System.out.println("Você ganhou !");

        switch (lugar) {
            case 1 :
                System.out.print(" Um Iphone e ");
            case 2 :
                System.out.print(" Um Ipad e ");
            case 3 :
                System.out.println(" Um Ipod ");
                    break;
            default:
                System.out.println("Tente novamente");
                break;
        }

        }

}
