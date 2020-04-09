package atividade1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double peso, altura, resultadoAltura , resultadoTotal;

        System.out.println("Digite A");
        altura = leitor.nextDouble();

        System.out.println("Digite B");
        peso= leitor.nextDouble();

        resultadoAltura = altura*altura;

        resultadoTotal = resultadoAltura/peso;

        System.out.println(resultadoTotal);

    }
}
