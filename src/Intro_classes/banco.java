/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro_classes;

/**
 *
 * @author laisl
 */
public class banco {
    
    
    // Atributos
 
 int numeroConta;
 String nomeBanco;
 String nomeCliente;
 float saldo;
 
 // Métodos

 public void cadastrarConta(int nConta, String nBanco, String nCliente) 
 {
 numeroConta = nConta;
 nomeBanco = nBanco;
 nomeCliente = nCliente;
 }
 
 public void depositar(int valor){
 if (valor > 0){
 saldo += valor; 
 }
 }
 
 public boolean sacar(float valor) {
 if (saldo >= valor) {
 saldo -= valor;
 return true;
 }
 return false;
 }
 
 public void atualizarNomeCliente(String nCliente)
 {
 nomeCliente = nCliente;
 }
 
 public void atualizarBanco(String nBanco)
 {
 nomeBanco = nBanco;
 }
 
 public void atualizarNumeroConta(int numConta)
 {
 numeroConta = numConta;
 }

 public float obterSaldo()
 {
 return saldo;
 }
 
}


    
    

