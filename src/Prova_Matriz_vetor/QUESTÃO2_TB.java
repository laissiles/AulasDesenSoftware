package Prova_Matriz_vetor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laisl
 */
public class QUESTÃO2_TB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        2-Faça um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa deve executar os seguintes passos: 

(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
 (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições ˜ A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. ˜ 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
        
        
        
        
        */
        
        //definindo o vetor de tam 6
        int a[] = new int [6];
        
        // preenchendo o vetor
        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;
        
        //fazendo a soma dos A[0], A[1] e A[5]
        
        int aux = a[0]+a[1]+a[5];
        System.out.println("soma de A[0], A[1] e A[5] = "+aux);
        
        
        //alterando o valor de A[4]
        
        a[4] = 100;
        
        //mostrando o vetor
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("seu vetor é: "+a[i]);
        }
    }
    
}
