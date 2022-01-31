/*
6. Design a program with an array of 20 elements that stores integer values. 
It must calculate how many numbers are equal or smaller than 25 and the average and the minimum of these numbers.
 */
package Test;

import java.util.Random;

public class Ejer06 {
    public static void main (String [] args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[20];
        int menoresVeinticinco = 0;
        int valorMenor = 50;
        int valorMedia = 0;
        for (int i=0; i<vectorEnteros.length;i++){
            vectorEnteros[i] = claseRandom.nextInt(50);
            if (vectorEnteros[i]<=25){
                menoresVeinticinco ++;
                valorMedia = valorMedia+vectorEnteros[i];
                if (valorMenor>vectorEnteros[i]){
                    valorMenor = vectorEnteros[i];
                }
            }
            System.out.println("El valor añadido en la posición "+i+" es el: "+vectorEnteros[i]);
        }
        System.out.println("La media de los valores menores o iguales a 25 es: " +valorMedia/menoresVeinticinco);
        System.out.println("El valor menor es " +valorMenor);
        System.out.println("Cantidad valores menores o iguales a 25: " +menoresVeinticinco);
    }
}