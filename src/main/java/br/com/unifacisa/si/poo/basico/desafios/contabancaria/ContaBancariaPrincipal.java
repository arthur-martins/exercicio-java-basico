package br.com.unifacisa.si.poo.basico.desafios.contabancaria;

import javax.swing.*;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        Conta conta;
        JOptionPane.showMessageDialog(null, "Bem-vindo ao programa de Conta Bancária!");

        String inputNumero = JOptionPane.showInputDialog("Insira o número da conta");
        int numeroConta = Integer.parseInt(inputNumero);

        String titularConta = JOptionPane.showInputDialog("Insira o titular da conta");

        String existeDeposito = JOptionPane.showInputDialog("Existe depósito inicial (s/n)");
        if (existeDeposito.equalsIgnoreCase("s")) {
            String inputQuantiaDeposito = JOptionPane.showInputDialog("Insira o valor inicial");
            double valorInicial = Double.parseDouble(inputQuantiaDeposito);
            conta = new Conta(numeroConta, titularConta, valorInicial);
        } else {
            conta = new Conta(numeroConta, titularConta);
        }

        JOptionPane.showMessageDialog(null, conta);

        String inputQuantia = JOptionPane.showInputDialog("Insira um valor de depósito");
        double quantia = Double.parseDouble(inputQuantia);
        conta.deposito(quantia);

        JOptionPane.showMessageDialog(null, conta);

        inputQuantia = JOptionPane.showInputDialog("Insira um valor de saque");
        quantia = Double.parseDouble(inputQuantia);
        conta.saque(quantia);

        JOptionPane.showMessageDialog(null, conta);
    }
}
