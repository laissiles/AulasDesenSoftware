/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import java.util.Scanner;

/**
 *
 * @author laisl
 */
public class Matriz {
    
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner (System.in);
        
        //declarando e inicializando a matriz [linhas] x [colunas]
        int matriz[][] = new int [2][2];
        
      
        //Preenchendo a matriz manualmente
        matriz[0][0] = 1;
        matriz [0][1] = 2;
        matriz [1][0] = 3;
        matriz [1][1]= 4;
        
//        String nome = "Lais";
//        int idade = 25;
//        double salario = 1_000_000.5;
//     
//        System.out.printf(
//                "Oi meu nome é %s, tenho %d anos e ganho R$ %s por mês",
//                nome,
//                idade,
//                salario
//        );
        
        
        //declarando matriz sem definir nas chaves o tam, mas colocando os valores, neste caso, 2x2
       int matriz2[][] = {{1,2}, {3,4}};
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { //O MATRIZ [I] SERVE PRA "TRAVAR" O LAÇO E PERCORRERMOS A COLUNA
               //ex: 0,0, 0,1, 0,2 - lina travada, coluna anda
               
               
               
//               System.out.printf("%d  ", matriz[i][j]); 
                
//System.out.printf ("%d\t%d\t%f\t%s",5,5,254.336,"Hehe");


                System.out.printf("|%d | ", matriz[i][j]);
                
            }
            System.out.println(); // o ln é uma "quebra de linha"
            
            
        }



    
  
      
      
   
            
            
    }
    
    
}
