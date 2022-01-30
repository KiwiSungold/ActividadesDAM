/*
3. Design a program with a 100 elements array, fills it in with information and does the addition of all the elements whose position is a 3 multiple.
 */
package Test;

import java.util.Random;

public class Ejer03 {
    public static void main (String []args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[100];
        int sumMultiples = 0;
            for(int i=0;i<100;i++){
                vectorEnteros[i] = claseRandom.nextInt(100);
                if (i%3==0){
                    sumMultiples = sumMultiples+vectorEnteros[i];
                }
                System.out.println("El número que contiene la posición "+ i +" es el "+vectorEnteros[i]);
            }
        System.out.println("El valor total de las posiciones múltiples de 3 es: " +sumMultiples);
    }
}
