package practica1;

import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int pos = 0, neg = 0, cero = 0;  //contadores para positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0;  //suma de positivos y negativos
        int sumacero;
        sumacero = 0;
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 5; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        //se recorre el array para sumar positivos y negativos
        for (i = 0; i < 5; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            } else{ //sumar los ceros
                cero++;
            }
        }
        //mostrar resultados
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido números negativos");
        }
        if (cero !=0){
            System.out.println("Has introducido: " + cero);
        }
    }
}
