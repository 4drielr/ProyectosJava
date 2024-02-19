/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevaactividad;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author DAW TARDE
 */
public class NuevaActividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

       /* for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        */
           int matriz[][]= {{1, 2, 3}, {4,5,6},{7,8,9}};

       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
System.out.print("\n");
        }
       
       
       String arrayString[][] = {{"uno", "dos"}, {"tres", "cuatro"}};
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                 if((i+j)%2 ==0){
                    System.out.println(arrayString[i][j] + " ");
                }
                
            }
        }
        Random random = new Random();
        int matrizAleatoria[][] = new int[4][3];
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                matrizAleatoria[i][j]=random.nextInt(100)+1;
                
            }
        }
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                System.out.print(matrizAleatoria[i][j] + " ");      
            } System.out.print("\n");
        }
        
        int matriz3[][]= {{1, 2, 3,4}, {5,6,7,8},{9,10,11,12}};
        
        for (int i = 0; i < matriz3.length; i++) {
            int suma=0;
            for (int j = 0; j < matriz3[i].length; j++) {
                suma+=matriz3[i][j];
            }
            System.out.println(suma);
        }
    }

    /*
    // TODO code application logic here
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        // System.out.println(matriz[0].length);
       
    // Recorrer elemento a elemento
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][2] + "");
                break;
            }
System.out.print("\n");
        }
         
        // Mostrar elementos de la tercera columna
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][2] + "");
        }
         
        // Mostrar elementos de la primera fila
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(matriz[0][i] + "");
        }
    }*/
    
    //1 Crea una matriz de enteros de 3x3 e imprímela en la consola
    
    int matriz[][]= {{1, 2, 3}, {4,5,6},{7,8,9}};
    
}