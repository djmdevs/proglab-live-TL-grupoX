/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.lab.live.tl.groupx;

import java.util.Scanner;

/**
 *
 * @author proBook
 */

//Esta classe chama todos os metodos da classe Calculadora
public class TestaCalculadora {
    
    
    public static void main(String[] args) {
        
        System.out.println("Bem vindo caro cliente"
                + "Escolha uma das opcoes da calculadora");
        
        //lendo dados via teclado
        Scanner teclado = new Scanner(System.in);
       
        
        int opcao =0;
        do{
            System.out.println("Escolha uma das opcoes da calculadora");
           opcao  =  teclado.nextInt();
            
            menu(opcao);
            
        }while(opcao!=7);
        
        
        
    }
    //metod do menu
    
    public static void menu(int opcao){
        
        double [] totais = new double [6-1];
        
        switch(opcao){
       
            case 1:  
                System.out.println("1.Adicao");
                //receber via teclado os valorres x e y
                double  soma = Calculadora.adicionar(3, 5);
                
                //armazenar num array
                totais[opcao-1] = soma;
                
                break;
                
            case 4:  
                System.out.println("4.Divisao");
                
                //receber via teclado os valorres x e y
                Calculadora.dividir(3, 5);
                break;
                
            case 6:  
               System.out.println("6.Imprimir Array");
               
                break;
        }
    
    }

    //contruir metodo que permite validar numeros
    public static double validarNumero(double numeroAvalidar, boolean condicaoDeValidacao, String mensagem){

            //"Incluam a logica desejada"
        return 0d; 
    }

}