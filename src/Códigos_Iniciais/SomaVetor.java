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
public class SomaVetor {
    
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    // definindo o vetor
          int numero[] = new int[2];
           int soma =0;
           
          //percorrendo o vetor
           for (int i = 0; i < numero.length; i++) {
               System.out.println("Digite o " +i+ "numero");
               numero[i] = teclado.nextInt();
               
         }
           //fazendo a soma dos numeros do vetor
           for (int i = 0; i < numero.length; i++) {           
               soma = soma+numero[i];
               
         }
           
           
        System.out.println("a soma dos numeros é: "+soma);
        
}}
