/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import java.util.Scanner;
/**
 * 
 *
 * @author laisl
 */
public class SomaSemVetorSemMetodo {
    
    public static void main (String[] args) {
        
        /* Receba do usuário uma sequencia de 5 numeros inteiros, após isso aplique a seguinte regra:
        Para todo numero par, multiplique por 5, e todo numero impar, multiplique por 7
      imprima os numeros antes e depois da multiplicação
        
        MODO CARAIO, SEM VETORES E SEM METODOS
        
        
       */
        
        int n1,n2,n3,n4,n5;
         Scanner teclado = new Scanner (System.in);
         
         
        System.out.println("Digite o primeiro numero:");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = teclado.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = teclado.nextInt();
        System.out.println("Digite o quinto numero: ");
        n5 = teclado.nextInt();
        System.out.println("------------------------------------");
        
        
        
        
        if (n1%2==0) {
            n1 = n1*5;
            }else{
            n1 = n1*7;
        }
   
        if (n2%2==0) {
            n2 = n2*5;
        }else{
            n2 = n2*7;
        }
        
        if (n3%2==0) {
            n3 = n3*5;
        }else{
            n3 = n3*7;
        }       
        
          if (n4%2==0) {
            n4 = n4*5;
        }else{
            n4 = n4*7;
        }
        
          if (n5%2==0) {
            n5 = n5*5;
        }else{
            n5 = n5*7;
        }
        
        
          System.out.println("Seu primeiro numero ficou: "+n1);
          System.out.println("Seu segundo numero ficou: "+n2);
          System.out.println("Seu terceiro numero ficou: "+n3);
          System.out.println("Seu quarto numero ficou: "+n4);
          System.out.println("Seu quinto numero ficou: "+n5);
              
    }
}
