import java.util.Scanner;

/* Nombres de variables: Reglas
 * 1: Debe comenzar con letra o "_"
 * 2: A partir del segundo caracter puedo usar
 *    letras, dígitos o "_"
 * */

// Tabulación -> Indentación

public class Sumar {
    public static void main (String[] args) {
        int edad1, edad2;
        String nombre1, nombre2;
    
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese nombre de la primer persona: ");
        nombre1 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese nombre de la segunda persona: ");
        nombre2 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad2 = teclado.nextInt();

        if (edad1 == edad2) {
            System.out.println("Tienen la misma edad");
        }
        else {
            System.out.print("El mas joven es ");
            if (edad1 > edad2) {
                System.out.println(nombre2);
            }
            else {   
                System.out.println(nombre1);
            }
        }

/*        if (edad1 > edad2) {
            System.out.print("El mas joven es ");
            System.out.println(nombre2);
        }
        else {
            if (edad1 == edad2) {
                System.out.println("Tienen la misma edad");
            }
            else {   
                System.out.print("El mas joven es ");
                System.out.println(nombre1);
            }
        }
*/
    }
}
