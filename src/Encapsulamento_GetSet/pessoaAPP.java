/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_GetSet;
import javax.swing.JOptionPane;
/**
 *
 * @author laisl
 */
public class pessoaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa ("Lais", 12345);
        Pessoa pessoa2 = new Pessoa ("Maria", 12444);
        
       // usando o metodos get e set
       // conceitos de encapsulamento - todo metodo deve ser public
       
        
        System.out.println("O nome do cliente1 é "+pessoa1.getNome()+" "+pessoa1.getCpf());
        
        
        pessoa1.setNome("Joana");
        
        System.out.println("O novo nome do cliente1 é "+pessoa1.getNome());
        
        
        
    }
    
}
