/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array4;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class ARRAY4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 6 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        System.out.println("\nArray invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }
        
    }
    
}
