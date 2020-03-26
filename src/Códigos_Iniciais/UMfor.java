/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;


import java.util.Arrays;

/**
 *
 * @author laisl
 */
public class UMfor {
    
    public void main(String[] args) {
        
        
        int[] vetorA = new int[3];
            int[] vetorB = new int[vetorA.length];
            String textao = "vetor A \t vetor B \n";
            
             for (int cont = 0; cont < vetorA.length; cont++)

            {
             

                //passando pro vetor b
                vetorB[cont] = vetorA[cont] * 3;

                //Vetor A    \t\t  VETOR B \n
                //[0] 1     \t\t    [0]3 \n
                //[1] 2     \t\t    [1]6 \n
                
                
               

                 textao = textao + "["+cont+ "]"+vetorA[cont]+"\t\t ["+cont+"]"+vetorB[cont]+"\n";
                

            }
            
             System.out.println(textao);
             System.out.println("______________________________________");
             
              System.out.println(Arrays.toString(vetorB));
    }
    
}
