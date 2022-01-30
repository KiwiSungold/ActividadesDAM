/*
2. Design a program that, with the array of the previous problem, fills it in with information and then calculates the addition of all elements that are placed in a even position and the addition of the elements in an odd position
 */
package Test;

import java.util.Random;

public class Ejer02 {
     public static void main (String []args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[50];
        int sumPares = 0;
        int sumImpares = 0;
        for(int i=0;i<50;i++){
            vectorEnteros[i] = claseRandom.nextInt(100);
            if (i%2==0){
                sumPares = sumPares + vectorEnteros[i];
                System.out.println("El número que contiene la posición "+ i +" es el "+vectorEnteros[i]);
            } else{
                sumImpares = sumImpares + vectorEnteros[i];
                System.out.println("El número que contiene la posición "+ i +" es el "+vectorEnteros[i]);
            } 
        }
        System.out.println("El valor de las posiciones pares es: " +sumPares+ " y el de los impares es: "+sumImpares);
    }
}