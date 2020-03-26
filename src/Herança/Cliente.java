/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;
import javax.swing.JOptionPane;

/**
 *
 * @author laisl
 */
public class Cliente {
    
    private String nome;
    private String endereco;
     
     

    //metodo construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
//metodos get
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
//metodos set
    public void setNome(String nome) {
               this.nome = nome;
    }

    public void setEndereco(String endereco) {
        
        this.endereco = endereco;
    }
    
}
    
    
    
    
    

