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
        // eu quero um programa onde o usuário digite seu nome, confirme se o nome é aquele, e apaareca uma janela com o nome dele
        
        String nome;
        int resposta;
        
        //primeira janela pra inserção do nome
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        
        //janela de confirmação de nome
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é: "+nome+"?");
            
       // tratar se o nome é ou não do usuário       
            if(resposta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "O seu nome é: "+nome);
            }else{
                JOptionPane.showMessageDialog(null, "O seu nome NÃO é: "+nome);
    
    }
        }
}
