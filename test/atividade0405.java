/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author Edimir
 */
public class atividade0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá Nome usuário! seja bem vindo“
        String nomeUsuario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá! informe seu nome: ");
        nomeUsuario = teclado.next();
        System.out.println("Olá "+ nomeUsuario+"!"+" seja bem vindo(a)!");
        
        //Crie um programa que calcule a média de um aluno para a matéria de matemática. 
        //O aluno deve informar seu nome e as quatro notas da matéria.
        
        double nota1, nota2, nota3,nota4, media,soma;
        System.out.println("Digite sua primeira nota:");
        nota1= teclado.nextDouble();
        System.out.println("Digite sua segunda nota:");
        nota2= teclado.nextDouble();
        System.out.println("Digite sua terceira nota:");
        nota3= teclado.nextDouble();
        System.out.println("Digite sua quarta nota:");
        nota4= teclado.nextDouble();
        soma = nota1+nota2+nota3+nota4;
        media = soma/4;
        System.out.println("Sua média em matemática é: " + media);
        
        //Crie um programa que exiba a tabuada de um número informado pelo usuário. 
        //(e; informo número 8. Imprima a tabuada do 8)
        
        double numero,mult1, mult2, mult3, mult4,mult5,mult6, mult7, mult8, mult9,mult10;
        System.out.println("Digite um numero:");
        numero= teclado.nextDouble();
        mult1= numero*1;
        mult2= numero*2;
        mult3= numero*3;
        mult4= numero*4;
        mult5= numero*5;
        mult6= numero*6;
        mult7= numero*7;
        mult8= numero*8;
        mult9= numero*9;
        mult10= numero*10;
        System.out.println("O número "+numero+" multiplicado por 1 "+"é = "+ mult1);
        System.out.println("O número "+numero+" multiplicado por 2 "+"é = "+ mult2);
        System.out.println("O número "+numero+" multiplicado por 3 "+"é = "+ mult3);
        System.out.println("O número "+numero+" multiplicado por 4 "+"é = "+ mult4);
        System.out.println("O número "+numero+" multiplicado por 5 "+"é = "+ mult5);
        System.out.println("O número "+numero+" multiplicado por 6 "+"é = "+ mult6);
        System.out.println("O número "+numero+" multiplicado por 7 "+"é = "+ mult7);
        System.out.println("O número "+numero+" multiplicado por 8 "+"é = "+ mult8);
        System.out.println("O número "+numero+" multiplicado por 9 "+"é = "+ mult9);
        System.out.println("O número "+numero+" multiplicado por 10 "+"é = "+ mult10);
        
        //Crie um programa para calcular os seguintes casos ( considerando entradas do usuário)
        //Triâgulo
        
         double base, altura, mult,area;
        System.out.println("Digite o valor da Base b:");
        base= teclado.nextDouble();
        System.out.println("Digite o valor da Altura h:");
        altura= teclado.nextDouble();
        mult= base*altura;
        area = mult/2;
        System.out.println("A Área para as medidas do triângulo informado é: " + area);
        
        //Quadrado
        
        double lado, area2;
        System.out.println("Digite o valor do Lado L:");
        lado= teclado.nextDouble();
        area2= Math.pow(lado,2);
        System.out.println("A Área para as medidas do quadrado informado é: " + area2);
        
        //Calculo do IMC
        
        double IMC, altura1, peso,pont;
        System.out.println("Digite o valor do seu peso em Kg:");
        peso= teclado.nextDouble();
        System.out.println("Digite o valor da Altura em m:");
        altura1= teclado.nextDouble();
        pont= Math.pow(altura1,2);
        IMC = peso/pont;
        System.out.println("Seu indice de massa corporal é: " + IMC);
        
        //Converta KM para Milhas
        
        double quilometros, milhas, valorKm;
        System.out.println("Digite a distância em Km:");
        quilometros= teclado.nextDouble();
        valorKm= 1.60934;
        milhas = quilometros /valorKm ;
        System.out.println("A quantidade de milhas em relação ao Km é: " + milhas);
        
        //Converter meses para dias.
        
        int meses, dias,qtd;
        System.out.println("Digite o numero de meses a serem convertidos em dias:");
        meses = (int) teclado.nextDouble();
        dias= 30;
        qtd = meses *dias ;
        System.out.println("A quantidade de dias que esses meses somados possuem é : " + qtd +" dias");
        
        
    }
    
}
