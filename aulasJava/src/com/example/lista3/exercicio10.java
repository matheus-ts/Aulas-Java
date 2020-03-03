package com.example.lista3;

import java.util.Scanner;

public class exercicio10 {


    public static void main(String[] args) {

        String nome , senha ;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Portal Bandtec");
        System.out.println("Login : ");
       nome = leitor.next();
        System.out.println("Senha : ");
       senha =  leitor.next();

        if (nome.equals("admin") && senha.equals("bandtec")){
            System.out.println("Credenciais corretas Bem vindo");
        }else{
            System.out.println("Credenciais erradas");
        };

    }
}

