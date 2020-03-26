package Prova_Matriz_vetor;


import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laisl
 */



public class QUESTÃO1_TB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //crie uma matriz 3x3 e peça pro usuário digitar os valores via JOPtionPane.. 
        //faça a impressão dessa matriz tbm usando JoptionPane
        
        //criando a matriz
       int a[][] = new int[3][3];  
         
        int l, c ;  
        
       //preenchendo a matriz   
        for (l = 0; l < 3; l++) {  
            for (c = 0; c < 3; c++) {  
  
                a[l][c] = Integer.parseInt(showInputDialog(null, "Digite a linha "+l + " e a coluna "+c));
                
                          
               }  
        }
            //imprimindo a matriz   
       String resultado = "";
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                resultado = resultado + " | " + (a[i][j]*3) + " | ";
            }
            resultado += "\n"; // Quebra a linha pra ficar um embaixo do outro
        }
        JOptionPane.showMessageDialog(null, "Sua matriz é \n" +resultado);
    }

        
  
    }
    

