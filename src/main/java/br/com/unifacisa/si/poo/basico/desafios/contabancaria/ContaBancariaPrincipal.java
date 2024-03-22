package br.com.unifacisa.si.poo.basico.desafios.contabancaria;

import javax.swing.*;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        Conta conta;
        ContaServico contaServico = new ContaServico();
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
//        conta.deposito(quantia);
        contaServico.depositar(conta, quantia); // Utilizando o método depositar da classe ContaServico

        JOptionPane.showMessageDialog(null, conta);

        inputQuantia = JOptionPane.showInputDialog("Insira um valor de saque");
        quantia = Double.parseDouble(inputQuantia);
//        conta.saque(quantia);
        contaServico.sacar(conta, quantia); // Utilizando o método saque da classe ContaServico
        JOptionPane.showMessageDialog(null, conta);
    }
}
