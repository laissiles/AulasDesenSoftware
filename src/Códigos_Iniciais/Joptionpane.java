/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import javax.swing.JOptionPane;

/**
 *
 * @author laisl
 */
public class Joptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nome;
        int resposta = 0;

        //janela para o usuário inserir dados;
        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "pesquisa", 3);

        // janela de confirmação de dados
        JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");

// verifica se o usuário clicou no botão YES
        if (resposta == JOptionPane.YES_OPTION) {

//JOptionPane.showMessageDialog(null, "Seu nome é " + nome); 
            JOptionPane.showMessageDialog(null, "seu nome é " + nome);
        } else {

            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);

        }



    }
    
}
