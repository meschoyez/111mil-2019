import java.util.Scanner;

public class MayorDeTres {
    public static void main (String[] args) {
        int x, y, z, mayor;
    
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor 1: ");
        x = teclado.nextInt();
        System.out.print("Valor 2: ");
        y = teclado.nextInt();
        System.out.print("Valor 3: ");
        z = teclado.nextInt();

        mayor = x;
        if (mayor < y) {
            mayor = y;
        }
        if (mayor < z) {
            mayor = z;
        }
        System.out.println("El mayor es " + mayor);

    }
}
