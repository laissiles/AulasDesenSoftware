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
public class VetorcomMetodos {
   
    public static void main(String[] args) {
        
        int numeros[];
        int tam;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Quantos numeros voce vai digitar? ");
        tam = teclado.nextInt();
        
        numeros = new int [tam];
        
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite seu "+(i+1)+" numero.");
            numeros[i]= teclado.nextInt();
            
            if (numeros[i]%2==0) {
                numeros[i]=numeros[i]+10;
            }else{
                numeros[i] = numeros[i]-5;
            }
            
                   
        }    
            System.out.println("seus novos numeros são: ");
          for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[j]);
            }       
        }
        
          }
    

