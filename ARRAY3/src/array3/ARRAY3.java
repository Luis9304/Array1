/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array3;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class ARRAY3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
                
    }
    
}
