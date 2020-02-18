package com.example.lista2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String sexo;
        Double altura, peso, imc;

        System.out.println("Olá, Digite o seu sexo: (F) ou (M)");
        sexo= leitor.next();
        System.out.println("Digite sua altura: ");
        altura= leitor.nextDouble();
        System.out.println("Digite seu peso: ");
        peso= leitor.nextDouble();

        imc = (peso)/(altura*altura);


        if (sexo.equals("F")){
            if (imc < 19.1){
                System.out.println("Abaixo do peso");
            } else if (imc >=19.1 || imc < 25.8){
                System.out.println("No peso normal");
            } else if (imc >=25.8 || imc < 27.3){
                System.out.println("Marginalmente acima do peso");
            }else if (imc >=27.3 || imc < 32.3){
                System.out.println("Acima do peso ideal");
            }else {
                System.out.println("Obeso");
            }
        }
        if (sexo.equals("M")){
            if (imc < 20.7){
                System.out.println("Abaixo do peso");
            } else if (imc >=20.7 || imc < 26.4){
                System.out.println("No peso normal");
            } else if (imc >=26.4 || imc < 27.8){
                System.out.println("Marginalmente acima do peso");
            }else if (imc >=27.8 || imc < 31.1){
                System.out.println("Acima do peso ideal");
            }else {
                System.out.println("Obeso");
            }
        }
    }

}
