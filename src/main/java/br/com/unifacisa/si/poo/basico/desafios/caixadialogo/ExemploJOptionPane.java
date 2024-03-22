package br.com.unifacisa.si.poo.basico.desafios.caixadialogo;

import javax.swing.*;

public class ExemploJOptionPane {
    public static void main(String[] args) {
        // Exemplo 1 - Exibir uma caixa de diálogo de mensagem
        JOptionPane.showMessageDialog(null, "Mensagem simples para o usuário!");


        // Exemplo 2 - Exibir uma caixa de diálogo de confirmação
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir este arquivo?");
        // Verificar a escolha do usuário
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Arquivo excluído com sucesso!");

        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }


        // Exemplo 3 - Solicitar ao usuário que insira um valor
        String nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
        // Exibir o name inserido pelo usuário
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);


        // Exemplo 4 - Opções para o usuário escolher
        String[] opcoes = {"Sim", "Não", "Cancelar"};
        // Exibir uma caixa de diálogo de opções
        int escolha = JOptionPane.showOptionDialog(null, "Deseja salvar as alterações?",
                "Salvar Alterações", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        // Verificar a escolha do usuário
        if (escolha == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Alteração salvas com sucesso.");

        } else if (escolha == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Alteração não salvas!!");

        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }
}
