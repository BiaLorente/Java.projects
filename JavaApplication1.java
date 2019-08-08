/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 18071597
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cria um objeto calculadora e o armazena na variavel "
       //Calculadora calculadora = new Calculadora();
        
       Scanner sc = new Scanner(System.in);
       int x,y,resultado = 0;
       char operador;
System.out.println("Digite o primero numero:");
       x= sc.nextInt();
System.out.println("Digite o segundo numero:");
       y= sc.nextInt();

       System.out.println("Digite o operador:");
       operador= sc.next().charAt(0);
       if(operador=='+')
       {
           resultado=x+y;
       System.out.println(resultado);
       }
 
        if(operador=='-')
        {     resultado=x-y;
       System.out.println(resultado);   
        }
        
        if(operador=='*')
        {     resultado=x*y;
       System.out.println(resultado);   
        }
        
       if(operador=='/')
        {     resultado=x/y;
       System.out.println(resultado);   
        }  
    }
}
