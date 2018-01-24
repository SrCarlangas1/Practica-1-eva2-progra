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
public class Ejercicio6 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[], b[], c[];
        a=new int[12];
        b=new int[12];
        c = new int [24];
        int i,j;

        // leemos la tabla a
        System.out.println("Leyendo la tabla a");
        for (i=0;i<12;i++){
        System.out.print("número: ");
        a[i]=sc.nextInt();
        }
        // leemos la tabla b
        System.out.println("Leyendo la tabla b");
        for (i=0;i<12;i++){
        System.out.print("número: ");
        b[i]=sc.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        j=0;
        i=0;
        
        while (i<12)
        {
        // copiamos 3 de a
        for (int k=0;k<3; k++)
        {
        c[j]=a[i+k];
        j++;
        }
        // copiamos 3 de b
        for (int k=0;k<3;k++)
        {
        c[j]=b[i+k];
        j++;
        }
        // como hemos copiado 3 de a y b, incrementamos la i en 3.
        i+=3;
        // la j se incrementa cada vez que se añade un elemento a la tabla c.
        }
        System.out.println("La tabla c queda: ");
        for (j=0;j<24;j++) // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
        System.out.print(c[j]+" ");
        System.out.println("");
}
}