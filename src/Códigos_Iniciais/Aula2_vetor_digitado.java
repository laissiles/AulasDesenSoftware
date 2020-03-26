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
public class Aula2_vetor_digitado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        
      //preencher o vetor automaticamente apenas com numeros positivos
        
        int numeros[]= new int[10];
        
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i+1)*2;
        }
        
        
        numeros[2] = 222; // altero a posição 2 do vetor pra ter o valor 222
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        //usando a biblioteca math
        
        System.out.println(Math.random()); // gera um valor aleatório dentre 0 e 1;
        System.out.println("-----------------------------");
        System.out.println(Math.random()*10); // *10 para deixar o numero "maior"
        System.out.println("-----------------------------");
        System.out.println((int)Math.round(Math.random()*10)); //arredonda o numero gerado aleatoriamente e multiplica por 10 parar virar "inteiro"
        
       

            
            
           
            
            
    }
}
