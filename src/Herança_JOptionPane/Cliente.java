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
public class Cliente {
    private String nome;
  
    private String endereco;
   int resposta=0;
     

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
        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "pesquisa", 3);
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        endereco = JOptionPane.showInputDialog(null, "Qual o seu endereço?", "pesquisa", 3);
        this.endereco = endereco;
    }
    
    public String nomeP(String nome){
        return nome;
    }
       
    }
    

    
    
    
    
    

