/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_GetSet;

/**
 *
 * @author laisl
 */
public class Pessoa {
    
    private String nome;
    private int cpf;
           
    
    //metodo construtor da classe, inicializa os dados do objeto   
    public Pessoa (String nome, int cpf){
       this.nome = nome;
       this.cpf = cpf;
       
       /*  Quando não utilizamos o "this", ele quer dizer que o nome que estamos referenciando o 
       argumento do metodo, e com o this eu referencio o atributo da classe */
       
        }
    //metodos de acesso
    public String getNome(){
        return nome;
    }
    
    public int getCpf(){
        return cpf;
    }
 //metodos m
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
}
  
