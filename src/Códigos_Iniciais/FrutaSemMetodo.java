/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import static javax.swing.JOptionPane.*;


/**
 *
 * @author laisl
 */
public class FrutaSemMetodo {
     public static void main(String[] args) {
           
        int quantidade;
        
        
        
        String fruta[]; //vetor
              
        //vamos pedir pro usuário quantas frutas ele deseja cadastrar//        
       quantidade = Integer.parseInt(showInputDialog(null, "Quantas frutas vc quer digitar?"));
              
       
       //vira função___________________________________________________________________________________
         //agora que temos a quantidade de frutas, vamos definir o tamanho do nosso vetor         
         fruta = new String[quantidade];          
         //vamos agora "popular o vetor//
         for (int i = 0; i < quantidade; i++) {
              fruta[i] = showInputDialog(null,String.format("Digite a %d º fruta", i+1)
                        );
             
         }
         //_____________________________________________________________________________________________
         // mostrando as frutas
         String mensagemFinal = "";
        for (int i = 0; i <fruta.length; i++) {
//           
            mensagemFinal = mensagemFinal + fruta[i] + ", ";
           
        }
        
        showMessageDialog(null, mensagemFinal);
        
        //______________________________________________________________________________________________
               
         }
            
            
       
           
           
           
           
            
}

