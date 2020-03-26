/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author laisl
 */
public class função_soma {

    
    
    public static int soma( int a, int b){
        
        int resultado;        
        resultado = a+b;
        return resultado;
        
    }
    
    public static void mostraSoma(int n1, int n2){
        
          int mostra;
          mostra = soma(n1,n2);
        
           showMessageDialog(null, mostra);
   }  
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2;
        
          n1 = Integer.parseInt(showInputDialog(null, "qual o primeiro numero?"));
           n2 = Integer.parseInt(showInputDialog(null, "qual o segundo numero"));
           
           soma(n1,n2);
           mostraSoma(n1,n2);
           
           
           
           
           
    }
    
}
