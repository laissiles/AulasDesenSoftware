/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Códigos_Iniciais;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author laisl
 */
public class ArrayLits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //definindo a array de nomes do tipo "lista"
        ArrayList<String> Nomes = new ArrayList<>();

        //pedindo pro usuário quantos nomes deseja digitar, e convertendo para int
        //pois qualquer entrada deste tipo o sistema considera "STRING"
        int qtaNome = Integer.parseInt(showInputDialog(null, "Quantos nomes vc quer digitar?"));

        //lendo e adicionando elementos na lista//        
        for (int i = 0; i < qtaNome; i++) {
//         
            // pedindo pro usuário digitar os nomes, lembrando que toda entrada de dados é do tipo String
            Nomes.add(showInputDialog(null,
                    String.format("Digite o %d º nome", i+1)));                           
                   }
        
       String mensagemFinal = "";
        for (int i = 0; i < Nomes.size(); i++) {
//            showMessageDialog(null, Nomes.get(i));
            mensagemFinal = mensagemFinal + Nomes.get(i) + ", ";
            //System.out.println(Nomes.get(i));
        }
        
        showMessageDialog(null, mensagemFinal);
    }

}
