/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class ARRAY2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[5];
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        System.out.println("\nLa suma de los números es: " + suma);
        
    }
    
}
