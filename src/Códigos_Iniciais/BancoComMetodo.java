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
public class BancoComMetodo {

    static float saldo;
    static float valorDeposito;
    static float saldoFinal;
    static float valorSaque;
    
    
    static float preco;
    
    

    static float deposito(float valor) {
        saldo = valorDeposito + saldo;
        return saldo;

    }

    static void saldoFinal(float saldo, float saque) {
        if (saldo == 0) {
            System.out.println("Voce não tem saldo suficiente para sacar");
        } else {
            saldoFinal = saldo - valorSaque;
            System.out.println("seu saldo é " + saldoFinal);

        }

       

    }
       
     static float compra(float valor) {
        saldo = preco*2;
        return saldo;
    }

    public static void main(String[] args) {

        String nome;
        int rg;

        Scanner teclado = new Scanner(System.in);

        //informações dos clientes
        /*System.out.println("Olá, informe seu nome: ");
        nome = teclado.next();
        System.out.println("Informe seu RG: ");
        rg = teclado.nextInt();
        System.out.println("Deseja depositar quanto? ");
        valorDeposito = teclado.nextFloat();
        System.out.println("Deseja Sacar quanto? ");
        valorSaque = teclado.nextFloat();*/
        
        
         System.out.println("qual o valor do livro que está comprando? ");
        preco = teclado.nextFloat();
        System.out.println("Seu valor final é");
        
        compra(preco);
        
        /*deposito(valorDeposito);
        saldoFinal(valorDeposito, valorSaque);*/

    }
}
