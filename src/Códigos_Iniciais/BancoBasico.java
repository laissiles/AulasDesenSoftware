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
public class BancoBasico {
       public static void main(String[] args) {
    
    String nome;
    int rg;
    float valorDeposito;
    float valorSaque;
    float saldo =0;
    float saldoFinal;
    
    Scanner teclado = new Scanner (System.in);
    
    //informações dos clientes
           System.out.println("Olá, informe seu nome: ");
           nome = teclado.next();
           System.out.println("Informe seu RG: ");
           rg = teclado.nextInt();
           System.out.println("Deseja depositar quanto? ");
           valorDeposito = teclado.nextFloat();
           System.out.println("Deseja Sacar quanto? ");
           valorSaque = teclado.nextFloat();
           
           
           //calculo de soma de deposito
           saldo = valorDeposito+saldo;
           System.out.println("seu saldo é "+saldo);
           
           
           
           //calculo de saque
           if (saldo ==0) {
               System.out.println("Voce não tem saldo suficiente para sacar");
           }else{
           saldoFinal = saldo-valorSaque;
           System.out.println("seu saldo é "+saldoFinal);
           System.out.println("Olá "+nome+ " seu saldo atual é de: "+saldoFinal);
           }
           
           //mostrar informações gerais
         
           
           
           
}
       

}