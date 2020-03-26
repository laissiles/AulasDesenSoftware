/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;


public class Matriz_JOptionPane {
    public static void main(String[] args) {
        
        
        
      
                int a[][] = new int[2][2];  
         
        int l, c ;  
        
           
        for (l = 0; l < 2; l++) {  
            for (c = 0; c < 2; c++) {  
  
                a[l][c] = Integer.parseInt(showInputDialog(null, "Digite a linha "+l + " e a coluna "+c));
                
                          
               }  
        }
               
       String resultado = "";
        for (int i=0; i<2;i++){
            for (int j=0; j<2; j++){
                resultado = resultado + " | " + a[i][j] + " | ";
            }
            resultado += "\n"; // Quebra a linha pra ficar um embaixo do outro
        }
        JOptionPane.showMessageDialog(null, "Sua matriz é \n" +resultado);
    }
    
  

        
  
        
  
    }  
 
    


        
        
        
    
    
    