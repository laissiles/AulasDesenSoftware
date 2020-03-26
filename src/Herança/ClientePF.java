/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;

import Herança_JOptionPane.Cliente;
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
         
        return cpf;
    }
    

    public void setCpf(int cpf) {
            
        this.cpf = cpf;
        
    }
    
    
    
       
    
    
}
