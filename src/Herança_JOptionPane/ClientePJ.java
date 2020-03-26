/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_JOptionPane;

/**
 *
 * @author laisl
 */
public class ClientePJ extends Cliente {
    
    private int CNPJ;

    
    public ClientePJ(String nome, String endereco, int CNPJ) {
        super(nome, endereco);
        this.CNPJ = CNPJ;
               
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    
    
}
