package com.example.lista2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double preço, total;
        Integer desconto;
        String frase , frase2;

        System.out.println("Verifique o seu desconto: ");
        System.out.println("Digite o preço do produto: ");
        preço = leitor.nextDouble();
        System.out.println("Digite o codigo do produto: ");

        desconto=leitor.nextInt();


        switch (desconto) {
            case 1:
                total = (preço * 0.05);
                System.out.println("Você tem direito a 5% de desconto: \n" + "O preço bruto do produto é igual a: R%  "+ preço + "O preço com desconto do produto é igual a: R% " + (preço-total));
                break;

                case 2:
                    total = (preço * 0.10);
                    System.out.println("Você tem direito a 10% de desconto: \n" + "O preço bruto do produto é igual a: R%  "+ preço + "O preço com desconto do produto é igual a: R% " + (preço-total));

                    break;
                case 3:
                    total = (preço * 0.20);
                    System.out.println("Você tem direito a 10% de desconto: \n" + "O preço bruto do produto é igual a: R%  "+ preço + "O preço com desconto do produto é igual a: R% " + (preço-total));

                    break;
                case 4:
                    total = (preço * 0.50);
                    System.out.println("Você tem direito a 10% de desconto: \n" + "O preço bruto do produto é igual a: R%  "+ preço + "O preço com desconto do produto é igual a: R% " + (preço-total));

                    break;
                default:
                    System.out.println("Codigo invalido");
                    break;
            }

            };




    }

