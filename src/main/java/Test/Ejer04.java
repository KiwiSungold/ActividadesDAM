/*
4. Design a program with an array of 20 elements that stores values ​​corresponding to the qualifications of a certain subject. It must calculate the average mark. The marks will be integer values
 */
package Test;

import java.util.Random;

public class Ejer04 {
    public static void main (String[]args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[20];
        int mediaNotas = 0;
        for (int i=0;i<vectorEnteros.length;i++){
            vectorEnteros[i] = claseRandom.nextInt(10);
            mediaNotas = mediaNotas + vectorEnteros[i];
            System.out.println("La nota almacenada en la posición: "+i+" es "+vectorEnteros[i]);
        }
        System.out.println("La media de las notas es: " +mediaNotas/vectorEnteros.length);
    }
}
