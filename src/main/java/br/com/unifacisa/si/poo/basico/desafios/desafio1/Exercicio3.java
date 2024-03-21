package br.com.unifacisa.si.poo.basico.desafios.desafio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        System.out.println("\nUtilizando loop for");
        for (int i = 0; i < numero; i++) {
            System.out.println("for: " + i);
        }

        System.out.println("\nUtilizando loop while");
        int contadorWhile = 0;
        while (contadorWhile < numero) {
            System.out.println("while: " + contadorWhile);
            contadorWhile++;
        }

        System.out.println("\nUtilizando loop do-while");
        int contadorDoWhile = 0;
        do {
            System.out.println("do-while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < numero);

        sc.close();
    }
}
