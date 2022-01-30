package Test;
import java.util.Random;
/*
1. Design a program that fills a 50 integer array of information and, once finished, calculates the addition of all elements
 */
public class Ejer01 {
    public static void main (String []args){
        Random claseRandom = new Random();
        int[] vectorEnteros = new int[50];
        int suma = 0;
        for(int i=0;i<50;i++){
            vectorEnteros[i] = claseRandom.nextInt(100);
            System.out.println("El número que contiene la posición "+ i +" es el "+vectorEnteros[i]);
            suma = suma + vectorEnteros[i];
        }
        System.out.println("El valor total del contenido del vector es: " +suma);
    }
}