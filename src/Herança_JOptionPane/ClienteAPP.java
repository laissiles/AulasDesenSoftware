/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_JOptionPane;
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
        Scanner ler = new Scanner(System.in);
        
        
        ClientePF cliente1 = new ClientePF("", "",0);
        
        cliente1.setNome("");
        cliente1.setEndereco("");
        cliente1.setCpf(0);
        
        cliente1.getCpf();
        
        
        
        
    }
    
}
