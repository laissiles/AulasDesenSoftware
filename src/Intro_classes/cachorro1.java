/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro_classes;

/**
 *As classes de programação são projetos de um objeto, aonde têm características e comportamentos, ou seja, 
 * permite armazenar propriedades e métodos dentro dela. Para construir uma classe é preciso utilizar o pilar 
 * da abstração. 
 * Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, algo que seja “abstrato”.
 * 
 * 
 * Características das classes
Toda classe possui um nome;
Possuem visibilidade, exemplo: public, private, protected;
Possuem membros como: Características e Ações;
Para criar uma classe basta declarar
*visibilidade + digitar a palavra reservada class + NomeDaClasse + abrir e fechar chaves { }.
 * 
 * 
 * public class Teste{
//ATRIBUTOS OU PROPRIEDADES
//MÉTODOS
}
 * 
 */
public class cachorro1 {
    
    //caracteristicas da classe
    public String nome;
    public int peso;
    public String corOlhos;
    public int quantPatas;
    int tamanho;
    
     //função da classe
    public void latir(){
         if(tamanho > 60)
            System.out.println("Wooof, Wooof!");
        else if(tamanho > 14)
            System.out.println("Ruff!, Ruff!");
        else
            System.out.println("Yip!, Yip!");
    }
     
        
    
    
}
