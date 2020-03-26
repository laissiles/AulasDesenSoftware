/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;
import Herança_JOptionPane.ClientePF;
import java.util.Scanner;
/**
 *
 * @author laisl
 */
public class ClienteAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        ClientePF cliente1 = new ClientePF("Lais", "rua mooca",12345);
        
      
        System.out.println("Nome do cliente: "+  cliente1.getNome());
        
        
    }
    
}
