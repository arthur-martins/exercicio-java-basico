package br.com.unifacisa.si.poo.basico.desafios.desafio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("\nNúmero " + numero + " é positivo!");

        } else if (numero < 0) {
            System.out.println("\nNúmero " + numero + " é negativo!");

        } else {
            System.out.println("\nNúmero " + numero + " é neutro!");
        }
        sc.close();
    }
}
