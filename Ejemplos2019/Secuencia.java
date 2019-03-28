/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencia;

import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class Secuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estructura de control for
        Scanner teclado = new Scanner(System.in);
        int x, mayor = 0, cant, valor;
        
        System.out.print("Cantidad datos? ");
        cant = teclado.nextInt();
        if (cant > 0) {
            System.out.print("Ingrese valor: ");
            valor = teclado.nextInt();
            mayor = valor;
            
            x = 1;
            while (x < cant) {
                System.out.print("Ingrese valor: ");
                valor = teclado.nextInt();
                if (mayor < valor) {
                    mayor = valor;
                }
                x += 1;
            }
            System.out.println("El mayor es " + mayor);
        }
        else {
            System.out.println("No hay datos para procesar");
        }
    }
    
}
