/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro_classes;

import java.util.Scanner;

/**
 *
 * @author laisl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        cachorro1 cachorro = new  cachorro1();
        cachorro.nome = "Rex";
        cachorro.peso = 22;
        cachorro.corOlhos = "amarelo";        
        cachorro.quantPatas = 3;
        
         
         cachorro1 cachorro2 = new  cachorro1();
        cachorro2.nome = "Rex";
        cachorro2.peso = 22;
        cachorro2.corOlhos = "amarelo";        
        cachorro2.quantPatas = 3;
         
        cachorro1 cachorro3 = new  cachorro1();
        cachorro3.nome = "Bob";
        cachorro3.peso = 13;
        cachorro3.corOlhos = "marrom";       
        cachorro3.quantPatas = 4;
        
        System.out.println("dados cachorro 1: "+cachorro.nome);
        System.out.println("peso do cão "+cachorro.peso);
 
        
        
        cachorro.latir();
        
        System.out.println("-------------------------------------------------------");
        
        
 System.out.println("Oi, iniciando...");
 
 banco c1 = new banco();
 
 c1.cadastrarConta(500178,"BBrasil","Anderson Silva");
 
 System.out.println("Saldo: " + c1.obterSaldo());
 
 c1.depositar(3000);

 System.out.println("Saldo: " + c1.obterSaldo());

 c1.sacar(80);
 
 System.out.println("Saldo: " + c1.obterSaldo());
 
 if (! c1.sacar(3000))
 System.out.println("Saldo Insuficiente.");

 System.out.println("Saldo: " + c1.obterSaldo());
        
    }
    }
    
