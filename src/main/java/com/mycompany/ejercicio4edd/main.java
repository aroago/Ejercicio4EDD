/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4edd;

import java.util.Scanner;

/**
 *
 * @author aroa
 */
public class main {

    /**
     * @param args this program contains conditionals.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;	
		System.out.println("Introduce un numero entero: ");
                Scanner teclado=new Scanner(System.in);
		n=teclado.nextInt();
		
		if(n<0){
                    System.out.println("NEGATIVO");
                }else{
                    System.out.println("POSITIVO");
                }
    }
    
}
