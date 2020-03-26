/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_JOptionPane;

import javax.swing.JOptionPane;
/**
 *
 * @author laisl
 */
public class ClientePF extends Cliente {
    
    private int cpf;
    

    public ClientePF(String nome, String endereco, int cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public int getCpf() {
         JOptionPane.showConfirmDialog(null, "O seu cpfé " + cpf + "?");
         
         // verifica se o usuário clicou no botão YES
        if (resposta == JOptionPane.YES_OPTION) {

//JOptionPane.showMessageDialog(null, "Seu nome é " + nome); 
            JOptionPane.showMessageDialog(null, "seu cpf é " + cpf);
        } else {

            JOptionPane.showMessageDialog(null, "Seu cpf não é " + cpf);

        }
        return cpf;
    }
    

    public void setCpf(int cpf) {
        cpf= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do seu cpf: "));        
        this.cpf = cpf;
        
    }
    
  
    
     
    
       
    
    
}
