/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticion;

import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class Repeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, mult = 1;
        
        System.out.print("Ingrese nros a multiplicar, 0 para terminar: ");
        valor = teclado.nextInt();
        // Fuera de rango ((valor < 0) || (valor > 100))
        //               !((0 <= valor) && (valor <= 100))
        while (valor != 0) {
            mult = mult * valor;
            System.out.print("Otro nro: ");
            valor = teclado.nextInt();
        }
        
        System.out.println("El resultado es " + mult);
    }
    
}
