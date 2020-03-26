package Códigos_Iniciais;


import static javax.swing.JOptionPane.*;



public class FrutaComMetodo {
    
    //itens que serão usados por mais de um metodo e que precisam ser publicos  PRA TODOS  
     
 static String fruta[];//Inicializando o vetor     

     //para cadastrar frutas, primeiro eu preciso saber quantas eu vou cadastrar, por isso
     //o int quantidade como paramentro
     //void -  não tem retorno, apenas faz uma ação
     
     //1º metodo
     
      public static void cadastrar_fruta(int quantidade){ // esse int quantidade é referente ao nosso metodo
        // o que eu preciso pra armazenar os dados? O VETOR
       fruta = new String[quantidade];      
        //o que eu preciso pra preencher o vetor? UM FOR
         for (int i = 0; i < quantidade; i++) {
              fruta[i] = showInputDialog(null,String.format("Digite a %d º fruta", i+1)
                        );
             
         }  
             
    }      //2º PRECISO MOSTRAR O VETOR
    
    public static void mostrar_fruta(int mostra){
        
         String mensagemFinal = "";
        for (int i = 0; i <fruta.length; i++) {
//           
            mensagemFinal = mensagemFinal + fruta[i] + ", ";
           
        }        
        showMessageDialog(null, mensagemFinal);}
    
    
    
      public static void main(String[] args) {
         
         
        int qta;
           
        //vamos pedir pro usuário quantas frutas ele deseja cadastrar//
        
     qta = Integer.parseInt(showInputDialog(null, "Quantas frutas vc quer digitar?"));
     
     
     
          cadastrar_fruta(qta);
          mostrar_fruta(qta);
         }
}

