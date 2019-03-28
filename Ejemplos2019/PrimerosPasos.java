/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeropasos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class PrimeroPasos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int capacidad, cantidad, recipientes, sobrante;
    
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Capacidad recipiente? ");
            capacidad = teclado.nextInt();
            System.out.print("Cantidad del producto? ");
            cantidad = teclado.nextInt();
        
            recipientes = cantidad / capacidad;
            sobrante =    cantidad % capacidad;     
            System.out.println("Se necesita " + recipientes +
                          " recipientes y sobra " + sobrante);
        }
        catch (InputMismatchException e) {
            System.out.println("Ingreso dato erroneo");
        }
        catch (ArithmeticException e) {
            System.out.println("No se puede realizar el calculo: " + e);
        }


/*        if (capacidad != 0) {
            recipientes = cantidad / capacidad;
            sobrante =    cantidad % capacidad;     
            System.out.println("Se necesita " + recipientes +
                          " recipientes y sobra " + sobrante);
        }
        else {
            System.out.println("Capacidad incorrecta");
        }
*/
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
