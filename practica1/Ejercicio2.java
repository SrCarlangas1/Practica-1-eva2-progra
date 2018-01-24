/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author infor12
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        
       for(int i=0;i<5;i++)
       {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa un numero: ");
            numeros[i] = sc.nextInt();
       }
       System.out.println("Los numeros són");
       for (int i = 5 - 1; i >= 0 ; i--) 
       {
            System.out.println(numeros[i]);
       }
    }  
}
