package com.example.lista2;

import javax.swing.*;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        double n1,n2,n3, soma;


        String Nome =  JOptionPane.showInputDialog("Insira seu nome:");
        String texto = String.format("Olá, %s", Nome + ", Bem vindo a Bandtec" );

        Scanner leitor = new Scanner(System.in);

        System.out.println(texto);
        System.out.println("Digite a sua primeira nota: ");
        n1= leitor.nextDouble();
        System.out.println("Digite a sua Segunda nota: ");
        n2= leitor.nextDouble();
        System.out.println("Digite a sua terceira nota: ");
        n3= leitor.nextDouble();

        soma= (n1+n2+n3)/3;
        System.out.println("Processando..");
        if (soma >= 7 ){
            System.out.println(String.format("Parabéns passou direto, sua média foi %.1f", soma));
        } else if (soma >=5 || soma <7){
            System.out.println(String.format("têm direito de fazer uma prova de recuperação, sua média foi %.1f", soma));
        } else {
            System.out.println(String.format("reprovado direto sua média foi %.1f",soma));
        }
    }
}
