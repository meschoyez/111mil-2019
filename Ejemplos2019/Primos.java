/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nro;
        boolean esPrimo = true;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un nro ");
        nro = teclado.nextInt();
        
/*        if (nro > 3) {
            if (nro % 2 == 0) {
                esPrimo = false;
            }
            else {
                for (int i = 3; i < nro; i+=2) {
                    if (nro % i == 0) {
                        esPrimo = false;
                    }
                }
            }
        }*/
        if (nro > 3) {
            if (nro % 2 == 0) {
                esPrimo = false;
            }
            else {
                int i = 3;
                while ((esPrimo) && (i < nro/2)) {
                    if (nro % i == 0) {
                        esPrimo = false;
                    }
                    i += 2;
                }
            }
        }
        if (esPrimo) {
            System.out.println("Es primo");
        }
        else {
            System.out.println("No es primo");
        }

    }
    
}
