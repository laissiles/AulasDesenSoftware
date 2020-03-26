/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

/**
 *VETOR DE TAMANHO 5 COM NUMEROS ALEATÓRIOS
 * @author laisl
 */
public class Vetor_N_aleatorio {
   
    public static void main(String[] args) {
        
        int vetora[] = new int[5];
        int vetorb[] =  new int [vetora.length];
        
        
        for (int i = 0; i < vetora.length; i++) {
            vetora[i] = (int)Math.round(Math.random()*10);
            
            vetorb[i] = vetora[i]*5;
            
            
             System.out.println(vetorb[i]);
        }
        
       
    }
            
    
}
