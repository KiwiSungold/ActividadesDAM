/*
5. Design a program that, with the previous vector, indicates how many qualifications correspond to a "Notable".
 */
package Test;

import java.util.Random;

public class Ejer05 {
    public static void main (String[]args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[20];
        int contadorNotables = 0;
        for (int i=0;i<vectorEnteros.length;i++){
            vectorEnteros[i] = claseRandom.nextInt(10);
            if (vectorEnteros[i]>=7 && vectorEnteros[i]<9){
                contadorNotables ++;
            }
            System.out.println("La nota nº "+(i+1)+" es "+vectorEnteros[i]);
        }
        System.out.println("La cantidad de notables es: " +contadorNotables);
    }
}
